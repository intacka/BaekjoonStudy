import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str;
		StringTokenizer st;
		while (true) {
			str = br.readLine();
			st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
				if (a == 0 && b == 0) {
					break;
				}
			bw.write((a+b) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
	}
}