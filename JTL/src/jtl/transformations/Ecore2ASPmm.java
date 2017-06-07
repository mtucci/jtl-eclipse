package jtl.transformations;

import java.io.File;
import java.io.IOException;

import org.eclipse.m2m.atl.core.ATLCoreException;

public class Ecore2ASPmm {

	public static String runTransformation(final File file)
			throws IOException, ATLCoreException {

		// File path
		final String path = file.getPath();

		// Generate the target filename
		final String targetFile = path.substring(
				0, path.lastIndexOf(".ecore")) + ".aspmm.ecore";

		// Register the ASPmm metamodel
		RegisterMetamodel.registerMetamodel(new File(
				new it.univaq.jtl.atl.ecore2aspmm.Ecore2ASPmm()
					.getMetamodelUri("ASPmm")));

		// Perform the transformation (Ecore to ASPmm)
		it.univaq.jtl.atl.ecore2aspmm.Ecore2ASPmm.main(new String[] {
				path,
				targetFile
		});

		return targetFile;
	}
}
