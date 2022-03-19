package yaklasim;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PastByValueCollections {

    public static void main(String[] args) {
        Map<String, String> maps = new HashMap<> ();
        maps.put("1","1");
        maps.put("2","2");
        maps.put("3","3");
        maps.put("4","4");
        maps.put("5","5");
        String id = "3";
        Set<String> entriesToRemove = getEntriesToRemove(id, maps);
        System.out.println(maps);
    }

    private static Set<String> getEntriesToRemove(String customerId, Map<String, String> cache) {
        Set<String> entriesToRemove = new HashSet<>();
        for (Map.Entry<String, String> entry : cache.entrySet()) {
            String key = entry.getKey();
          if (customerId != null) {
                String entryCustomerId = (String) entry.getValue();
                if (customerId.equals(entryCustomerId)) {
                    entriesToRemove.add(key);
                }
            }
        }
        return entriesToRemove;
    }
}


