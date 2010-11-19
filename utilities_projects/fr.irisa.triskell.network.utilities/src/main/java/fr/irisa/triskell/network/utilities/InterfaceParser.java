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
import java.util.Enumeration;

/**
 * Parses all {@link NetworkInterface} and their {@link InetAddress}. Fills up the cahe.
 * @author gnain
 */
public class InterfaceParser extends Thread implements Runnable {

    private IpStoreCache cache = new IpStoreCache();
    private boolean stillRunning = true;
    private IpStore store;
    private int updateLatency;

    /**
     * Navigates through all {@link NetworkInterface} and {@link InetAddresses} to fill up the cache.
     * @param store the associated Store.
     * @param updateLatency the amount of time in millis between two updates.
     */
    public InterfaceParser(IpStore store, int updateLatency) {
        this.store = store;
        this.updateLatency = updateLatency;
    }

    /**
     * Kills the thread.
     */
    public void halt() {
        stillRunning = false;
    }

    /**
     * Tels if the thread is stopping.
     * @return true is {@link #halt} have been called.
     */
    public boolean isHalted() {
        return !stillRunning;
    }

    public void run() {

        while (stillRunning) {
            try {

                Collection<NetworkInterfaceRecord> parsedInterfaces = new ArrayList<NetworkInterfaceRecord>();

                Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
                while (interfaces.hasMoreElements()) {

                    NetworkInterface inface = interfaces.nextElement();
                    NetworkInterfaceRecord interfaceRecord = null;

                    //UPDATE
                    if (cache.contains(inface)) {
                        interfaceRecord = updateInterfaceRecord(inface);
                    } else {
                        //ADD
                        store.fireNetworkInterfaceAdded(inface);
                        interfaceRecord = addInterfaceInCache(inface);
                    }
                    parsedInterfaces.add(interfaceRecord);
                }

                //REMOVED
                Collection<NetworkInterfaceRecord> diff = cache.diffWith(parsedInterfaces);

                for(NetworkInterfaceRecord rc : diff) {
                    store.fireNetworkInterfaceRemoved(rc);
                }

                //UpdateCache
                cache.updateWith(parsedInterfaces);

                Thread.sleep(updateLatency);
            } catch (SocketException ex) {
                ex.printStackTrace();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }

        }
    }

    private NetworkInterfaceRecord addInterfaceInCache(NetworkInterface inface) {
        NetworkInterfaceRecord rec = new NetworkInterfaceRecord(inface);
        fillIpForNetworkInterfaceRecord(inface, rec);
        return rec;
    }

    private NetworkInterfaceRecord updateInterfaceRecord(NetworkInterface inface) {
        try {
            NetworkInterfaceRecord record = cache.getRecord(inface);
            if (record.isUp() != inface.isUp()) {
                //Check UP/DOWN
                if (inface.isUp()) {
                    fillIpForNetworkInterfaceRecord(inface, record);
                    store.fireNetworkInterfacePulledUp(inface);
                } else {
                    store.fireNetworkInterfacePulledDown(inface);
                }
                record.setUp(inface.isUp());
            } else {
                //Check IPs
                checkIp(inface, record);
            }
            return record;
        } catch (SocketException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    private void checkIp(NetworkInterface inface, NetworkInterfaceRecord record) {
        //Check IPs

        Collection<InetAddressRecord> parsedInetAddr = new ArrayList<InetAddressRecord>();

        Enumeration<InetAddress> freshAddresses = inface.getInetAddresses();
        while (freshAddresses.hasMoreElements()) {

            InetAddress temp = freshAddresses.nextElement();
            InetAddressRecord addressRecord = record.getInetAddressRecord(temp);

            if ( addressRecord == null) {
                //ADD
                addressRecord = record.addInetAddress(temp);
                store.fireNewIpOnInterface(inface, temp);
            }
            
            parsedInetAddr.add(addressRecord);
        }

        //REMOVED
        Collection<InetAddressRecord> diff = record.diffInetAddressWith(parsedInetAddr);
        for(InetAddressRecord rc : diff) {
            store.fireIpRemovedOnInterface(record, rc);
        }

        //UpdateCache
        record.updateInetAddressWith(parsedInetAddr);

    }

    private void fillIpForNetworkInterfaceRecord(NetworkInterface inface, NetworkInterfaceRecord rec) {
        Enumeration<InetAddress> addresses = inface.getInetAddresses();
        while (addresses.hasMoreElements()) {
            InetAddress temp = addresses.nextElement();
            rec.addInetAddress(temp);
            store.fireNewIpOnInterface(inface, temp);
        }
    }
}
