package org.kermeta.art2.framework.baselib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.kermeta.art2.framework.baselib.channeltype.DefaultServiceChannelType;
import org.kermeta.art2.framework.baselib.channeltype.DefaultServiceChannelTypeFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );

        DefaultServiceChannelType channel = DefaultServiceChannelTypeFactory.createChannel();
        System.out.println(channel.getBindedPorts().size());

    }
}
