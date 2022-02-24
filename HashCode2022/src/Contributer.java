import java.util.HashMap;

public class Contributer {
    private String name;
    private HashMap<String, Integer> skillMap = new HashMap<String, Integer>();

    public Contributer(String name, String[] skills, int[] levels){
        this.name = name;

        for(int i = 0; i < skills.length; i++){
            skillMap.put(skills[i], levels[i]);
        }
    }

    public String getName(){
        return name;
    }

    public int getLevel(String skill){
        return skillMap.get(skill);
    }

    public void changeLevel(String skill, int newLevel){
        skillMap.put(skill, newLevel);
    }

}
