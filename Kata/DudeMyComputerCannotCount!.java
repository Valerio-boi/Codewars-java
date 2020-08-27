import java.util.HashMap;
import java.util.Map;

public class VisitorStatistics {
    private long counter;
    private Map<String, Long> visitorCount = new HashMap<>();

    public void visit(String name) {
        counter++;
        Long oldCount = visitorCount.get(name);
        long newCount = 1L;
        if (oldCount != null) {
            newCount += oldCount;
        }
        visitorCount.put(name, newCount);
    }

    public long totalVisits() {
        return counter;
    }

    public long visitsBy(String name) {
        return visitorCount.getOrDefault(name, 0L);
    }
}