package org.kermeta.smartadapters.drools;

import java.io.FileReader;
import java.io.Reader;
import java.util.Properties;

import org.drools.RuleBase;
import org.drools.RuleBaseConfiguration;
import org.drools.RuleBaseFactory;
import org.drools.StatelessSession;
import org.drools.compiler.DroolsError;
import org.drools.compiler.PackageBuilder;
import org.drools.compiler.PackageBuilderConfiguration;
import org.drools.rule.Package;
import org.osgi.framework.BundleContext;

public class RuleCreator {
	
	public StatelessSession createRule(BundleContext bundleContext, String drl) throws Exception {
		/*OsgiEnvironmentClassLoader classLoader = new OsgiEnvironmentClassLoader(bundleContext,
				Thread.currentThread().getContextClassLoader(), bundleContext.getBundle());
		*/
		Reader drlSource = new FileReader(drl); 
			
			//new InputStreamReader(bundleContext.getBundle().getResource(drl).openStream());
		
		Properties properties = new Properties();
		properties.setProperty("drools.dialect.java.compiler", "JANINO");
		PackageBuilderConfiguration config = new PackageBuilderConfiguration(bundleContext.getClass().getClassLoader(), properties);
		PackageBuilder builder = new PackageBuilder(config);
		
		for(DroolsError error : builder.getErrors().getErrors()){
			System.err.println(error.getMessage());
		}
		
		builder.addPackageFromDrl(drlSource);
		
		for(DroolsError error : builder.getErrors().getErrors()){
			System.err.println(error.getMessage());
		}
		
		Package pkg = builder.getPackage();
		
		RuleBaseConfiguration ruleBaseConfig = new RuleBaseConfiguration();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase(ruleBaseConfig);
		ruleBase.addPackage(pkg);
		
		return ruleBase.newStatelessSession();
	}
	
}
