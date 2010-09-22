/**
 *
 */
package samples;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

/**
 *
 */
public class JmDNSResolveBug
{

    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException
    {
        final ExecutorService executor = Executors.newSingleThreadExecutor();

        JmDNS mDNS = JmDNS.create();

        final AtomicBoolean serviceResolvedCalled = new AtomicBoolean();

        mDNS.addServiceListener("_test._tcp.local.", new ServiceListener() {
            @Override
            public void serviceResolved(final ServiceEvent event)
            {
                // Should be called before get/requestServiceInfo returned
                serviceResolvedCalled.set(true);
            }

            @Override
            public void serviceRemoved(ServiceEvent event)
            {
                //
            }

            @Override
            public void serviceAdded(final ServiceEvent event)
            {
                // Kick off the resolver
                // BUG: Why isn't requestServiceInfo asynchronous and why doesn't
                // it work in the JmDNS event thread?
                executor.submit(new Runnable() {
                    @Override
                    public void run()
                    {
                        ServiceInfo info = event.getDNS().getServiceInfo(event.getType(), event.getName());

                        if (info == null)
                        {
                            System.out.println("Couldn't resolve service");
                            System.exit(3);
                        }
                        else
                        {
                            System.out.print("Service resolved and ");
                        }

                        boolean called = serviceResolvedCalled.get();

                        // Give some additional time (doesn't change anything)
                        if (!called)
                        {
                            try
                            {
                                Thread.sleep(1000);
                            }
                            catch (InterruptedException ie)
                            {
                                //
                            }
                        }

                        if (!serviceResolvedCalled.get())
                        {
                            System.out.println("serviceResolved NOT called");
                            System.exit(1);
                        }
                        else
                        {
                            if (!called)
                            {
                                System.out.println("Never happens");
                            }

                            System.out.println("serviceResolved called");
                            System.exit(0);
                        }
                    }
                });
            }
        });

        System.in.read();
        System.exit(2);
    }

}
