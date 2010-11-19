/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.network.utilities;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gnain
 */
public class NetworkAddressesUtilsTest {

    public NetworkAddressesUtilsTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of intIpToString method, of class NetworkUtils.
     */
    @Test
    public void testIntIpToString() {
        System.out.println("intIpToString");
        int ip = -1062731420;
        String expResult = "192.168.1.100";
        String result = NetworkAddressesUtils.intIpToString(ip);
        assertEquals(expResult, result);

    }

    /**
     * Test of stringIpToInt method, of class NetworkUtils.
     */
    @Test
    public void testStringIpToInt() {

        System.out.println("stringIpToInt");

        try{
            NetworkAddressesUtils.stringIpToInt("fe80:0:0:0:223:12ff:fe1a:3c6e%5");
            fail("Should have thrown an exception");
        } catch(UnsupportedOperationException e) {
        }

        try{
            NetworkAddressesUtils.stringIpToInt("192.168.1.4");
        } catch(Exception e) {
            fail("Should not have thrown an exception");
        }


        String ip1 = "192.168.1.100";
        int expResult1 = -1062731420;
        int result1 = NetworkAddressesUtils.stringIpToInt(ip1);
        assertEquals(expResult1, result1);


        String ip2 = "192.168.1.104";
        int expResult2 = -1062731416;
        int result2 = NetworkAddressesUtils.stringIpToInt(ip2);
        assertEquals(expResult2, result2);

        assertTrue((!ip1.equals(ip2)) && (result1 != result2));

    }

    /**
     * Test of sameSubNet method, of class NetworkUtils.
     */
    @Test
    public void testSameSubNet() {
        System.out.println("sameSubNet");
        
        String ip1 = "192.168.1.1";
        String ip2 = "192.168.1.2";
        String netMask = "24";
        boolean expResult = true;
        boolean result = NetworkAddressesUtils.sameSubNet(ip1, ip2, netMask);
        assertEquals(expResult, result);

        String ip3 = "192.168.0.2";
        boolean expResult2 = false;
        boolean result2 = NetworkAddressesUtils.sameSubNet(ip1, ip3, netMask);
        assertEquals(expResult2, result2);

    }

    

}