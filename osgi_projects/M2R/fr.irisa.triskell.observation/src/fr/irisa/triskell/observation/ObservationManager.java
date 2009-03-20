package fr.irisa.triskell.observation;

import fr.irisa.triskell.observation.exceptions.AliasAlreadyExistsException;
import fr.irisa.triskell.observation.exceptions.ObserverUnavailableException;
import fr.irisa.triskell.observation.exceptions.UnknownAliasException;

public interface ObservationManager {
	
	/**
	 * This function allows you to register an {@link Observer} and set his identifier with the <code>alias</code>
	 * @param alias the identifier of the observer
	 * @param observer the observer which allows you to get state of sensor
	 * @throws AliasAlreadyExistsException if the alias is already used
	 * @throws ObserverAlreadyAvailablesException if the observer is already register
	 */
	public void registerObserver(String alias, Observer observer) throws AliasAlreadyExistsException;
	
	/**
	 * This function allows you to update the observer define by the alias
	 * @param alias the alias
	 * @param observer the new observer for the alias
	 * @return the old {@link Observer}
	 * @throws UnknownAliasException if the alias is not defined.
	 */
	public /*Observer*/void updateObserver(String alias, Observer observer) throws UnknownAliasException;
	
	/**
	 * This function allows you to unregister an observer
	 * @param alias the alias which identify the observer
	 */
	public /*Observer*/void unregisterObserver(String alias);
	
	/**
	 * This function allows you to know if the alias is unique into this ObservationHandler
	 * Be careful : an alias must be unique into all ObservationHandlers 
	 * @param alias the alias that you want know if it is unique
	 * @return true if the alias is unique false else
	 */
	public boolean isUnique(String alias);
	
	/**
	 * This function allows you to get the value of a {@link BasicObserver}
	 * @param alias which identify the observer
	 * @return the object value of the Observer register with the alias or <code>null</code> if the observer is not a {@link BasicObserver}
	 * @throws UnknownAliasException
	 * @throws ObserverUnavailableException
	 */
	public Object getValue(String alias) throws UnknownAliasException, ObserverUnavailableException;
	
	/**
	 * This function allows you to set a value for a {@link BasicObserver} <br />
	 * If it's not a {@link BasicObserver}, this function does nothing
	 * @param alias which identify the observer
	 * @param value the new value object for the observer
	 * @return the old value of the observer or <code>null</code> if the observer is not a {@link BasicObserver}
	 * @throws UnknownAliasException if the alias does exist
	 * @throws ObserverUnavailableException
	 */
	public Object setValue(String alias, Object value) throws UnknownAliasException, ObserverUnavailableException;
	
	public Observer getObserver(String alias) throws UnknownAliasException, ObserverUnavailableException;

	/**
	 * This function allows you to add constraint to define a new Event type.<br />
	 * When this constraint is true, an Event is generate onto the platform.
	 * @param constraint the constraint {@link String} which define when create an Event.
	 */
	public void addEventQuery(String query);
	
	/**
	 * This function allows you to remove constraint to remove an Event type.<br />
	 * When you remove a Event constraint, there is no more event when this constraint is true.
	 * @param constraint the constraint {@link String} which define when create an Event.
	 */
	public void removeEventQuery(String query);
	
}
