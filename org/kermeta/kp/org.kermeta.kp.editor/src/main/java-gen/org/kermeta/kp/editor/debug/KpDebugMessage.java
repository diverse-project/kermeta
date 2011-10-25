/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class KpDebugMessage {
	
	private static final char DELIMITER = ':';
	private org.kermeta.kp.editor.debug.EKpDebugMessageTypes messageType;
	private String[] arguments;
	
	public KpDebugMessage(org.kermeta.kp.editor.debug.EKpDebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public KpDebugMessage(org.kermeta.kp.editor.debug.EKpDebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.kermeta.kp.editor.debug.EKpDebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.kermeta.kp.editor.util.KpStringUtil.encode(DELIMITER, parts);
	}
	
	public static KpDebugMessage deserialize(String response) {
		java.util.List<String> parts = org.kermeta.kp.editor.util.KpStringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.kermeta.kp.editor.debug.EKpDebugMessageTypes type = org.kermeta.kp.editor.debug.EKpDebugMessageTypes.valueOf(messageType);
		KpDebugMessage message = new KpDebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.kermeta.kp.editor.debug.EKpDebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.kermeta.kp.editor.util.KpStringUtil.explode(arguments, ", ") + "]";
	}
	
}
