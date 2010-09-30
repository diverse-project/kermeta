package org.kermeta.art2.framework.baselib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.kermeta.art2.framework.Art2Actor;
import org.kermeta.art2.framework.baselib.channeltype.DefaultServiceChannelType;
import org.kermeta.art2.framework.baselib.channeltype.DefaultServiceChannelTypeFactory;
import org.kermeta.art2.framework.message.Art2Message;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp() {
        assertTrue(true);

        /*
        DefaultServiceChannelType channel = DefaultServiceChannelTypeFactory.createChannel();
        ((Art2Actor) channel).start();

        Art2Message msg = new Art2Message();
        System.out.println("Hu");
        ((Art2Actor) channel).$bang(msg);

        channel.dispatch(msg);

        System.out.println(((Art2Actor) channel).mailboxSize());

        ((Art2Actor) channel).stop();
        System.out.println(channel.getBindedPorts().size());*/

    }
}
