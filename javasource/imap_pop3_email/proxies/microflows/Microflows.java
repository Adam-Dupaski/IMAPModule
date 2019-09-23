// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package imap_pop3_email.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the IMAP_POP3_email module
	public static boolean connectToEmailServer(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "IMAP_POP3_email.ConnectToEmailServer", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static imap_pop3_email.proxies.EmailAccount dS_DummyConfiguration(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			IMendixObject result = (IMendixObject)Core.execute(context, "IMAP_POP3_email.DS_DummyConfiguration", params);
			return result == null ? null : imap_pop3_email.proxies.EmailAccount.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<imap_pop3_email.proxies.EmailMessage> dS_ReceiveEmails(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "IMAP_POP3_email.DS_ReceiveEmails", params);
			java.util.List<imap_pop3_email.proxies.EmailMessage> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<imap_pop3_email.proxies.EmailMessage>();
				for (IMendixObject obj : objs)
					result.add(imap_pop3_email.proxies.EmailMessage.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<imap_pop3_email.proxies.Folder> dSO_Folders(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "IMAP_POP3_email.DSO_Folders", params);
			java.util.List<imap_pop3_email.proxies.Folder> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<imap_pop3_email.proxies.Folder>();
				for (IMendixObject obj : objs)
					result.add(imap_pop3_email.proxies.Folder.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CommitBatchDetails(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_CommitBatchDetails", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_CommitServerDetails(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_CommitServerDetails", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ConfigStep1(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_ConfigStep1", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_ConfigStep2(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_ConfigStep2", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteAll(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_DeleteAll", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_DeleteMail(IContext context, imap_pop3_email.proxies.EmailMessage _emailMessage)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailMessage", _emailMessage == null ? null : _emailMessage.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_DeleteMail", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_FolderSelect(IContext context, imap_pop3_email.proxies.Folder _folder, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Folder", _folder == null ? null : _folder.getMendixObject());
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_FolderSelect", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<imap_pop3_email.proxies.EmailMessage> iVK_ReceiveEmails(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "IMAP_POP3_email.IVK_ReceiveEmails", params);
			java.util.List<imap_pop3_email.proxies.EmailMessage> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<imap_pop3_email.proxies.EmailMessage>();
				for (IMendixObject obj : objs)
					result.add(imap_pop3_email.proxies.EmailMessage.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_RemoveConfiguration(IContext context, imap_pop3_email.proxies.EmailAccount _emailAccount)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_RemoveConfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void iVK_SaveAccount(IContext context, imap_pop3_email.proxies.EmailAccount _emailSettings)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.IVK_SaveAccount", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_Emailconfiguration(IContext context, imap_pop3_email.proxies.EmailAccount _emailSettings)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.OCh_Emailconfiguration", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void oCh_EmailProtocol(IContext context, imap_pop3_email.proxies.EmailAccount _emailSettings)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
			Core.execute(context, "IMAP_POP3_email.OCh_EmailProtocol", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sub_LogError(IContext context, system.proxies.Error _error, imap_pop3_email.proxies.EmailAccount _emailAccount, boolean _renderAsValidation)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Error", _error == null ? null : _error.getMendixObject());
			params.put("EmailAccount", _emailAccount == null ? null : _emailAccount.getMendixObject());
			params.put("RenderAsValidation", _renderAsValidation);
			Core.execute(context, "IMAP_POP3_email.Sub_LogError", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validateBatchDetails(IContext context, imap_pop3_email.proxies.EmailAccount _emailSettings)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "IMAP_POP3_email.ValidateBatchDetails", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean validateServerDetails(IContext context, imap_pop3_email.proxies.EmailAccount _emailSettings)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EmailSettings", _emailSettings == null ? null : _emailSettings.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "IMAP_POP3_email.ValidateServerDetails", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}