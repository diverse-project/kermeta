/*$Id:  $
* License : EPL
* Copyright : IRISA / INRIA 
* ----------------------------------------------------------------------------
* Creation date : 27 avr. 2011
* Authors : 
*      Cédric Bouhours <cedric.bouhours@inria.fr>
*/

package org.kermeta.language.builder.eclipse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.kermeta.language.builder.eclipse.internal.CompilerFromKP;
import org.kermeta.language.builder.eclipse.internal.KPBuilder;
import org.kermeta.language.builder.eclipse.internal.KermetaParser;
import org.kermeta.language.builder.eclipse.internal.executionner.KermetaRunner;
import org.kermeta.language.structure.ModelingUnit;
import org.kermeta.utils.helpers.FileHelpers;
import org.kermeta.utils.systemservices.api.messaging.MessagingSystem;
import org.kermeta.utils.systemservices.api.reference.FileReference;

public class KermetaBuilder extends org.kermeta.language.builder.api.Builder{
	
	public static final String KP_FILE_EXTENSION = "kp";
	public static final String KMT_FILE_EXTENSION = "kmt";
	public HashMap<String,KPBuilder> kpBuilders = new HashMap<String,KPBuilder>();
	
	private static KermetaBuilder instance = null;
	private static Map<IResource,String> _parsingInProgress = new HashMap<IResource,String>();
	private static Map<IResource,String> _parsingInPending = new HashMap<IResource,String>();
	private static Map<IResource,String> parsingInProgress = Collections.synchronizedMap(_parsingInProgress);
	private static Map<IResource,String> parsingInPending = Collections.synchronizedMap(_parsingInPending);
	private static Map<HashMap<String,KPBuilder>,String> _compilingInProgress = new HashMap<HashMap<String,KPBuilder>,String>();
	private static Map<HashMap<String,KPBuilder>,String> _compilingInPending = new HashMap<HashMap<String,KPBuilder>,String>();
	private static Map<HashMap<String,KPBuilder>,String> compilingInProgress = Collections.synchronizedMap(_compilingInProgress);
	private static Map<HashMap<String,KPBuilder>,String> compilingInPending = Collections.synchronizedMap(_compilingInPending);
	private final static Lock lockForParse = new ReentrantLock();
	private final static Lock lockForCompile = new ReentrantLock();
	

	private KermetaBuilder(){	
		super();
	}
	
	public static KermetaBuilder getDefault() {
		if (instance == null) {
			instance = new KermetaBuilder();
		}
		return instance;
	}
	
	@Override
	public String generateIdentifier(IResource element) {
		if (element == null) {
			return "";
		}
		return element.getFullPath().toOSString();		
	}

	@Override
public synchronized void runFromKP(final String kpIdentifier, final ArrayList<String> params) {
		
		Job job = new Job("Running "+kpBuilders.get(kpIdentifier).getKpProjectFile().getRawLocation()) {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					Job buildJob = new Job("Build before run "+ kpBuilders.get(kpIdentifier).getKpProjectFile().getRawLocation()) {
						protected IStatus run(IProgressMonitor monitor) {
							try {
								if (kpBuilders.get(kpIdentifier).build(true,params, monitor)) return Status.OK_STATUS;
								else return Status.CANCEL_STATUS;
							} catch (Exception e) {
								try {
									Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Unable to build this project.\n "+e.getMessage(), LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpBuilders.get(kpIdentifier).getKpFileURL())));
								} catch (Exception u) {
									e.printStackTrace();
								}
								return Status.CANCEL_STATUS;
							}
						}
					};
					buildJob.setPriority(Job.LONG);
					buildJob.schedule();
					buildJob.join();
					if(buildJob.getResult() == Status.OK_STATUS){					
						kpBuilders.get(kpIdentifier).runKP(params, monitor);
					}
					else{
						Activator.getDefault().getMessaggingSystem4Runner(kpIdentifier).logProblem(MessagingSystem.Kind.UserERROR, "Cannot run. The project has build error\n ", LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpBuilders.get(kpIdentifier).getKpFileURL())));
					}
					
				} catch (Exception e) {
					try {
						Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Unable to build this project.\n "+e.getMessage(), LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpBuilders.get(kpIdentifier).getKpFileURL())));
					} catch (Exception u) {
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
	        }
	    };
	    job.setPriority(Job.LONG);
	    job.schedule();
	}
	
	@Override
	public synchronized void buildFromKP(final String kpIdentifier) {
		
		Job job = new Job("Building "+kpBuilders.get(kpIdentifier).getKpProjectFile().getRawLocation()) {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					kpBuilders.get(kpIdentifier).build(monitor);
				} catch (Exception e) {
					try {
						Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Unable to build this project.\n "+e.getMessage(), LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpBuilders.get(kpIdentifier).getKpFileURL())));
					} catch (Exception u) {
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
	        }
	    };
	    job.setPriority(Job.LONG);
	    job.schedule();	
	}
	
	public synchronized void cleanBuildFromKP(final String kpIdentifier) {
		
		Job job = new Job("Full build of "+kpBuilders.get(kpIdentifier).getKpProjectFile().getRawLocation()) {
			protected IStatus run(IProgressMonitor monitor) {
				try {
					KPBuilder builder = kpBuilders.get(kpIdentifier);
					builder.clean(monitor);
					builder.build(monitor);
				} catch (Exception e) {
					try {
						Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserERROR, "Unable to build this project.\n "+e.getMessage(), LOG_MESSAGE_GROUP, new FileReference(FileHelpers.StringToURL(kpBuilders.get(kpIdentifier).getKpFileURL())));
					} catch (Exception u) {
						e.printStackTrace();
					}
				}
				return Status.OK_STATUS;
	        }
	    };
	    job.setPriority(Job.LONG);
	    job.schedule();	
	}
	
	@Override
	public void compileFromKP(String kpIdentifier) {
		KermetaRunner<HashMap<String,KPBuilder>,String> theRunner = new KermetaRunner<HashMap<String,KPBuilder>,String>("Compiling "+kpIdentifier,lockForCompile,compilingInPending, compilingInProgress, kpBuilders, kpIdentifier, new CompilerFromKP());
		theRunner.schedule();
	}
	@Override 
	public void compileFromKP(String kpIdentifier, boolean checkEnabled) {
		KermetaRunner<HashMap<String,KPBuilder>,String> theRunner = new KermetaRunner<HashMap<String,KPBuilder>,String>("Compiling "+kpIdentifier,lockForCompile,compilingInPending, compilingInProgress, kpBuilders, kpIdentifier, new CompilerFromKP(checkEnabled));
		theRunner.schedule();
	}

	@Override
	public void parseSpecificFile(IResource toParse, String content) {
		KermetaRunner<IResource,String> theRunner = new KermetaRunner<IResource,String>("Parsing "+toParse.getName(), lockForParse, parsingInPending, parsingInProgress, toParse, content, new KermetaParser());
		theRunner.schedule();		
	}

	@Override
	public String findKPidentifierFromKMT(IResource kmt) {
		String kmtIdentifier = generateIdentifier(kmt);
		
		String kpIdentifier = kpIdentifierFinder(kmtIdentifier);
		if (kpIdentifier != null)
			return kpIdentifier;
		
		//Here the identifier is not found. Perhaps, the file index is not up to date
		for (KPBuilder aKPBuilder : kpBuilders.values()) {
			try {
				aKPBuilder.refreshFileIndex();
			} catch (IOException e) {}
		}
		
		kpIdentifier = kpIdentifierFinder(kmtIdentifier);
		if (kpIdentifier != null)
			return kpIdentifier;
		
		return null;
	}

	private String kpIdentifierFinder(String kmtIdentifier) {
		for (String aKPIdentifier : kpBuilders.keySet()) {
			for (String anIdentifier : kpBuilders.get(aKPIdentifier).kpFiles.keySet()) {
				if (kmtIdentifier.equals(anIdentifier)) {
					return aKPIdentifier;
				}
			}			
		}
		return null;
	}

	@Override
	public void setDirty(IResource kmt, boolean dirty) {
		try {
			Activator.getDefault().getMessaggingSystem().flushProblem(LOG_MESSAGE_GROUP, kmt.getLocationURI().toURL());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		if (kpBuilders.get(findKPidentifierFromKMT(kmt)) != null) {
			if (kpBuilders.get(findKPidentifierFromKMT(kmt)).kpFiles.get(generateIdentifier(kmt)) != null) {
				kpBuilders.get(findKPidentifierFromKMT(kmt)).kpFiles.get(generateIdentifier(kmt)).dirtyFile = dirty;		
			} else {
				try {				
					Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserWARNING, "not able to retreive a kp project referencing "+kmt+ ", completion support reduced to minimal", LOG_MESSAGE_GROUP, new FileReference(kmt.getLocationURI().toURL()));
				} catch (MalformedURLException e) {
					e.printStackTrace();
				}
			}
		}
		else{
			try {
				Activator.getDefault().getMessaggingSystem().logProblem(MessagingSystem.Kind.UserWARNING, "not able to retreive a kp project referencing "+kmt+ ", completion support reduced to minimal", LOG_MESSAGE_GROUP, new FileReference(kmt.getLocationURI().toURL()));
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public ModelingUnit getKpLastModelingunit(String kpIdentifier) {
		if (kpBuilders.get(kpIdentifier) != null)
			return kpBuilders.get(kpIdentifier).kp_last_modelingunit;
		else
			return null;
	}
	
	public void findKPinProject(IContainer aProject, ArrayList<IFile> identifiedKp) throws CoreException {
		for (IResource aMember : aProject.members()) {
			if (aMember instanceof IFile) {
				if (((IFile) aMember).getFileExtension() != null) {
					if (((IFile) aMember).getFileExtension().equals(KP_FILE_EXTENSION)) {
						identifiedKp.add((IFile) aMember);
					}
				}
			} else {
				if (aMember instanceof IContainer) {
					findKPinProject((IContainer) aMember, identifiedKp);
				}
			}
		}
	}
	
	public String getDefaultMainClass(IFile kpFile) {
		
		if (kpBuilders.get(generateIdentifier(kpFile)) != null) {
			String mainclass = kpBuilders.get(generateIdentifier(kpFile)).getDefaultMainClass();
			return (mainclass == null)?"":mainclass;
		}
		
		return "";
	}
	
	public String getDefaultMainOperation(IFile kpFile) {
		
		if (kpBuilders.get(generateIdentifier(kpFile)) != null) {
			String mainop = kpBuilders.get(generateIdentifier(kpFile)).getDefaultMainOperation();
			return (mainop == null)?"":mainop;
		}
		
		return "";
	}
	
	public static void flushProblems(ArrayList<URL> kpSources) {
		for (URL oneURL : kpSources) {
			Activator.getDefault().getMessaggingSystem().flushProblem(KermetaBuilder.LOG_MESSAGE_GROUP, oneURL);
		}
	}
}
