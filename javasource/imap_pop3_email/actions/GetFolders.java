// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package imap_pop3_email.actions;

import java.util.ArrayList;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;
import com.mendix.webui.CustomJavaAction;
import imap_pop3_email.proxies.Folder;

public class GetFolders extends CustomJavaAction<java.util.List<IMendixObject>>
{
	private IMendixObject __EmailConfiguration;
	private imap_pop3_email.proxies.EmailAccount EmailConfiguration;

	public GetFolders(IContext context, IMendixObject EmailConfiguration)
	{
		super(context);
		this.__EmailConfiguration = EmailConfiguration;
	}

	@java.lang.Override
	public java.util.List<IMendixObject> executeAction() throws Exception
	{
		this.EmailConfiguration = __EmailConfiguration == null ? null : imap_pop3_email.proxies.EmailAccount.initialize(getContext(), __EmailConfiguration);

		// BEGIN USER CODE
		EmailHandler handler = new EmailHandler(this.EmailConfiguration, getContext());
		
		java.util.List<IMendixObject> newList = new ArrayList<IMendixObject>(); 

	
		for(javax.mail.Folder fd: handler.getFolders())
		{
			Folder newFolder = new Folder(this.getContext());
			newFolder.setName(fd.getFullName());
			newList.add(newFolder.getMendixObject());
		}
		
		return newList;
		
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "GetFolders";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
