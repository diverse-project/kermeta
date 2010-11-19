/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.irisa.triskell.network.utilities;

/**
 *
 * @author gnain
 */
public class NetworkAddressesUtils {

    /**
     * Converts from an int value of an IP to a String in ###.###.###.### format.
     * @param ip the ip to convert.
     * @return the string value.
     */
    public static String intIpToString(int ip) {
        String result = "";
        for (int i = 0; i < 4; i++) {
            result = Integer.toString(
                    (ip >> (8 * i)) & 0x000000FF) + (result == "" ? "" : ".") + result;
        }
        return result;
    }

    /**
     * Converts from an IP String in ###.###.###.### format to an int
     * @param ip the ip to convert.
     * @return the int value.
     */
    public static int stringIpToInt(String ip) {
        if(ip.contains(":") || !ip.contains(".")) throw new UnsupportedOperationException("This method do nut support IPV6 or any IP string not formated as ###.###.###.###");
        String[] remoteIpBytes = ip.split("\\.");

        int result = 0x00000000;
        for (int i = 0; i < remoteIpBytes.length; i++) {
            result = (result << 8) | Integer.valueOf(remoteIpBytes[i]).intValue();
        }

        return result;
    }


    /**
     * Parses a NET_MASK in decimal format (ie: 192.168.1.100/24 => 24) to an integer.
     * @param maskInt The int value of the short NET_MASK (ie: 24)
     * @return the mask into an int.
     */
    public static int shortMaskToLong(int maskInt) {
        return 0xFFFFFFFF << (32 - maskInt);
    }

    /**
     * Checks if two IP addresses are on the same subnet.
     * @param ip1 The first ip in ###.###.###.### format.
     * @param ip2 The second ip in ###.###.###.### format.
     * @param netMask The NET_MASK in short format (eg: 24)
     * @return true if the two ip addresses are on the same sub-net. False otherwise.
     */
    public static boolean sameSubNet(String ip1, String ip2, String netMask) {
        int ip1Int = stringIpToInt(ip1);
        int ip2Int = stringIpToInt(ip2);
        int maskInt = shortMaskToLong(Integer.valueOf(netMask).intValue());
        return (ip1Int & maskInt) == (ip2Int & maskInt);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ip1 = "192.168.1.100";
        String mask = "24";
        String ip2 = "192.168.1.104";

        System.out.println("IP:" + ip1 + " => " + stringIpToInt(ip1));
        System.out.println("IP:" + ip2 + " => " + stringIpToInt(ip2));


        int ip2Int = stringIpToInt(ip2);
        int maskInt = shortMaskToLong(Integer.valueOf(mask).intValue());

        System.out.println("" + ip1 + " et " + ip2 + " sont sur le meme réseau ? "
                + (sameSubNet(ip1, ip2, mask) ? "OUI:" + intIpToString((ip2Int & maskInt)) : "NON"));


    }
}
