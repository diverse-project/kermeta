/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.irisa.triskell.network.utilities;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Handles the {@link NetworkInterface} cacheing.
 * @author gnain
 */
public class IpStoreCache {

    /**
     * Cached NetworkInterfaces
     */
    private Collection<NetworkInterfaceRecord> cache = new ArrayList<NetworkInterfaceRecord>();

    /**
     * Adds a {@link NetworkInterface} to the cache.
     * @param inface the {@link NetworkInterface} to be added.
     * @return the corresponding {@link NetworkInterfaceRecord} created.
     */
    public NetworkInterfaceRecord addNetworkInterfaceRecord(NetworkInterface inface) {
        NetworkInterfaceRecord rec = new NetworkInterfaceRecord(inface);
        cache.add(rec);
        return rec;
    }

    /**
     * Removes a {@link NetworkInterface} from the cache.
     * @param inface the {@link NetworkInterface} to be removed.
     */
    public void removeNetworkInterfaceRecord(NetworkInterface inface) {
        NetworkInterfaceRecord toBeRemoved = getRecord(inface);
        if(toBeRemoved != null) {
            cache.remove(toBeRemoved);
        }
    }

    /**
     * Retreives the NetworkInterfaceRecord for a NetworkInterface.
     * @param inface The NetworkInterface to retreive the record for.
     * @return the corresponding NetworkInterfaceRecord cached. null if not found.
     */
    public NetworkInterfaceRecord getRecord(NetworkInterface inface) {

        Iterator<NetworkInterfaceRecord> storedRec = cache.iterator();
        NetworkInterfaceRecord searched = null;

        while(storedRec.hasNext() && searched == null) {
            NetworkInterfaceRecord current = storedRec.next();
            if(current.equals(inface)) {
                searched = current;
            }
        }
        return searched;
    }

    /**
     * Tels if the cache contains an entry for the given {@link NetworkInterface}.
     * @param inface the {@link NetworkInterface} to search an entry for.
     * @return true if found. false otherwise.
     */
    public boolean contains(NetworkInterface inface) {
        return getRecord(inface) != null;
    }

    /**
     * Makes a diff between the cache and the given collection: stored - newCollection.
     * @param newCollection the colletion to make the diff with.
     * @return a collection containing all {@link NetworkInterfaceRecord} of the cache not contained in the given collection.
     */
    public Collection<NetworkInterfaceRecord> diffWith(Collection<NetworkInterfaceRecord> newCollection) {
        Collection<NetworkInterfaceRecord> diff = new ArrayList<NetworkInterfaceRecord>();
        for(NetworkInterfaceRecord rec : cache) {
            if(!newCollection.contains(rec)) {
                diff.add(rec);
            }
        }
        return diff;
    }

    /**
     * Updates the cache with the given collection.
     * @param newCollection the collection to update the cache with.
     */
    public void updateWith(Collection<NetworkInterfaceRecord> newCollection) {
        cache = newCollection;
    }

}
