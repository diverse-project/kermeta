package com.library.security.model.context;

/**
 * User: Tej
 * Date: 7 mars 2007
 * Time: 11:05:28
 */
public class Context {
    private String contextName;


    /**
     * 
     * @param contextName the name of the context
     */
    public Context(String contextName)   {

        this.contextName = contextName;
    }


    public String getContextName() {
        return contextName;
    }

    public void setContextName(String contextName) {
        this.contextName = contextName;
    }


    public boolean equals(Object o) {
        return ((Context) o).getContextName().equals(contextName);
    }
}
