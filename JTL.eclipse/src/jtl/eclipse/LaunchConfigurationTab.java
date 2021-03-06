package jtl.eclipse;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ResourceListSelectionDialog;

public class LaunchConfigurationTab extends AbstractLaunchConfigurationTab {

	/** Logger */
	private static Logger logger = LogManager.getLogger(LaunchConfigurationTab.class);

	private Text sourcemmText;
	private Text targetmmText;
	private Text sourcemText;
	private Text targetmText;
	private Text transfText;
	private Spinner limitSpinner;
	private Button tracesCheck;
	private Text tracesText;
	private Button chainCheck;
	private Combo chainCombo;
	private Spinner chainLimitSpinner;
	private ArrayList<Control> tracesControls = new ArrayList<Control>();
	private ArrayList<Control> chainControls = new ArrayList<Control>();


	@Override
	public void createControl(Composite parent) {

		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);

        comp.setLayout(new GridLayout());
        comp.setFont(parent.getFont());

        // Create a listener for user modifications of text fields
        ModifyListener modTextListener = new ModifyListener() {
            @Override
            public void modifyText(ModifyEvent e) {
                updateLaunchConfigurationDialog();
        	}
        };

        // Metamodels selection form
        // Group
        Group metamodelsGroup = new Group(comp, SWT.NONE);
        metamodelsGroup.setFont(comp.getFont());
        metamodelsGroup.setLayout(new GridLayout(3, false));
        metamodelsGroup.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        metamodelsGroup.setText("Metamodels");

        // Source metamodel
        new Label(metamodelsGroup, SWT.NONE).setText("Source:");
        sourcemmText = new Text(metamodelsGroup, SWT.BORDER);
        sourcemmText.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        sourcemmText.addModifyListener(modTextListener);
        //sourcemmText.addModifyListener(new ModifyListener() {
        Button sourcemmButton = new Button(metamodelsGroup, SWT.PUSH);
        sourcemmButton.setText("Browse...");
        sourcemmButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        		sourcemmText.setText(selectResource(
                        "Select a resource as the source metamodel",
        				IResource.FILE));
        		updateLaunchConfigurationDialog();
        	}
        });

        // Target metamodel
        new Label(metamodelsGroup, SWT.NONE).setText("Target:");
        targetmmText = new Text(metamodelsGroup, SWT.BORDER);
        targetmmText.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        targetmmText.addModifyListener(modTextListener);
        Button targetmmButton = new Button(metamodelsGroup, SWT.PUSH);
        targetmmButton.setText("Browse...");
        targetmmButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        		targetmmText.setText(selectResource(
        				"Select a resource as the target metamodel",
        				IResource.FILE));
        		updateLaunchConfigurationDialog();
        	}
        });

        // Models selection form
        // Group
        Group modelsGroup = new Group(comp, SWT.NONE);
        modelsGroup.setFont(comp.getFont());
        modelsGroup.setLayout(new GridLayout(3, false));
        modelsGroup.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        modelsGroup.setText("Models");

        // Source model
        new Label(modelsGroup, SWT.NONE).setText("Source:");
        sourcemText = new Text(modelsGroup, SWT.BORDER);
        sourcemText.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        sourcemText.addModifyListener(modTextListener);
        Button sourcemButton = new Button(modelsGroup, SWT.PUSH);
        sourcemButton.setText("Browse...");
        sourcemButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        		sourcemText.setText(selectResource(
        				"Select a resource as the source model",
        				IResource.FILE));
        		updateLaunchConfigurationDialog();
        	}
        });

        // Target models folder
        new Label(modelsGroup, SWT.NONE).setText("Target:");
        targetmText = new Text(modelsGroup, SWT.BORDER);
        targetmText.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        targetmText.addModifyListener(modTextListener);
        Button targetmButton = new Button(modelsGroup, SWT.PUSH);
        targetmButton.setText("Browse...");
        targetmButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        		targetmText.setText(selectResource(
        				"Select a folder where to store target models",
        				IResource.FOLDER));
        		updateLaunchConfigurationDialog();
        	}
        });

        // Transformation selection form
        // Group
        Group transfGroup = new Group(comp, SWT.NONE);
        transfGroup.setFont(comp.getFont());
        transfGroup.setLayout(new GridLayout(4, false));
        transfGroup.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        transfGroup.setText("Transformation");

        // Transformation
        new Label(transfGroup, SWT.NONE).setText("JTL:");
        transfText = new Text(transfGroup, SWT.BORDER);
        transfText.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        transfText.addModifyListener(modTextListener);
        Button transfButton = new Button(transfGroup, SWT.PUSH);
        transfButton.setText("Browse...");
        transfButton.setLayoutData(
        		new GridData(SWT.BEGINNING, SWT.CENTER, false, false, 2, 1));
        transfButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        		transfText.setText(selectResource(
        				"Select a resource as JTL transformation",
        				IResource.FILE));
        		updateLaunchConfigurationDialog();
        	}
        });

        // Target models limit
        final Label limitLabel = new Label(transfGroup, SWT.NONE);
        limitLabel.setText("Limit the number of generated models:");
        limitLabel.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        limitSpinner = new Spinner(transfGroup, SWT.BORDER);
        limitSpinner.setToolTipText("0 = no limit");
        limitSpinner.setMinimum(0);
        limitSpinner.addModifyListener(modTextListener);

        // Traces model
        tracesCheck = new Button(transfGroup, SWT.CHECK);
        tracesCheck.setText("Provide a trace model");
        tracesCheck.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
        tracesCheck.addSelectionListener(new SelectionAdapter() {
        	@Override
            public void widgetSelected(SelectionEvent e) {
            	final Button check = (Button) e.getSource();
            	setTraceModelVisible(check.getSelection());
        		updateLaunchConfigurationDialog();
        	}
        });
        final Label tracesLabel = new Label(transfGroup, SWT.NONE);
        tracesLabel.setText("Traces:");
        tracesText = new Text(transfGroup, SWT.BORDER);
        tracesText.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        tracesText.addModifyListener(modTextListener);
        final Button tracesButton = new Button(transfGroup, SWT.PUSH);
        tracesButton.setText("Browse...");
        tracesButton.setLayoutData(
        		new GridData(SWT.BEGINNING, SWT.CENTER, false, false, 2, 1));
        tracesButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
        		tracesText.setText(selectResource(
        				"Select a resource as trace model",
        				IResource.FILE));
        		updateLaunchConfigurationDialog();
        	}
        });
        tracesControls.add(tracesLabel);
        tracesControls.add(tracesText);
        tracesControls.add(tracesButton);

        // Chain
        chainCheck = new Button(transfGroup, SWT.CHECK);
        chainCheck.setText("Chain this transformation");
        chainCheck.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false, 4, 1));
        chainCheck.addSelectionListener(new SelectionAdapter() {
        	@Override
            public void widgetSelected(SelectionEvent e) {
            	final Button check = (Button) e.getSource();
            	setChainVisible(check.getSelection());
        		updateLaunchConfigurationDialog();
        	}
        });
        final Label chainLabel = new Label(transfGroup, SWT.NONE);
        chainLabel.setText("Next:");

        // Get the set of JTL launch configurations from the launch manager
        final ILaunchManager launchManager =
        		DebugPlugin.getDefault().getLaunchManager();
        ILaunchConfigurationType launchConfigurationType = launchManager
        		.getLaunchConfigurationType("JTL.launchConfigurationType");
        ILaunchConfiguration[] launchConfigurations = null;
        try {
			launchConfigurations = launchManager
					.getLaunchConfigurations(launchConfigurationType);
		} catch (CoreException e1) {
			e1.printStackTrace();
		}

        // Sort the launch configurations by name
        Arrays.sort(launchConfigurations, new Comparator<ILaunchConfiguration>() {
        	@Override
        	public int compare(final ILaunchConfiguration lc1, final ILaunchConfiguration lc2) {
        		return lc1.getName().compareTo(lc2.getName());
        	}
        });

        chainCombo = new Combo(transfGroup, SWT.DROP_DOWN);
        chainCombo.setToolTipText("Select a launch configuration");
        for (ILaunchConfiguration config : launchConfigurations) {
        	chainCombo.add(config.getName());
        }
        chainCombo.setLayoutData(
        		new GridData(SWT.FILL, SWT.CENTER, true, false));
        chainCombo.addSelectionListener(new SelectionAdapter() {
        	@Override
        	public void widgetSelected(SelectionEvent e) {
                updateLaunchConfigurationDialog();
        	}
        });
        final Label chainLimitLabel = new Label(transfGroup, SWT.NONE);
        chainLimitLabel.setText("Limit:");
        chainLimitSpinner = new Spinner(transfGroup, SWT.BORDER);
        chainLimitSpinner.setToolTipText("Limit the number of input models");
        chainLimitSpinner.setMinimum(1);
        chainLimitSpinner.addModifyListener(modTextListener);
        chainControls.add(chainLabel);
        chainControls.add(chainCombo);
        chainControls.add(chainLimitLabel);
        chainControls.add(chainLimitSpinner);
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		try {
			sourcemmText.setText(configuration
				.getAttribute(LaunchConfigurationAttributes.SOURCEMM_TEXT, ""));
			targetmmText.setText(configuration
				.getAttribute(LaunchConfigurationAttributes.TARGETMM_TEXT, ""));
			sourcemText.setText(configuration
				.getAttribute(LaunchConfigurationAttributes.SOURCEM_TEXT, ""));
			targetmText.setText(configuration
				.getAttribute(LaunchConfigurationAttributes.TARGETM_TEXT, ""));
			transfText.setText(configuration
				.getAttribute(LaunchConfigurationAttributes.TRANSF_TEXT, ""));
			limitSpinner.setSelection(configuration
					.getAttribute(LaunchConfigurationAttributes.TRANSF_LIMIT, 0));
			tracesText.setText(configuration
					.getAttribute(LaunchConfigurationAttributes.TRACE_TEXT, ""));
			tracesCheck.setSelection(configuration
					.getAttribute(LaunchConfigurationAttributes.TRACE_CHECK, false));
			setTraceModelVisible(tracesCheck.getSelection());
			chainCheck.setSelection(configuration
					.getAttribute(LaunchConfigurationAttributes.CHAIN_CHECK, false));
			chainCombo.setText(configuration
					.getAttribute(LaunchConfigurationAttributes.CHAIN_COMBO, ""));
			chainLimitSpinner.setSelection(configuration
					.getAttribute(LaunchConfigurationAttributes.CHAIN_LIMIT, 1));
			setChainVisible(chainCheck.getSelection());
		} catch (CoreException e) {
			logger.warn("Unable to load the configuration data.", e);
		}
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		configuration.setAttribute(LaunchConfigurationAttributes.SOURCEMM_TEXT,
				sourcemmText.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.TARGETMM_TEXT,
				targetmmText.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.SOURCEM_TEXT,
				sourcemText.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.TARGETM_TEXT,
				targetmText.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.TRANSF_TEXT,
				transfText.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.TRANSF_LIMIT,
				limitSpinner.getSelection());
		configuration.setAttribute(LaunchConfigurationAttributes.TRACE_TEXT,
				tracesText.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.TRACE_CHECK,
				tracesCheck.getSelection());
		configuration.setAttribute(LaunchConfigurationAttributes.CHAIN_CHECK,
				chainCheck.getSelection());
		configuration.setAttribute(LaunchConfigurationAttributes.CHAIN_COMBO,
				chainCombo.getText());
		configuration.setAttribute(LaunchConfigurationAttributes.CHAIN_LIMIT,
				chainLimitSpinner.getSelection());
	}

	@Override
	public String getName() {
		return "JTL Transformation";
	}

	private String selectResource(final String title, final int resourceType) {
		ResourceListSelectionDialog dialog = new ResourceListSelectionDialog(
				getShell(),
				ResourcesPlugin.getWorkspace().getRoot(),
				resourceType);
		dialog.setTitle(title);
		if (dialog.open() == ResourceListSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			return ((IResource) result[0]).getFullPath().toString();
		}
		return null;
	}

	@Override
	public boolean isValid(ILaunchConfiguration launchConfig) {
		String errorMsg = "";
		if (sourcemmText.getText().equals("")) {
			errorMsg += ", the source metamodel";
		}
		if (targetmmText.getText().equals("")) {
			errorMsg += ", the target metamodel";
		}
		if (sourcemText.getText().equals("")) {
			errorMsg += ", the source model";
		}
		if (targetmText.getText().equals("")) {
			errorMsg += ", the target models folder";
		}
		if (transfText.getText().equals("")) {
			errorMsg += ", the JTL transformation";
		}
		if (tracesCheck.getSelection() && tracesText.getText().equals("")) {
			errorMsg += ", the trace model";
		}
		if (!errorMsg.equals("")) {
			errorMsg = "Please, select a path for " + errorMsg.substring(1) + ".";
			this.setErrorMessage(errorMsg);
			return false;
		}

		if (sourcemmText.getText().contains(" ")) {
			errorMsg += "source metamodel, ";
		}
		if (targetmmText.getText().contains(" ")) {
			errorMsg += "target metamodel, ";
		}
		if (sourcemText.getText().contains(" ")) {
			errorMsg += "source model, ";
		}
		if (targetmText.getText().contains(" ")) {
			errorMsg += "target models folder, ";
		}
		if (transfText.getText().contains(" ")) {
			errorMsg += "JTL transformation, ";
		}
		if (tracesCheck.getSelection() && tracesText.getText().contains(" ")) {
			errorMsg += "trace model, ";
		}
		if (!errorMsg.equals("")) {
			errorMsg = errorMsg.substring(0, errorMsg.length() - 2) + " cannot contain spaces.";
			this.setErrorMessage(errorMsg);
			return false;
		}

		if (chainCheck.getSelection() && chainCombo.getText().equals("")) {
			errorMsg += "Select the next launch configuration in the chain";
			this.setErrorMessage(errorMsg);
			return false;
		}

		this.setErrorMessage(null);
		return super.isValid(launchConfig);
	}

	private void setTraceModelVisible(final boolean visible) {
		for (Control c : tracesControls) {
			c.setVisible(visible);
		}
	}

	private void setChainVisible(final boolean visible) {
		for (Control c : chainControls) {
			c.setVisible(visible);
		}
	}

}
