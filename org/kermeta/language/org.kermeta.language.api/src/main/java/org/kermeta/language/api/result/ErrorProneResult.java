/* $Id:$ 
 * Creation : 1 dec. 2010
 * Licence  : EPL 
 * Copyright: IRISA/INRIA
 * Authors  : 
 *            Didier Vojtisek <didier.vojtisek@inria.fr>
 */
package org.kermeta.language.api.result;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.kermeta.language.api.messaging.ProblemMessage;
import org.kermeta.language.api.messaging.ProblemMessage.Severity;

/**
 * Result that can report errors or warning
 * Usually in case of error, the other data fields might be empty or incomplete
 * This class is intended to be subclassed to specify the data fields
 */
public class ErrorProneResult {
	
	/**
	 * List of the problems returned by a process
	 */
	protected List<ProblemMessage> problems = new ArrayList<ProblemMessage>();

	public List<ProblemMessage> getProblems() {
		return problems;
	}
	
	/**
	 * indicates if there are some problems with a severity ERROR or FATAL
	 * @return
	 */
	public boolean hasSevereProblems() {
		boolean result = false;
		Iterator<ProblemMessage> it = problems.iterator();
		while(it.hasNext() && !result){
			ProblemMessage pm = it.next();
			if(pm.getSeverity().equals(Severity.ERROR) || pm.getSeverity().equals(Severity.FATAL)){
				result = true;
			}
		}
		return result;
	}
	
	
}
