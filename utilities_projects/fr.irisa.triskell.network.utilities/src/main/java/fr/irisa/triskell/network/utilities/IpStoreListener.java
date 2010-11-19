/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.network.utilities;

import java.net.InetAddress;
import java.net.NetworkInterface;

/**
 * Listener to be informed of changes in {@link NetworkInterface} or {@link InetAddress}
 * @author gnain
 */
public interface IpStoreListener {



    /**
     * Called when a new {@link NetworkInterface} is found.
     * @param ni The new {@link NetworkInterface}.
     */
    void networkInterfaceAdded(NetworkInterface ni);

    /**
     * Called when a {@link NetworkInterface} disapears.
     * @param nir the corresponding {@link NetworkInterfaceRecord}.
     */
    void networkInterfaceRemoved(NetworkInterfaceRecord nir);




    /**
     * Called when a {@link NetworkInterface} switches from UP to DOWN.
     * @param ni The concerned {@link NetworkInterface}.
     */
    void networkInterfacePulledDown(NetworkInterface ni);
    /**
     * Called when a {@link NetworkInterface} switches from DOWN to UP.
     * @param ni The concerned {@link NetworkInterface}.
     */
    void networkInterfacePulledUp(NetworkInterface ni);




    /**
     * Called when a new {@link InetAddress} is added to a {@link NetworkInterface}.
     * @param ni The {@link NetworkInterface} the {@link InetAddress} is added to.
     * @param newValue The new {@link InetAddress}
     */
    void newIpOnInterface(NetworkInterface ni, InetAddress newValue);
    
    /**
     * Called when a new {@link InetAddress} is removed from a {@link NetworkInterface}.
     * @param nir The NetworkInterfaceRecord the {@link InetAddress} have been removed from.
     * @param addr The removed {@link InetAddressRecord}.
     */
    void ipRemovedOnInterface(NetworkInterfaceRecord nir, InetAddressRecord addr);



}
