package monitor.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class Spyer {

    private List<Monitor> monitors = new ArrayList<Monitor>();

    private String forUpdate = new String();

    public synchronized void registMonitors(Monitor monitor) {
        System.out.println("do regist monitor");
        this.monitors.add(monitor);
    }

    public synchronized void removeMonitor(Monitor monitor) {
        if (this.monitors.contains(monitor)) {
            System.out.println("remove monitor");
            monitors.remove(monitor);
        } else {
            System.out.println("monitor not found");
        }
    }

    public void infoMonitors() {
        monitors.stream().forEach(aMonitor -> {
            aMonitor.doAfterUpdate(this.forUpdate);
        });
    }
    public void update(String updateString) {
        this.forUpdate = updateString;
        System.out.println("do other thing");
        this.infoMonitors();
    }


}
