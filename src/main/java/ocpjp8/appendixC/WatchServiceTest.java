package ocpjp8.appendixC;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.*;

/**
 * Created by Lukasz on 2016-09-17.
 */
public class WatchServiceTest {

    /**
     * Even though the WatchService API allows us to monitor a directory for changes, it does so with a number of known
     * drawbacks. First off, it is possible to miss directory change events, hence the need for the OVERFLOW event to
     * tell the application that a set of changes was discarded.
     Second, when events are lost, we do not get any information about the lost events, other than we know that something
     was lost. Receiving no information about precisely which events were lost might make some people refrain from using
     the WatchService API altogether.
     Finally, some JVMs implementations of the WatchService API are inefficient, with significant delays between the time
     that the directory is modified and the moment that the application is notified about the change. Some developers
     have even reported delays of up to five seconds. This may not seem like a significant amount of time to you, but
     for someone writing an application that continuously monitors a directory for changes, this may have a drastic
     impact on their application.
     */

    @Test
    public void test1() {
        try (WatchService service = FileSystems.getDefault().newWatchService()) {
            // Register for events
            Path zooData = Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources\\zoo\\data");
            Path zooLog = Paths.get("C:\\Users\\Lukasz\\IdeaProjects\\OCPJP_Java8_1Z0-813\\src\\main\\resources\\zoo\\log");
            zooData.register(service, StandardWatchEventKinds.ENTRY_CREATE,
                    StandardWatchEventKinds.ENTRY_DELETE,
                    StandardWatchEventKinds.ENTRY_MODIFY);
            zooLog.register(service, StandardWatchEventKinds.ENTRY_MODIFY);

            // Poll for events
            for(;;) {
                WatchKey key;
                try {
                    key = service.take();
                } catch (InterruptedException x) {
                    break;
                }

                // Retrieve events for key
                for (WatchEvent<?> event: key.pollEvents()) {
                    WatchEvent.Kind<?> kind = event.kind();
                    if (kind == StandardWatchEventKinds.OVERFLOW) {
                        continue;
                    }

                    // Process event
                    WatchEvent<Path> watchEvent = (WatchEvent<Path>)event;
                    Path path = watchEvent.context();
                    System.out.println("[eventType="+kind
                            +", path="+path.getFileName()+"]");
                }

                // Remember to always reset event key
                if(!key.reset()) {
                    break;
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
