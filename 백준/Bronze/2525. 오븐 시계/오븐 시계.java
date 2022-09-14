import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str1);
		
		
		int hour = Integer.parseInt(st.nextToken());
		int min = Integer.parseInt(st.nextToken());
		int rqT = Integer.parseInt(str2);
		
		int rqHour = rqT/60;
		int rqMin = rqT%60;
		
		if ((min + rqMin) >= 60) {
					if ((hour+rqHour) >= 23) {
						System.out.println((hour+rqHour+1-24) + " " + (min+rqMin-60));
					} else {
						System.out.println((hour+rqHour+1) + " " + (min+rqMin-60)); // OK
					}
		} else {
					if ((hour+rqHour) >= 24) {
						System.out.println((hour+rqHour-24) + " " + (min+rqMin));
					} else {
						System.out.println((hour+rqHour) + " " + (min+rqMin));
					}
		}
		
	}
}
