
public class Project {
	private String name;
	private int dur;
	private int score;
	private int bestBefore;
	private String[] roles;

	public Project(String name, int dur, int score, int bestBefore, String[] roles){
		this.name = name;
		this.dur = dur;
		this.score = score;
		this.bestBefore = bestBefore;
		this.roles = roles;
	}

}
