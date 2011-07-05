package org.kermeta.language.builder.eclipse.internal.executionner;

import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class KermetaRunner<G,H> extends Thread{
	
	final private Map<G,H> waitingList;
	final private Map<G,H> runningList;
	final private G concernedResource;
	final private H concernedElement;
	final private KermetaExecutionner<G,H> concernedExecution;
	
	
	/**
	 * This class allow a sequential execution in following a specific algorithm.
	 * Do not forget to synchronize the map passed as parameters.
	 * @param waitingList map SYNCRHONIZED containing the execution waiting the end of the previous execution
	 * @param runningList map SYNCRHONIZED containing the execution currently running
	 * @param concernedResource IResource used as key of the previous list and concerned by the execution
	 * @param concernedElement Object representing data needed by the execution
	 * @param concernedExecution KermetaExecutionned containing the execution
	 */
	public KermetaRunner(Map<G,H> waitingList,Map<G,H> runningList,G concernedResource,H concernedElement,KermetaExecutionner<G,H> concernedExecution) {
		this.waitingList = waitingList;
		this.runningList = runningList;
		this.concernedResource = concernedResource;
		this.concernedElement = concernedElement;
		this.concernedExecution = concernedExecution;
	}

	@Override
	public void run() {
		final Lock lock = new ReentrantLock();
		
		H currentElement = concernedElement;
		if (waitingList.containsKey(concernedResource)) {
			waitingList.put(concernedResource, currentElement);
		} else {
			if (runningList.containsKey(concernedResource)) {
				waitingList.put(concernedResource, currentElement);
			} else {
				lock.lock();
				try {
					boolean endProcess = false;
					while (!endProcess) {
						try {
							runningList.put(concernedResource, currentElement);
							concernedExecution.execute(concernedResource,currentElement);
						} finally {
							if (! waitingList.containsKey(concernedResource)) {
								runningList.remove(concernedResource);
								endProcess = true;
							} else {
								currentElement = waitingList.get(concernedResource);
								waitingList.remove(concernedResource);
							}
						}
					}
				} finally {
					lock.unlock();
				}
			}
		}
		
	}

}
