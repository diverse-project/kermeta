

/*$Id: TypeFilterTest.java,v 1.2 2008-06-02 13:29:12 ftanguy Exp $
* Project : org.kermeta.kpm.test.workbench
* File : 	ResourceDeletionTest.java
* License : EPL
* Copyright : IRISA / INRIA / Universite de Rennes 1
* ----------------------------------------------------------------------------
* Creation date : 30 mai 08
* Authors : paco
*/

package org.kermeta.kpm.test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Date;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.kermeta.kpm.EventDispatcher;
import org.kermeta.kpm.KpmManager;

import fr.irisa.triskell.kermeta.kpm.Event;
import fr.irisa.triskell.kermeta.kpm.FilterExpression;
import fr.irisa.triskell.kermeta.kpm.KPM;
import fr.irisa.triskell.kermeta.kpm.KpmFactory;
import fr.irisa.triskell.kermeta.kpm.Out;
import fr.irisa.triskell.kermeta.kpm.Rule;
import fr.irisa.triskell.kermeta.kpm.TypeFilter;
import fr.irisa.triskell.kermeta.kpm.Unit;

/**
 * 
 * TypeFilterTest
 * 		oneFolfer
 * 			oneFile.kmt
 * 		
 * @author paco
 *
 */
public class TypeFilterTest extends WorkbenchTest {

	static private boolean _rulesAddedForFile = false;

	static private boolean _rulesAddedForFolder = false;
	
	static private Rule _updateLastTimeModifiedRuleForFile = null;
	
	static private Rule _updateLastTimeModifiedRuleForFolder = null;
	
	private void checkRulesForFile(KPM kpm) {
		if ( ! _rulesAddedForFile ) {
			_rulesAddedForFile = true;
			_updateLastTimeModifiedRuleForFile = KpmFactory.eINSTANCE.createRule();
			Event e = KpmFactory.eINSTANCE.createEvent();
			e.setName( "updateLastTimeModified" );
			kpm.getEvents().add(e);
			_updateLastTimeModifiedRuleForFile.setEvent(e);
			_updateLastTimeModifiedRuleForFile.setName( "Update Last TimeModified" );
			
			// Precondition
			FilterExpression fe = KpmFactory.eINSTANCE.createFilterExpression();
			TypeFilter tf = KpmFactory.eINSTANCE.createTypeFilter();
			tf.setJavaClassName( "org.eclipse.core.resources.IFile" );
			kpm.getFilters().add(tf);
			fe.setFilter( tf );
			_updateLastTimeModifiedRuleForFile.setPrecondition( fe );
			
			// Out
			Out o = KpmFactory.eINSTANCE.createOut();
			o.setExtensionPoint( "org.kermeta.kpm.test.workbench.updateLastTimeModified" );
			_updateLastTimeModifiedRuleForFile.getOuts().add(o);
			
			kpm.getRules().add(_updateLastTimeModifiedRuleForFile);
		}
	}
	
	private void checkRulesForFolder(KPM kpm) {
		if ( ! _rulesAddedForFolder ) {
			_rulesAddedForFolder = true;
			_updateLastTimeModifiedRuleForFolder = KpmFactory.eINSTANCE.createRule();
			Event e = KpmFactory.eINSTANCE.createEvent();
			e.setName( "updateLastTimeModified" );
			kpm.getEvents().add(e);
			_updateLastTimeModifiedRuleForFolder.setEvent(e);
			_updateLastTimeModifiedRuleForFolder.setName( "Update Last TimeModified" );
			
			// Precondition
			FilterExpression fe = KpmFactory.eINSTANCE.createFilterExpression();
			TypeFilter tf = KpmFactory.eINSTANCE.createTypeFilter();
			tf.setJavaClassName( "org.eclipse.core.resources.IFolder" );
			kpm.getFilters().add(tf);
			fe.setFilter( tf );
			_updateLastTimeModifiedRuleForFolder.setPrecondition( fe );
			
			// Out
			Out o = KpmFactory.eINSTANCE.createOut();
			o.setExtensionPoint( "org.kermeta.kpm.test.workbench.updateLastTimeModified" );
			_updateLastTimeModifiedRuleForFolder.getOuts().add(o);
			
			kpm.getRules().add(_updateLastTimeModifiedRuleForFolder);
		}
	}
	
	@Before
	public void setUp() throws InterruptedException {
		_project = _workspace.getRoot().getProject("TypeFilterTest");
		KpmTestJob job = new KpmTestJob() {
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				_project.create(monitor);
				_project.open(monitor);
				IFolder folder = _project.getFolder( new Path("oneFolder") );
				folder.create(true, true, monitor);
				IFile file = folder.getFile( new Path("oneFile.kmt") );
				InputStream is = new ByteArrayInputStream("some input".getBytes());
				file.create(is, true, monitor);
				return Status.OK_STATUS;
			}
		};
		job.execute();
	}
	
	@After
	public void tearDown() throws InterruptedException {
		removeProject();
	}
		
	@Test
	public void checkFileFilterOnFile() throws InterruptedException {
		Unit file = KpmManager.getDefault().getUnit( "platform:/resource/TypeFilterTest/oneFolder/oneFile.kmt" );
		checkRulesForFile( (KPM) file.eContainer() );
		file.getRules().add( _updateLastTimeModifiedRuleForFile );
		
		Date t1 = file.getLastTimeModified();
		EventDispatcher.sendEvent(file, "updateLastTimeModified", null, null);
		Thread.sleep(1000);
		Date t2 = file.getLastTimeModified();
		Assert.assertTrue( ! t1.equals(t2) );
	}
	
	@Test
	public void checkFileFilterOnFolder() throws InterruptedException {
		Unit folder = KpmManager.getDefault().getUnit( "platform:/resource/TypeFilterTest/oneFolder" );
		checkRulesForFile( (KPM) folder.eContainer() );
		folder.getRules().add( _updateLastTimeModifiedRuleForFile );
		
		Date t1 = folder.getLastTimeModified();
		EventDispatcher.sendEvent(folder, "updateLastTimeModified", null, null);
		Thread.sleep(1000);
		Date t2 = folder.getLastTimeModified();
		Assert.assertTrue( t1.equals(t2) );
	}
	
	@Test
	public void checkFolderFilterOnFile() throws InterruptedException {
		Unit file = KpmManager.getDefault().getUnit( "platform:/resource/TypeFilterTest/oneFolder/oneFile.kmt" );
		checkRulesForFolder( (KPM) file.eContainer() );
		file.getRules().add( _updateLastTimeModifiedRuleForFolder );
		
		Date t1 = file.getLastTimeModified();
		EventDispatcher.sendEvent(file, "updateLastTimeModified", null, null);
		Thread.sleep(1000);
		Date t2 = file.getLastTimeModified();
		Assert.assertTrue( t1.equals(t2) );
	}
	
	@Test
	public void checkFolderFilterOnFolder() throws InterruptedException {
		Unit folder = KpmManager.getDefault().getUnit( "platform:/resource/TypeFilterTest/oneFolder" );
		checkRulesForFolder( (KPM) folder.eContainer() );
		folder.getRules().add( _updateLastTimeModifiedRuleForFolder );
		
		Date t1 = folder.getLastTimeModified();
		EventDispatcher.sendEvent(folder, "updateLastTimeModified", null, null);
		Thread.sleep(1000);
		Date t2 = folder.getLastTimeModified();
		Assert.assertTrue( ! t1.equals(t2) );
	}

}


