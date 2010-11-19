/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.irisa.triskell.network.utilities;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Maintains a cach of interfaces and associated IPs.
 * @author gnain
 */
public class IpStore {

    /**
     * Listeners
     */
    private Collection<IpStoreListener> listeners;

    /**
     * Network interfaces parser. Could be replaced.
     */
    private InterfaceParser currentParser;

    /**
     * Period between two updates
     */
    private int updateLatency;

    /**
     * Creates a new cache.
     * @param updateLatency Amount of time between two updates (in miliseconds).
     */
    public IpStore(int updateLatency) {
        listeners = new ArrayList<IpStoreListener>();
        this.updateLatency = updateLatency;
    }

    /**
     * Adds a listener to the listener list.
     * @param lst The listener implementation to add.
     */
    public void addIpStoreListener(IpStoreListener lst) {
        listeners.add(lst);
    }

    /**
     * Removes the listener from the list.
     * @param lst The listener to remove.
     */
    public void removeIpStoreListener(IpStoreListener lst) {
        listeners.remove(lst);
    }

    /**
     * Activates the cacheing. Does nothing if already activated.
     */
    public void activate() {
        if (currentParser != null) {
            if (currentParser.isHalted()) {
                try {
                    currentParser.join();
                    currentParser = new InterfaceParser(this, updateLatency);
                    currentParser.start();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        } else {
            currentParser = new InterfaceParser(this, updateLatency);
            currentParser.start();

        }
    }

    /**
     * Stops the cacheing. Destroy the cache.
     */
    public void disactivate() {
        if (currentParser != null) {
            currentParser.halt();
        }
    }

    protected void fireNetworkInterfaceAdded(NetworkInterface ni) {
        //System.out.println("New Interface:" + ni.getName());
        for (IpStoreListener lst : listeners) {
            lst.networkInterfaceAdded(ni);
        }
    }

    protected void fireNetworkInterfaceRemoved(NetworkInterfaceRecord nir) {
        //System.out.println("Interface removed:" + nir.getInterfaceName());
        for (IpStoreListener lst : listeners) {
            lst.networkInterfaceRemoved(nir);
        }
    }

    protected void fireNetworkInterfacePulledDown(NetworkInterface ni) {
        //System.out.println("Interface Pulled Down:" + ni.getName());
        for (IpStoreListener lst : listeners) {
            lst.networkInterfacePulledDown(ni);
        }
    }

    protected void fireNetworkInterfacePulledUp(NetworkInterface ni) {
        //System.out.println("Interface Pulled Up:" + ni.getName());
        for (IpStoreListener lst : listeners) {
            lst.networkInterfacePulledUp(ni);
        }
    }

    protected void fireNewIpOnInterface(NetworkInterface ni, InetAddress newValue) {
        //System.out.println("New Interface IP:" + ni.getName() + "::" + newValue.getHostAddress());
        for (IpStoreListener lst : listeners) {
            lst.newIpOnInterface(ni, newValue);
        }
    }

    protected void fireIpRemovedOnInterface(NetworkInterfaceRecord ni, InetAddressRecord newValue) {
        //System.out.println("Removed Interface IP:" + ni.getInterfaceName() + "::" + newValue.getIp());
        for (IpStoreListener lst : listeners) {
            lst.ipRemovedOnInterface(ni, newValue);
        }
    }

    //For tests purpose.
    public static void main(String[] args) {
        try {
            IpStore store = new IpStore(1000);
            store.activate();
            Thread.sleep(2 * 60 * 1000);
            store.disactivate();
        } catch (InterruptedException ex) {
            Logger.getLogger(IpStore.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
