package jtl.eclipse;

public class ASPExogenousTraceabilityLauncher extends jtl.launcher.ASPExogenousTraceabilityLauncher {

	public ASPExogenousTraceabilityLauncher(
			String leftmmFile,
			String rightmmFile,
			String leftmFile,
			String rightmFile,
			String transfFile,
			String traceFile) {
		super(leftmmFile, rightmmFile, leftmFile, rightmFile, transfFile, traceFile);
		launcher = new jtl.eclipse.ASPExogenousLauncher(
				leftmmFile, rightmmFile, leftmFile, rightmFile, transfFile);
	}

	/**
	 * Override the generateTransformation method just to
	 * replace the relative file path with the absolute one.
	 * @param targetmmName name of the target metamodel
	 */
	@Override
	protected void generateTransformation(final String targetmmName) {
		// Replace the relative file path with the absolute one
		final String transfFileRelative = launcher.getTransfFile();
		launcher.setTransfFile(
				AbstractEclipseJTLLauncher.getAbsolutePath(transfFileRelative));

		launcher.generateTransformation(targetmmName);

		// Restore the original path
		launcher.setTransfFile(transfFileRelative);
	}
}
