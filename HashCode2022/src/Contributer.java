import java.util.HashMap;

public class Contributer {
    private String name;
    private HashMap<String, Integer> skillMap = new HashMap<String, Integer>();
    private String curProject;

    public Contributer(String name, String[] skills, int[] levels){
        this.name = name;

        for(int i = 0; i < skills.length; i++){
            skillMap.put(skills[i], levels[i]);
        }

        curProject = null;
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

    public String getProject(){
        return this.curProject;
    }

    public void setProject(String project){
        this.curProject = project;
    }

}
