
public class Project {
	private String name; //Name of project
	private int dur; //Duration of project
	private int score; //Score project is worth
	private int bestBefore; //Number of days before project decays
	private String[] roles; //Roles that project needs

	public Project(String name, int dur, int score, int bestBefore, String[] roles){
		this.name = name;
		this.dur = dur;
		this.score = score;
		this.bestBefore = bestBefore;
		this.roles = roles;
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

	public String[] getRoles(){
		return this.roles;
	}
}
