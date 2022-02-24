import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {

	static ArrayList<Contributer> contributers = new ArrayList<>();
	static ArrayList<Project> projects = new ArrayList<>();
	
	public static void main(String[] args) throws Exception {
		// change this filename for each input
		String fileName = "a_an_example.in.txt";
		
		File file = new File("input/" + fileName);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st = br.readLine();
		String[] nums = st.split(" ");
		
		// number of contributers
		int c = Integer.valueOf(nums[0]);
		// number of projects
		int p = Integer.valueOf(nums[0]);
		
		// make contributers ArrayList
		for (int i=0; i<c; i++) {
			st = br.readLine();
			nums = st.split(" ");
			String name = nums[0];
			int s = Integer.valueOf(nums[1]);
			
			String[] skills = new String[s];
			int[] levels = new int[s];
			for (int j=0; j<s; j++) {
				st = br.readLine();
				nums = st.split(" ");
				skills[0] = nums[0];
				levels[0] = Integer.valueOf(nums[1]);
			}
			contributers.add(new Contributer(name, skills, levels));
		}
		
		// make projects ArrayList
		for (int i=0; i<p; i++) {
			st = br.readLine();
			nums = st.split(" ");
			String name = nums[0];
			int dur = Integer.valueOf(nums[1]);
			int score = Integer.valueOf(nums[2]);
			int bestBefore = Integer.valueOf(nums[3]);
			int s = Integer.valueOf(nums[4]);
			
			String[] roles = new String[s];
			for (int j=0; j<s; j++) {
				st = br.readLine();
				nums = st.split(" ");
				skills[0] = nums[0];
				levels[0] = Integer.valueOf(nums[1]);
			}
			contributers.add(new Contributer(name, skills, levels));
		}
		
		br.close();
	}

}
