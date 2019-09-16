// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package unittesting.actions;

import unittesting.TestManager;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class ThrowAssertionFailed extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String message;

	public ThrowAssertionFailed(IContext context, java.lang.String message)
	{
		super(context);
		this.message = message;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		throw new TestManager.AssertionException(message);
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ThrowAssertionFailed";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
