package org.openembedd.logo.csm.diagram.block.dialogs;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.openembedd.logo.csm.logoCSM.Constant;
import org.openembedd.logo.csm.logoCSM.Expression;
import org.openembedd.logo.csm.logoCSM.LogoCSMFactory;
import org.topcased.facilities.dialogs.ITopcasedDialogConstants;
import org.topcased.modeler.ModelerColorConstants;

/**
 * 
 */
public class EditExpressionDialog extends Dialog implements ITopcasedDialogConstants
{
	// new expression value
	private Expression	newExpression;

	// SWT Objects
	private Composite	dialog;

	private Text		stringText;

	private String		labelText;

	private Label		label;

	/**
	 * Create the Dialog window that handles the string editing
	 * 
	 * @param initialExpression
	 *        the initial expression. For the moment, we only manage constants
	 * @param parentShell
	 *        the parent Shell
	 */
	public EditExpressionDialog(Expression initialExpression, Shell parentShell, String labelText)
	{
		super(parentShell);
		setBlockOnOpen(true);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		this.newExpression = initialExpression;
		this.labelText = labelText;
	}

	/**
	 * @see org.eclipse.jface.window.Window#configureShell(org.eclipse.swt.widgets.Shell)
	 */
	protected void configureShell(Shell newShell)
	{
		newShell.setText("Editing Expression value...");
		newShell.setMinimumSize(MIN_DIALOG_WIDTH, MIN_DIALOG_HEIGHT);

		super.configureShell(newShell);
	}

	/**
	 * Create the Dialog area
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	protected Control createDialogArea(Composite parent)
	{
		// Dialog
		dialog = (Composite) super.createDialogArea(parent);
		GridData data = new GridData(GridData.FILL_BOTH);
		data.widthHint = DEFAULT_DIALOG_WIDTH;
		data.heightHint = DEFAULT_DIALOG_HEIGHT;
		dialog.setLayoutData(data);

		// Edit comment
		label = new Label(dialog, SWT.WRAP);
		label.setText(labelText);
		label.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		stringText = new Text(dialog, SWT.MULTI | SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		data = new GridData(GridData.FILL_BOTH);
		stringText.setLayoutData(data);
		if (newExpression != null)
			stringText.setText(newExpression.parseExpression());

		return dialog;
	}

	/**
	 * Parse the dialog box and check if the expression entered is a constant integer value. For the moment, we manage
	 * only with Integer Expressions.
	 * 
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	protected void okPressed()
	{
		String tmp = stringText.getText();

		try
		{
			int value = Integer.parseInt(tmp);
			Constant cst = LogoCSMFactory.eINSTANCE.createConstant();
			cst.setIntegerValue(value);
			newExpression = cst;
			super.okPressed();
		}
		catch (NumberFormatException nfe)
		{
			label.setForeground(ModelerColorConstants.red);
			label.setText("The value must be an integer value. " + labelText);
		}
	}
	/**
	 * Returns the new expression value
	 * 
	 * @return the string representing the new expression value
	 */
	public Expression getNewExpressionValue()
	{
		return newExpression;
	}
}
