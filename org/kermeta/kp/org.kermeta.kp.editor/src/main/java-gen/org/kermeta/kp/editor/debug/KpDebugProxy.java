/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kermeta.kp.editor.debug;

/**
 * The DebugProxy allows to communicate between the interpreter, which runs in a
 * separate thread or process and the Eclipse Debug framework (i.e., the
 * DebugTarget class).
 */
public class KpDebugProxy {
	
	public static final int STARTUP_DELAY = 1000;
	
	private java.io.PrintStream output;
	
	private java.io.BufferedReader reader;
	
	private org.kermeta.kp.editor.debug.KpDebugTarget debugTarget;
	
	private org.kermeta.kp.editor.debug.KpDebugCommunicationHelper communicationHelper = new org.kermeta.kp.editor.debug.KpDebugCommunicationHelper();
	
	public KpDebugProxy(org.kermeta.kp.editor.debug.KpDebugTarget debugTarget, int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		this.debugTarget = debugTarget;
		// give interpreter a chance to start
		try {
			Thread.sleep(STARTUP_DELAY);
		} catch (InterruptedException e) {
		}
		startSocket(requestPort);
	}
	
	private void startSocket(int requestPort) throws java.net.UnknownHostException, java.io.IOException {
		// creating client proxy socket (trying to connect)...
		java.net.Socket client = new java.net.Socket("localhost", requestPort);
		// creating client proxy socket - done. (connected)
		try {
			java.io.BufferedInputStream input = new java.io.BufferedInputStream(client.getInputStream());
			reader = new java.io.BufferedReader(new java.io.InputStreamReader(input));
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
		try {
			output = new java.io.PrintStream(client.getOutputStream());
		} catch (java.io.IOException e) {
			System.out.println(e);
		}
	}
	
	public void resume() {
		sendCommand(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.RESUME);
	}
	
	public void stepOver() {
		sendCommand(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.STEP_OVER);
	}
	
	public void stepInto() {
		sendCommand(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.STEP_INTO);
	}
	
	public void stepReturn() {
		sendCommand(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.STEP_RETURN);
	}
	
	public void terminate() {
		sendCommand(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.EXIT);
	}
	
	public org.kermeta.kp.editor.debug.KpDebugMessage getStack() {
		return sendCommandAndRead(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.GET_STACK);
	}
	
	public void addLineBreakpoint(String location, int line) {
		org.kermeta.kp.editor.debug.KpDebugMessage message = new org.kermeta.kp.editor.debug.KpDebugMessage(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.ADD_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public void removeLineBreakpoint(String location, int line) {
		org.kermeta.kp.editor.debug.KpDebugMessage message = new org.kermeta.kp.editor.debug.KpDebugMessage(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.REMOVE_LINE_BREAKPOINT, new String[] {location, Integer.toString(line)});
		communicationHelper.sendEvent(message, output);
	}
	
	public org.eclipse.debug.core.model.IVariable[] getStackVariables(String stackFrame) {
		org.kermeta.kp.editor.debug.KpDebugMessage response = sendCommandAndRead(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.GET_FRAME_VARIABLES, new String[] {stackFrame});
		String[] ids = response.getArguments();
		// fetch all variables
		org.eclipse.debug.core.model.IVariable[] variables = getVariables(ids);
		return variables;
	}
	
	public org.eclipse.debug.core.model.IVariable[] getVariables(String... requestedIDs) {
		org.kermeta.kp.editor.debug.KpDebugMessage response = sendCommandAndRead(org.kermeta.kp.editor.debug.EKpDebugMessageTypes.GET_VARIABLES, requestedIDs);
		String[] varStrings = response.getArguments();
		org.kermeta.kp.editor.debug.KpDebugVariable[] variables  = new org.kermeta.kp.editor.debug.KpDebugVariable[varStrings.length];
		int i = 0;
		for (String varString : varStrings) {
			java.util.Map<String, String> properties = org.kermeta.kp.editor.util.KpStringUtil.convertFromString(varString);
			
			// convert varString to variables and values
			String valueString = properties.get("!valueString");
			String valueRefType = "valueRefType";
			java.util.Map<String, Long> childVariables = new java.util.TreeMap<String, Long>(new java.util.Comparator<String>() {
				public int compare(String s1, String s2) {
					return s1.compareToIgnoreCase(s2);
				}
			});
			for (String property : properties.keySet()) {
				// ignore special properties - they are not children
				if (property.startsWith("!")) {
					continue;
				}
				childVariables.put(property, Long.parseLong(properties.get(property)));
			}
			String id = properties.get("!id");
			org.eclipse.debug.core.model.IValue value = new org.kermeta.kp.editor.debug.KpDebugValue(debugTarget, id, valueString, valueRefType, childVariables);
			
			String variableName = properties.get("!name");
			String variableRefType = properties.get("!type");
			
			org.kermeta.kp.editor.debug.KpDebugVariable variable = new org.kermeta.kp.editor.debug.KpDebugVariable(debugTarget, variableName, value, variableRefType);
			variables[i++] = variable;
		}
		return variables;
	}
	
	private void sendCommand(org.kermeta.kp.editor.debug.EKpDebugMessageTypes command, String... parameters) {
		org.kermeta.kp.editor.debug.KpDebugMessage message = new org.kermeta.kp.editor.debug.KpDebugMessage(command, parameters);
		communicationHelper.sendEvent(message, output);
	}
	
	private org.kermeta.kp.editor.debug.KpDebugMessage sendCommandAndRead(org.kermeta.kp.editor.debug.EKpDebugMessageTypes command, String... parameters) {
		org.kermeta.kp.editor.debug.KpDebugMessage message = new org.kermeta.kp.editor.debug.KpDebugMessage(command, parameters);
		return communicationHelper.sendAndReceive(message, output, reader);
	}
	
}
