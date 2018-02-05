package monitor;

import monitor.component.CustomMonitor;
import monitor.component.Spyer;

/**
 * @author verne on 18-2-5.
 * @version 1.0
 */

public class MonitorTest {

    public static void main(String[] args) {
        Spyer spyer = new Spyer();
        CustomMonitor customeMonitor = new CustomMonitor();
        spyer.registMonitors(customeMonitor);
        spyer.update("testUpdate");
        spyer.removeMonitor(customeMonitor);
        spyer.removeMonitor(new CustomMonitor());

    }
}
