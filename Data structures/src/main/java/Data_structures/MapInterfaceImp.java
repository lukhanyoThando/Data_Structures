package Data_structures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapInterfaceImp {
    static Map<String, Integer> map = new HashMap<>();

    public void addStudents(){
        map.put("Lukanyo",95);
        map.put("Thando",78);
    }

    public int getHighestGrade(){
        return Collections.max(map.values());
    }
}