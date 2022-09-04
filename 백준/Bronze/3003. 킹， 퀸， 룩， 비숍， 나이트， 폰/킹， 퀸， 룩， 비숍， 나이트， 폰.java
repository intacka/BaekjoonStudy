import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int[] cnt = new int[6];
		int[] full = new int[] {1, 1, 2, 2, 2, 8};
		for( int i = 0; i < 6 ; i++) {
			cnt[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int j = 0; j< full.length; ++j) {
			cnt[j] = full[j] - cnt[j];
			System.out.print(cnt[j] + " ");
		}
		
	}

}


