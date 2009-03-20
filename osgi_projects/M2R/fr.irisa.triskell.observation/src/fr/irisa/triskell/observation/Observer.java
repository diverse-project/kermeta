package fr.irisa.triskell.observation;

import java.io.Serializable;
import java.net.URI;

public interface Observer extends Serializable {
	
	/**
	 * This function is used to get an identifier for the Observer Type.<br />
	 * There is not specification about this identifier. It must just not contains the reserved character into an {@link URI}.<br />
	 * That characters are <code>;</code> | <code>/</code> | <code>?</code> | <code>:</code> | <code>@</code> | <code>&</code> | <code>=</code> | <code>+</code> |
                    <code>$</code> | <code>,</code>
	 * @param alias the type could be defined specifically for an alias which is managed by the Observer 
	 * @return the identifier for the Observer Type
	 */
	public String getType(String alias);
	
	/**
	 * This function is used to get an identifier for the Observer name.<br />
	 * There is not specification about this identifier. It must just not contains the reserved character into an {@link URI}.<br />
	 * That characters are <code>;</code> | <code>/</code> | <code>?</code> | <code>:</code> | <code>@</code> | <code>&</code> | <code>=</code> | <code>+</code> |
                    <code>$</code> | <code>,</code>
	 * @param alias the name could be defined specifically for an alias which is managed by the Observer 
	 * @return the identifier for the Observer name
	 */
	public String getName(String alias);
	
	/**
	 * This function is used to get the value for a specific event define by the alias
	 * @param alias an alias managed by the Observer 
	 * @return the value of the event defined by the alias
	 */
	public Object getValue(String alias);
	
	/**
	 * This function is used to modify the value of an event identified by the alias
	 * @param alias the identifier of an event
	 * @param value the new value of the event
	 * @return the old value of the event
	 */
	public Object setValue(String alias, Object value);
	
	/**
	 * This function is used to define a identifier which can be unique for each Observer instance
	 * @return a unique identifier for this Observer
	 */
	public String getSerialId();

}

