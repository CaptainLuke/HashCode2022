import java.util.HashMap;

public class Project {
	private String name; //Name of project
	private int dur; //Duration of project
	private int score; //Score project is worth
	private int bestBefore; //Number of days before project decays
	private HashMap<String, Integer> roleMap;

	public Project(String name, int dur, int score, int bestBefore, String[] roles, int[] levels){
		this.name = name;
		this.dur = dur;
		this.score = score;
		this.bestBefore = bestBefore;
		roleMap = new HashMap<String, Integer>();

		for(int i = 0; i < roles.length; i++){
            roleMap.put(roles[i], levels[i]);
        }
	}

	public String getName(){
		return this.name;
	}

	public int getDur(){
		return this.dur;
	}

	public int getScore(){
		return this.score;
	}

	public int getBestBefore(){
		return this.bestBefore;
	}

	public int getLevel(String role){
		return roleMap.get(role);
	}

}
