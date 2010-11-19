/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.network.utilities;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Holds {@link NetworkInterface} information for the cache.
 * @author gnain
 */
public class NetworkInterfaceRecord {

    /**
     * Name of the interface
     */
    private String interfaceName;

    /**
     * List of IPs linked to this interface.
     */
    private Collection<InetAddressRecord> addresses;

    /**
     * Is interface UP
     */
    private boolean up;

    /**
     * Created a lightweight storage structure for cacheing {@link NetworkInterface}
     * @param iface The {@link NetworkInterface} to be cached.
     */
    public NetworkInterfaceRecord(NetworkInterface iface) {
        try {

            interfaceName = iface.getName();
            up = iface.isUp();
            addresses = new ArrayList<InetAddressRecord>();

        } catch (SocketException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Retreives the cached interface name. Can be compared to {@link NetworkInterface#getName}
     * @return the name of the interface.
     */
    public String getInterfaceName() {
        return interfaceName;
    }

    /**
     * Gives the cached state of the interface.
     * @return true if the interface have been cached UP. false otherwise.
     */
    public boolean isUp() {
        return up;
    }

    /**
     * Sets the activation state of the cached {@link NetworkInterface}.
     * @param up true if the interface is UP. false otherwise.
     */
    public void setUp(boolean up) {
        this.up = up;
        if(!up) {
            addresses.clear();
        }
    }

    /**
     * Overriden to allow testing if:<br/> - Two {@link NetworkInterfaceRecord} are equivalent<br/> - A {@link NetworkInterfaceRecord} corresponds to a {@link NetworkInterface}.
     * @param o The object to test equality with. Can be either {@link NetworkInterface} or {@link NetworkInterfaceRecord}.
     * @return true if {@link NetworkInterfaceRecord} is the same.<br/> true if {@link NetworkInterfaceRecord} correspond to the{@link  NetworkInterface}.<br/> false otherwise.
     */
    public boolean equals(Object o) {
        if(o instanceof NetworkInterface) {
            return interfaceName.equals(((NetworkInterface)o).getName());
        } else if(o instanceof NetworkInterfaceRecord) {
            return interfaceName.equals(((NetworkInterfaceRecord)o).getInterfaceName());
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return interfaceName + "(" + (isUp()?"UP":"DOWN") + ")";
    }

    /**
     * Creates and add an {@link InetAddressRecord} to this {@link NetworkInterface}.
     * @param addr The {@link InetAddress} to create a record for.
     * @return the created {@link InetAddressRecord}.
     */
    public InetAddressRecord addInetAddress(InetAddress addr) {
        InetAddressRecord rc = new InetAddressRecord(addr);
        addresses.add(rc);
        return rc;
    }

    /**
     * Tels if an {@link InetAddress} is present in the record list of this interface.
     * @param address The {@link InetAddress} to be tested.
     * @return true if found. false otherwise.
     */
    public boolean containsInetAddress(InetAddress address) {
        return getInetAddressRecord(address) != null;
    }

    /**
     * Retreives the {@link InetAddressRecord} for an {@link InetAddress}
     * @param address The {@link InetAddress to retreive the record for.
     * @return The {@link InetAddressRecord} if exists. null otherwise.
     */
    public InetAddressRecord getInetAddressRecord(InetAddress address) {
        for(InetAddressRecord rec : addresses) {
            if(rec.equals(address)){
                return rec;
            }
        }
        return null;
    }

    /**
     * Makes a diff between the stored addresses records and the records collection passed in parameter (stored - parameters).
     * @param src The collection to make the diff with.
     * @return All stored elements not present in the collection passed in parameter.
     */
    public Collection<InetAddressRecord> diffInetAddressWith(Collection<InetAddressRecord> src) {
        Collection<InetAddressRecord> diff = new ArrayList<InetAddressRecord>();
        for(InetAddressRecord rec : addresses) {
            if(!src.contains(rec)) {
                diff.add(rec);
            }
        }
        return diff;
    }

    /**
     * Updates the address collecton with the one passed in parameter.
     * @param target The new collection to be stored.
     */
    public void updateInetAddressWith(Collection<InetAddressRecord> target) {
        addresses = target;
    }
    
}
