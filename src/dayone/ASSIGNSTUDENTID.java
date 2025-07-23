package dayone;

import java.util.*;

public class ASSIGNSTUDENTID {
    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("Oorvi","Gahan","Bhagvik","Sri","Raj","Raj","Sri");
        Set<String> uniqueNames = new LinkedHashSet<>(studentNames);
        System.out.println("Unique Names: " + uniqueNames);
        Map<Integer,String> studentIdNames = new LinkedHashMap<>();
        int startingId = 101;
        for (String name: uniqueNames){
            studentIdNames.put(startingId++,name);
        }
        System.out.println("Student Names with ID's: " );
        for (Map.Entry<Integer, String> entry : studentIdNames.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }


    }
}
