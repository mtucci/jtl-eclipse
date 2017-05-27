/*******************************************************************************
 * Copyright (c) 2010, 2012 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package it.univaq.jtl.atl.aspm2mm;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.StreamHandler;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.m2m.atl.common.ATLExecutionException;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.IExtractor;
import org.eclipse.m2m.atl.core.IInjector;
import org.eclipse.m2m.atl.core.IModel;
import org.eclipse.m2m.atl.core.IReferenceModel;
import org.eclipse.m2m.atl.core.ModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.compiler.AtlCompiler;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

/**
 * Entry point of the 'ASPm2MMGenerator' transformation module.
 */
public class ASPm2MMGenerator {

	/**
	 * The property file. Stores module list, the metamodel and library locations.
	 * @generated
	 */
	private Properties properties;

	/**
	 * The IN model.
	 * @generated
	 */
	protected IModel inModel;

	protected IModel outModel;

	protected InputStream generated;

	protected String mmOut;
	protected String mmOutName;

	/**
	 * The main method.
	 *
	 * @param args
	 *            are the arguments
	 * @generated
	 */
	public static void main(String[] args) {
		try {
			if (args.length < 3) {
				System.out.println("Arguments not valid : {OUT_metamodel_path, IN_model_path, OUT_model_oath}.");
			} else {
				ASPm2MMGenerator runner = new ASPm2MMGenerator();
				runner.loadModels(args[0]);
				runner.mmOut = args[0];

				// The generated transformation

				// Since ATL is printing the generated transformation
                // to Standard Error we need to intercept it adding
                // a handler to the logger registered by ATL
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                Logger logger = Logger.getLogger("org.eclipse.m2m.atl");
                logger.setUseParentHandlers(false);
                Handler handler = new StreamHandler(baos, new SimpleFormatter());
                logger.addHandler(handler);
                PrintStream err = System.err;
                System.setErr(new PrintStream(new ByteArrayOutputStream()));

                // Run the HOT
                runner.doASPm2MMGenerator(new NullProgressMonitor());

                // Flush the handler before we can use the OutputStream
                handler.flush();

                // Remove log output in order to keep only the generated transformation
                runner.generated = new ByteArrayInputStream(baos.toString().replaceFirst("(?s).+?(?=--)", "").getBytes());

                // Unregister the handler
                handler.setLevel(Level.OFF);
                logger.removeHandler(handler);
                System.setErr(err);

				// Detect the root element in the input metamodel
				// in order to get the URI for the injector
				EObject mmRoot = new ResourceSetImpl().getResource(URI.createURI(args[0]), true).getContents().get(0);
				EStructuralFeature name = mmRoot.eClass().getEStructuralFeature("name");
				runner.mmOutName = mmRoot.eGet(name).toString();

				// Load the models to apply the generated transformation
				runner.genLoadModels(args[1]);

				// Launch the generated transformation
				runner.doASPm2MM(new NullProgressMonitor());

				// Save the target model of the generated transformation
				runner.saveModels(args[2]);
			}
		} catch (ATLCoreException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ATLExecutionException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Constructor.
	 *
	 * @generated
	 */
	public ASPm2MMGenerator() throws IOException {
		properties = new Properties();
		properties.load(getFileURL("ASPm2MMGenerator.properties").openStream());
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
	}

	/**
	 * Load the input and input/output models, initialize output models.
	 *
	 * @param inModelPath
	 *            the IN model path
	 * @throws ATLCoreException
	 *             if a problem occurs while loading models
	 *
	 * @generated
	 */
	public void loadModels(String inModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
		IReferenceModel ecoreMetamodel = factory.getMetametamodel();
		this.inModel = factory.newModel(ecoreMetamodel);
		injector.inject(inModel, inModelPath);
	}

	public void genLoadModels(String inModelPath) throws ATLCoreException {
		ModelFactory factory = new EMFModelFactory();
		IInjector injector = new EMFInjector();
		IReferenceModel mmMetamodel = factory.newReferenceModel();
		injector.inject(mmMetamodel, this.mmOut);
		IReferenceModel aspmMetamodel = factory.newReferenceModel();
		injector.inject(aspmMetamodel, getMetamodelUri("ASPm"));
		this.inModel = factory.newModel(aspmMetamodel);
		injector.inject(inModel, inModelPath);
		this.outModel = factory.newModel(mmMetamodel);
	}

	public void saveModels(String outModelPath) throws ATLCoreException {
		IExtractor extractor = new EMFExtractor();
		extractor.extract(outModel, outModelPath);
	}

	/**
	 * Transform the models.
	 *
	 * @param monitor
	 *            the progress monitor
	 * @throws ATLCoreException
	 *             if an error occurs during models handling
	 * @throws IOException
	 *             if a module cannot be read
	 * @throws ATLExecutionException
	 *             if an error occurs during the execution
	 *
	 * @generated
	 */
	public Object doASPm2MMGenerator(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		Map<String, Object> launcherOptions = getOptions();
		launcher.initialize(launcherOptions);
		launcher.addInModel(inModel, "IN", "ECORE");
		return launcher.launch("run", monitor, launcherOptions, (Object[]) getModulesList());
	}

	public Object doASPm2MM(IProgressMonitor monitor) throws ATLCoreException, IOException, ATLExecutionException {
		ILauncher launcher = new EMFVMLauncher();
		launcher.initialize(new HashMap<String,Object>());
		launcher.addInModel(inModel, "IN", "ASPm");
		launcher.addOutModel(outModel, "OUT", this.mmOutName);

		// Compile the generated transformation
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		AtlCompiler.compile(this.generated, out);
		ByteArrayInputStream asm = new ByteArrayInputStream(out.toByteArray());

		return launcher.launch("run", monitor, new HashMap<String,Object>(), new Object[]{asm});
	}

	/**
	 * Returns an Array of the module input streams, parameterized by the
	 * property file.
	 *
	 * @return an Array of the module input streams
	 * @throws IOException
	 *             if a module cannot be read
	 *
	 * @generated
	 */
	protected InputStream[] getModulesList() throws IOException {
		InputStream[] modules = null;
		String modulesList = properties.getProperty("ASPm2MMGenerator.modules");
		if (modulesList != null) {
			String[] moduleNames = modulesList.split(",");
			modules = new InputStream[moduleNames.length];
			for (int i = 0; i < moduleNames.length; i++) {
				String asmModulePath = new Path(moduleNames[i].trim()).removeFileExtension().addFileExtension("asm").toString();
				modules[i] = getFileURL(asmModulePath).openStream();
			}
		}
		return modules;
	}

	/**
	 * Returns the URI of the given metamodel, parameterized from the property file.
	 *
	 * @param metamodelName
	 *            the metamodel name
	 * @return the metamodel URI
	 *
	 * @generated
	 */
	protected String getMetamodelUri(String metamodelName) {
		String uriString = properties.getProperty("ASPm2MMGenerator.metamodels." + metamodelName);
		if (new EMFModelFactory().getResourceSet().getResource(URI.createURI(uriString), false) == null) {
			return uriString.replaceFirst("platform:/plugin", "..");
		}
		return uriString;
	}

	/**
	 * Returns the file name of the given library, parameterized from the property file.
	 *
	 * @param libraryName
	 *            the library name
	 * @return the library file name
	 *
	 * @generated
	 */
	protected InputStream getLibraryAsStream(String libraryName) throws IOException {
		return getFileURL(properties.getProperty("ASPm2MMGenerator.libraries." + libraryName)).openStream();
	}

	/**
	 * Returns the options map, parameterized from the property file.
	 *
	 * @return the options map
	 *
	 * @generated
	 */
	protected Map<String, Object> getOptions() {
		Map<String, Object> options = new HashMap<String, Object>();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			if (entry.getKey().toString().startsWith("ASPm2MMGenerator.options.")) {
				options.put(entry.getKey().toString().replaceFirst("ASPm2MMGenerator.options.", ""),
				entry.getValue().toString());
			}
		}
		return options;
	}

	/**
	 * Finds the file in the plug-in. Returns the file URL.
	 *
	 * @param fileName
	 *            the file name
	 * @return the file URL
	 * @throws IOException
	 *             if the file doesn't exist
	 *
	 * @generated
	 */
	protected static URL getFileURL(String fileName) throws IOException {
		final URL fileURL;
		if (isEclipseRunning()) {
			URL resourceURL = ASPm2MMGenerator.class.getResource(fileName);
			if (resourceURL != null) {
				fileURL = FileLocator.toFileURL(resourceURL);
			} else {
				fileURL = null;
			}
		} else {
			fileURL = ASPm2MMGenerator.class.getResource(fileName);
		}
		if (fileURL == null) {
			throw new IOException("'" + fileName + "' not found");
		} else {
			return fileURL;
		}
	}

	/**
	 * Tests if eclipse is running.
	 *
	 * @return <code>true</code> if eclipse is running
	 *
	 * @generated
	 */
	public static boolean isEclipseRunning() {
		try {
			return Platform.isRunning();
		} catch (Throwable exception) {
			// Assume that we aren't running.
		}
		return false;
	}
}
