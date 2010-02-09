package main;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatelessKnowledgeSession;

public class Main {

	private Applicant applicant;

	void process(){
		KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
		KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
		kbuilder.add( ResourceFactory.newClassPathResource( "test.drl", getClass() ),
		              ResourceType.DRL );
		if ( kbuilder.hasErrors() ) {
		    System.err.println( kbuilder.getErrors().toString() );
		}
		kbase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
		StatelessKnowledgeSession ksession = kbase.newStatelessKnowledgeSession();
		applicant = new Applicant( "Mr John Smith",16,true);
		ksession.execute( applicant );
		
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Main m = new Main();
		m.process();
		System.err.println(m.applicant.isValid());
		
	}

}
