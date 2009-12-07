/*
 * Created on 6 mai 2004
 *
 */
package org.kermeta.utils.argumentsreader;

/**
 * @author edrezen
 *
 */
abstract public class Option 
{
	private String name;
	private int nbArgs;
	private String help;
	private boolean multiple;
	private String include;
	private String exclude;
	private java.util.Vector<String> parameters = new java.util.Vector<String>();
	

	/** When an option is recognized in the argumenst list, we look the number of waited args and put
		them in a list of String objects. This is this list that is given as argument of the Proceed method
		that mainly will affect the given args to the variable given to the instanciation of the 
		(derived class) Option.
	*/
	abstract public void Proceed (java.util.Vector<String> list); 

	/** */
    public String getExclude() 
    {
        return exclude;
    }

    /** */
    public void setExclude(String exclude) 
    {
        this.exclude = exclude;
    }

    /** */
    public String getHelp() 
    {
        return help;
    }

    /** */
    public void setHelp(String help) 
    {
        this.help = help;
    }

    /** */
    public String getInclude() 
    {
        return include;
    }

    /** */
    public void setInclude(String include) 
    {
        this.include = include;
    }

    /** */
    public boolean getMultiple() 
    {
        return multiple;
    }

    /** */
    public void setMultiple(boolean multiple) 
    {
        this.multiple = multiple;
    }

    /** */
    public String getName() 
    {
        return name;
    }

    /** */
    public void setName(String name) 
    {
        this.name = name;
    }

    /** */
    public int getNbArgs() 
    {
        return nbArgs;
    }

    /** */
    public void setNbArgs (int nb_args) 
    {
        this.nbArgs = nb_args;
    }

	/** */
	public java.util.Vector<String> getParameters() 
	{
		return parameters;
	}

	/** */
	protected void setParameters(java.util.Vector<String> parameters) 
	{
		this.parameters = parameters;
	}
}
