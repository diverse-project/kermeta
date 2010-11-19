/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.network.utilities;

import java.net.InetAddress;

/**
 * Holds {@link InetAddress} information for the cache.
 * @author gnain
 */
public class InetAddressRecord {

    private String ip;

    public InetAddressRecord(InetAddress addr) {
        ip = addr.getHostAddress();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean equals(Object o) {
        if(o instanceof InetAddress) {
            InetAddress addr = (InetAddress)o;
            return addr.getHostAddress().equals(ip);
        } else if(o instanceof InetAddressRecord) {
            return ip.equals(((InetAddressRecord)o).ip);
        }
        return false;
    }

    public String toString() {
        return ip;
    }

}
