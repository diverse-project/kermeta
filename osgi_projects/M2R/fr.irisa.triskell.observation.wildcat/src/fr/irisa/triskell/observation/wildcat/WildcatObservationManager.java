package fr.irisa.triskell.observation.wildcat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.osgi.service.event.Event;
import org.osgi.service.event.EventAdmin;
import org.ow2.wildcat.Context;
import org.ow2.wildcat.ContextException;
import org.ow2.wildcat.Query;
import org.ow2.wildcat.event.WAttributeEvent;

import com.espertech.esper.event.EventBean;

import fr.irisa.triskell.observation.EventConstants;
import fr.irisa.triskell.observation.ObservationManager;
import fr.irisa.triskell.observation.Observer;
import fr.irisa.triskell.observation.exceptions.AliasAlreadyExistsException;
import fr.irisa.triskell.observation.exceptions.ObserverUnavailableException;
import fr.irisa.triskell.observation.exceptions.UnknownAliasException;

public class WildcatObservationManager implements ObservationManager {

	private Map<String, String> aliases;
	private Context wildcatContext;
	private List<ObservationManager> managers;
	private Map<String, Query> queries;
	private UpdateListener listener;
	private EventAdmin eventAdmin;
	
	public WildcatObservationManager() {
		aliases = new HashMap<String, String>();
		queries = new HashMap<String, Query>();
		listener = new UpdateListener();
	}
	
	@Override
	public Observer getObserver(String alias) throws UnknownAliasException,
			ObserverUnavailableException {
		if (aliases.containsKey(alias)) {
			try {
				return ((WrapperAttribute)wildcatContext.getAttribute(aliases.get(alias))).getObserver();
			} catch (ContextException e) {
				throw new ObserverUnavailableException(alias);
			}
		} else {
			throw new UnknownAliasException(alias);
		}
	}

	@Override
	public Object getValue(String alias) throws UnknownAliasException,
			ObserverUnavailableException {
		if (aliases.containsKey(alias)) {
			try {
				return wildcatContext.getAttribute(aliases.get(alias)).getValue();
			} catch (ContextException e) {
				throw new ObserverUnavailableException(alias);
			}
		} else {
			throw new UnknownAliasException(alias);
		}
	}

	@Override
	public boolean isUnique(String alias) {
		if (this.aliases.containsKey(alias)) {
			return false;
		}
		return true;
	}

	@Override
	public void registerObserver(String alias, Observer observer)
			throws AliasAlreadyExistsException {
		if (this.aliasIsUnique(alias)) {
		String identifier = this.createIdentfier(alias, observer);
			if (this.aliases.containsValue(identifier)) {
				this.aliases.put(alias, identifier);
			} else {
				// If the identifier is not already registered
					try {
						wildcatContext.attachAttribute(identifier, new WrapperAttribute(alias, observer));
						aliases.put(alias, identifier);
					} catch (ContextException e) {
						// TODO create a generalize exception for all implementations
						System.err.println("MORE GENERAL");
						e.printStackTrace();
					}
				
			}
		} else {
			throw new AliasAlreadyExistsException(alias);
		}
	}

	@Override
	public Object setValue(String alias, Object value)
			throws UnknownAliasException, ObserverUnavailableException {
		if (this.aliases.containsKey(alias)) {
			try {
				return this.wildcatContext.setValue(this.aliases.get(alias),
						value);
			} catch (ContextException e) {
				throw new ObserverUnavailableException(alias);
			}
		} else {
			throw new UnknownAliasException(alias);
		}
	}

	@Override
	public void unregisterObserver(String alias) {
		if (this.aliases.containsKey(alias)) {
			try {
				this.wildcatContext.detachAttribute(this.aliases.get(alias));
				this.aliases.remove(alias);
			} catch (ContextException e) {
				// TODO create a generalize exception for all implementations
				System.err.println("MORE GENERAL");
				e.printStackTrace();
			}
		}
	}

	@Override
	public void updateObserver(String alias, Observer observer)
			throws UnknownAliasException {
		if (this.aliases.containsKey(alias)) {
			String identifier = this.createIdentfier(alias, observer);
			if (this.aliases.containsValue(identifier)) {
				this.aliases.put(alias, identifier);
			} else {
				try {
					wildcatContext.attachAttribute(identifier, new WrapperAttribute(alias, observer));
					aliases.put(alias, identifier);
				} catch (ContextException e) {
					// TODO create a generalize exception for all implementations
					System.err.println("MORE GENERAL");
					e.printStackTrace();
				}
			}
		} else {
			throw new UnknownAliasException(alias);
		}
	}

	@Override
	public void addEventQuery(String query) {
		Query wildcatQuery = wildcatContext.createQuery(query);
		wildcatContext.registerListeners(wildcatQuery, listener);
		queries.put(query, wildcatQuery);
	}

	@Override
	public void removeEventQuery(String query) {
		if (queries.containsKey(query)) {
			Query wildcatQuery = queries.get(query);
			wildcatContext.removeListeners(wildcatQuery, listener);
			wildcatContext.destroyQuery(wildcatQuery);
			queries.remove(query);
		}
	}
	
	private String createIdentfier(String alias, Observer observer) {
		// TODO maybe identifier is able to be not valid if type or name contain
		// "://" or "#" or something like that
		String identifier = "self://";
			identifier += "observer/" + observer.getType(alias) + "#"
					+ observer.getName(alias) + observer.getSerialId();
		return identifier;
	}

	private boolean aliasIsUnique(String alias) {
		if (!this.isUnique(alias)) {
			return false;
		} else {
			for (ObservationManager manager : managers) {
				if (!manager.equals(this) && !manager.isUnique(alias)) {
					return false;
				}
			}
		}
		return true;
	}
	
	private String[] getAliasToIdentifier(String identifier) {
		List<String> aliases = new ArrayList<String>();
		if (this.aliases.containsValue(identifier)) {
			for (String alias : this.aliases.keySet()) {
				if (this.aliases.get(alias).equals(identifier)) {
					aliases.add(alias);
				}
			}
		}
		String[] aliasesArray = new String[aliases.size()];
		aliases.toArray(aliasesArray);
		return aliasesArray;
	}
	
	class UpdateListener implements com.espertech.esper.client.UpdateListener {

		
		@Override
		public void update(EventBean[] arg0, EventBean[] arg1) {
			for (EventBean eventBean : arg0) {
				if (eventBean.getUnderlying() instanceof WAttributeEvent) {
					WAttributeEvent attributeEvent = ((WAttributeEvent) eventBean
							.getUnderlying());
					for (String identifier : getAliasToIdentifier(attributeEvent.getSource())) {
						Event event = createEvent(identifier, attributeEvent.getValue());
						sendEvent(event);
					}
				} else {
					//System.err.println("UpdateListener don't manage this type of class : " + eventBean.getUnderlying().getClass());
				}
			}
		}

		public Event createEvent(String identifier, Object value) {
			Properties properties = new Properties();
			properties.put(EventConstants.SOURCE, identifier);
			properties.put(EventConstants.VALUE, value);
			System.out.println("Topic name : " + EventConstants.TOPIC_NAME);
			return new Event(EventConstants.TOPIC_NAME, properties);
		}

		public void sendEvent(Event event) {
			try {
				eventAdmin.sendEvent(event);
			} catch (SecurityException e) {
				System.out.println("Exception into sendEvent : " + e.getMessage());
				//e.printStackTrace();
			}
		}

		public void postEvent(Event event) {
			try {
				eventAdmin.postEvent(event);
			} catch (SecurityException e) {
				e.printStackTrace();
			}
		}
	}
}