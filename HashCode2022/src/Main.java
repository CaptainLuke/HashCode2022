import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) throws Exception {
		File file = new File("input/a_an_example.in.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st = br.readLine();
		String[] nums = st.split("");
		int c = Integer.valueOf(nums[0]);
		int p = Integer.valueOf(nums[0]);
		
		for (int i=0; i<c; i++) {
			String con = br.readLine();
			nums = st.split("");
			String name = nums[0];
			int s = Integer.valueOf(nums[1]);
			for (int i=0; i<c; i++) {
				
			}
			
		}
		
		br.close();
	}

}
