//By Mykyta Horbenko 25259002 and Chenming Tao 25251621

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// This class tracks trips for a transport pass
public class UsageLog {
    private TransportPass pass;           // Associated pass
    private List<String> logEntries;      // Trip logs

    public UsageLog(TransportPass pass) {
        this.pass = pass;
        this.logEntries = new ArrayList<>();
    }

    // Add a trip record with timestamp and optional description
    public void addTrip(String description) {
        String entry = LocalDateTime.now() + " - " + description;
        logEntries.add(entry);
    }

    //Print all trips
    public void printLog() {
        System.out.println("Usage log for pass: " + pass.getPassId());
        if (logEntries.isEmpty()) {
            System.out.println("No trips recorded.");
        } else {
            for (String entry : logEntries) {
                System.out.println(entry);
            }
        }
    }

    // Count trips
    public int totalTrips() {
        return logEntries.size();
    }
}
