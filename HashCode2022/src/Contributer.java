import java.util.HashMap;

public class Contributer {
    String name;
    HashMap<String, Integer> skillMap = new HashMap<String, Integer>();

    public Contributer(String name, String[] skills, int[] levels){
        this.name = name;

        for(int i = 0; i < skills.length; i++){
            skillMap.put(skills[i], levels[i]);
        }
    }

}
