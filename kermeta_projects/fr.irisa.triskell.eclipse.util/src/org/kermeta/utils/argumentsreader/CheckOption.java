/* $Id: CheckOption.java,v 1.3 2007-08-08 13:00:20 dvojtise Exp $
 * Created on 11 mai 2004
 *
 */
package org.kermeta.utils.argumentsreader;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Vector;


/** One often has the need to give some arguments to one binary; this is generally done 
    through the use of options (for example "-l FR0").

    To a development point of view, this leads to the following structure :

         int main (int argc, char* argv[])
	 {	
	    for (int i=1; i<argc; i++)
	    {
	        // do something with the argv[i]th argument.
            }	
         }	

    But it is annoying to code and code again something that changes only slighly from
    one binary to another one; moreover, it could happen that we need share the same kind of options
    between binaries.

    So, the idea is to create one class for each option we need (this will allow the sharing of options)
    and one class that supervises all these options. 

    This latter is the Check_Option class. Its goal is divided in two parts : firstly we add some Option* objects
    into it (they will be the only recognized options in the program); secondly, we give to one object of this 
    Check_Option class the arguments given to the main function (i.e. int argc and char* argv[]) and then perform
    the job of analyzing the arguments thru the Proceed method for the Option* objects we add to the checker.

    When we create an object from one class that inherits from Option, we can give to the constructor some objects
    that can be updated if the corresponding option is found in the list of arguments. So after the Proceed method,
    these objects are supposed to be filled in accordance to the current options and the arguments given to the
    binary.

    
    Here is an example of how to use these classes.
    ----------------------------------------------------------------------

    public static void main(String[] args) 
    {
		Collection files         = new Vector ();
		Collection dictionaries  = new Vector ();
		Collection command_files = new Vector ();;
		String log_file          = "";
		String output_file       = "";
		String character_set     = "";

		// We build the object that will check the arguments with the wanted options.
		CheckOption check = new CheckOption (
			new Option[] {
				new NoOption (files),
				new MgrOption_C (),
				new MgrOption_F (),
				new MgrOption_x (command_files)
			} 
		);

		// Then, we perform the check.
		int nb_errors = check.Proceed (args);

		// We display eventual errors and warnings.
		check.DisplayErrors   (System.out);
		check.DisplayWarnings (System.out);

		if (check.Saw ("-C"))
		{
			System.out.println ("option -C was seen...");
		}

		if (check.Saw ("-F"))
		{
			System.out.println ("option -F was seen...");
		}

		if (check.Saw ("-x"))
		{
			System.out.println ("option -x was seen with arguments : ");
			Iterator it = command_files.iterator();
			while (it.hasNext())
			{
				System.out.println ("\t" + it.next());
			}
		}
		
		System.out.println ("The arguments not linked to an option are : ");
		Iterator it = files.iterator();
		while (it.hasNext())
		{
			System.out.println ("\t" + it.next());
		}
		
		// we display the help
		check.DisplayHelp (System.out);
	}		
*/

public class CheckOption 
{
	////////////////////////////////////////////////////////////
	// PUBLIC
	////////////////////////////////////////////////////////////	

	/** */
	public CheckOption (Option[] options)
	{
		for (int i=0; i<options.length; i++)
		{
			add (options[i]);
		}
	}

	/** Add an option to the pool of recognized options of the Check_Option object. */
	public void add (Option opt)
	{
		/* We add the option in the list. */
		options.add (opt);
	}


	/** Perform the analyze of the argumenst. */
	public int Proceed (String[] args)
	{
		/* Some initializations. */
		this.args = args; 
		current_arg = 0;

		errors.clear();
		warnings.clear();
		seen_options.clear();
		
		String exclude;
		String txt;

		while ( (txt=NextArg()) != null)
		{
			/* We look if is matches one of the recognized options. */
			Option option_match = LookForOption (txt);

			if (option_match != null)
			{

				/* This is a recognized option. So we try to retrieve the args that should follow. */
			    Vector<String> option_args = GetOptionArgs (option_match);
				if (option_args.size() == option_match.getNbArgs())
				{
					/* We first look if this option has not already been met. */
					if (option_match.getMultiple() && Saw (option_match.getName()) )
					{
						warnings.add ("Option " +  option_match.getName() + " already seen, ignored...");
					}
					else if ( (exclude=CheckExcludingOptions(option_match)) != null) 
					{
						errors.add ("Option " + option_match.getName() + " can't be used with option " + exclude + ", ignored..."); 
					}
					else
					{
						option_match.Proceed (option_args);
						seen_options.add (option_match);
					}
				}
			}
			else
			{
				/* This is an NOT a recognized option. We try to find an No_Option. */
				GiveToNoOption (txt);
			}
		}

		/* Now, we check that the accepted options are used with with include options. */
		CheckIncludingOptions ();

		/* And we return the errors number. */
		return errors.size();
	}


	/** Display errors (if there are some). */
	public void DisplayErrors (PrintStream fp)
	{
		Iterator<String> it = errors.iterator();
		while (it.hasNext())
		{
			String item = it.next();
			fp.println ("Warning : " + item);
		}
	}

	/** Display warnings (if there are some). */
	public void DisplayWarnings (PrintStream fp)
	{
		Iterator<String> it = warnings.iterator();
		while (it.hasNext())
		{
			String item = it.next();
			fp.println ("Warning : " + item);
		}
	}

	/** Display the help of each options recorded. */
	public void DisplayHelp (PrintStream fp)
	{
		Iterator<Option> it = options.iterator();
		while (it.hasNext())
		{
			Option item = it.next();
			if (! item.getName().equals(""))
			{
				String s = (item.getNbArgs() > 1) ? "s":"";
				fp.println (item.getName() + " : (takes " + item.getNbArgs() + " argument"+ s +") \t " + item.getHelp());
			}
		}
	}

	/** Tells (after Proceed) if one option whose name is given has been seen or not. */
	public boolean Saw (String name)
	{
		boolean found = false;
		Iterator<Option> it = seen_options.iterator();
		while (it.hasNext())
		{
			Option item = it.next();
			if (item.getName().equals(name))
			{
				found = true;
				break;
			}
		}
		return found;
	}

	/** */
	public Option getOption (String name)
	{
		Option result = null;

		Iterator<Option> it = options.iterator(); 
		while (result==null && it.hasNext())
		{
			Option item = it.next();
			if (item.getName().equals(name))
			{
				result = item;
			}
		} 
		
		return result;
	}

	////////////////////////////////////////////////////////////
	// PRIVATE
	////////////////////////////////////////////////////////////	
	
	/** List of Options*. */
	private Vector<Option> options = new Vector<Option> ();

	/** List of Text* of errors. */
	private Vector<String> errors = new Vector<String> ();

	/** List of Text* of warnings. */
	private Vector<String> warnings = new Vector<String> ();

	/** List of seen options. */
	private Vector<Option> seen_options = new Vector<Option> ();

	/** */
	private String[] args;
	
	/** */
	private int current_arg;

	
	/** */	
	private Option LookForOption (String txt)
	{
		Option result = null;
		Iterator<Option> it = options.iterator();
		while (result==null && it.hasNext())
		{
			Option item = it.next();
			if (item.getName().equals(txt))
			{
				result = item;
			}	
		}
		return result;
	}


	/** */
	private String NextArg ()
	{
	  return (current_arg >= args.length ? null : args[current_arg++]);
	}

	/** */
	private Vector<String> GetOptionArgs (Option opt)
	{
	    Vector<String> result = new Vector<String>();
  
		String txt;
		int i=1;
		int n=opt.getNbArgs();
	  
		while ( (i<=n) && (txt=NextArg())!=null) 
		{
			result.add (txt);
			i++;
		}

		if (i<=n)
		{
			errors.add ("To few arguments for the " + opt.getName() + " option...");
		}

		return result;
	}

	/** */
	private void GiveToNoOption (String txt)
	{
		boolean found = false;
		Option item = null;		
		Iterator<Option> it = options.iterator();
		while (found==false && it.hasNext())
		{
			item = it.next();
			if (item.getName().equals(""))
			{
				found = true;
			}
		}
	
		if (found)
		{
		    Vector<String> tmp = new Vector<String> ();
			tmp.add (txt);
			item.Proceed (tmp);
		}
	}

	/** */
	private String CheckExcludingOptions (Option option)
	{
		if (option.getExclude().equals (""))
		{
			return null;	  	
		}

		boolean found = false;
		Option item = null;
		Iterator<Option> it = seen_options.iterator();
		while (it.hasNext())
		{
			item = it.next();

			if (option.getExclude().indexOf (item.getName()) != -1)
			{
				found = true;
				break;
			}
		}

		return (found ? item.getName() : null);
	}

	/** */
	private void CheckIncludingOptions ()
	{
		Iterator<Option> it = seen_options.iterator();
		while (it.hasNext())
		{
			Option item = it.next();
			String include = item.getInclude();	
			if (! include.equals(""))
			{
				boolean inner_found = false;
				Iterator<Option> it2 = seen_options.iterator();
				while (it2.hasNext())
				{
					Option item2 = it2.next();
					if (include.indexOf(item2.getName()) != -1)
					{
						inner_found = true;
						break;
					}
				}
				if (! inner_found)
				{
					errors.add ("Option " + item.getName() + "must be used with one of the following options : " + include);
				}
				
			}
		}
	}
}
