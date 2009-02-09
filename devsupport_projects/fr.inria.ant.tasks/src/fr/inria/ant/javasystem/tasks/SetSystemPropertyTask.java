package fr.inria.ant.javasystem.tasks;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class SetSystemPropertyTask extends Task {
	private String key;
	private String value;
	
    // The method executing the task
    public void execute() throws BuildException {
    	System.out.println("Setting System Property " + key + "="+value);
        System.setProperty(key, value);
    }

    // The setter for the "name" attribute
    public void setKey(String _key) {
        this.key = _key;
    }
    
 // The setter for the "name" attribute
    public void setValue(String val) {
        this.value = val;
    }

}
