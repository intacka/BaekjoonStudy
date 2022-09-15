import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		String[] str = new String[cnt];
		
		
		for (int i = 0; i<cnt; ++i) {
			str[i] = br.readLine();
		}
		
		for (int i = 0; i < cnt; ++i) {
			StringTokenizer st = new StringTokenizer(str[i]);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a + b);
		}
		
	}
}

