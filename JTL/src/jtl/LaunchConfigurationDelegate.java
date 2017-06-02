package jtl;


import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import jtl.handlers.RegisterMetamodel;

public class LaunchConfigurationDelegate
		implements ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration,
					   String mode,
					   ILaunch launch,
					   IProgressMonitor monitor)
			throws CoreException {

		// Source Metamodel
		IFile sourcemmFile = AbstractJTLLauncher.getIFileFromURI(configuration
				.getAttribute(LaunchConfigurationAttributes.SOURCEMM_TEXT, ""));

		// Target metamodel
		IFile targetmmFile = AbstractJTLLauncher.getIFileFromURI(configuration
				.getAttribute(LaunchConfigurationAttributes.TARGETMM_TEXT, ""));

		// Source model
		IFile sourcemFile = AbstractJTLLauncher.getIFileFromURI(configuration
				.getAttribute(LaunchConfigurationAttributes.SOURCEM_TEXT, ""));

		// Target models folder
		String targetmFolder = configuration
				.getAttribute(LaunchConfigurationAttributes.TARGETM_TEXT, "");

		// Transformation
		IFile transfFile = AbstractJTLLauncher.getIFileFromURI(configuration
				.getAttribute(LaunchConfigurationAttributes.TRANSF_TEXT, ""));

		// Traces
		IFile tracesFile = null;
		if (configuration.getAttribute(LaunchConfigurationAttributes.TRACE_CHECK, false)) {
			tracesFile = AbstractJTLLauncher.getIFileFromURI(configuration
					.getAttribute(LaunchConfigurationAttributes.TRACE_TEXT, ""));
		}

		// Register the metamodels
		RegisterMetamodel.registerMetamodel(sourcemmFile);
		RegisterMetamodel.registerMetamodel(targetmmFile);

		// Dispatch execution to specific launchers:
		AbstractJTLLauncher launcher;
		if (transfFile.getFileExtension().equals("dl")) {
			// Launch the ASP transformation file directly
			launcher = new JTLASPLauncher();
		} else if (sourcemmFile.equals(targetmmFile)) {
			// Endogenous transformation
			launcher = new JTLEndogenousLauncher();
		} else {
			// Exogenous transformation
			launcher = new JTLExogenousLauncher();
		}

		// Launch
		launcher.launch(sourcemmFile, targetmmFile, sourcemFile, targetmFolder, transfFile, tracesFile);
	}
}
