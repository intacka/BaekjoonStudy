import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		
		int[] input = new int[3];
		for (int i = 0; i < input.length; ++i) {
			input[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println((input[0]+input[1])%input[2]);
		System.out.println(((input[0]%input[2]) + (input[1]%input[2]))%input[2]);
		System.out.println((input[0]*input[1])%input[2]);
		System.out.println(((input[0]%input[2]) * (input[1]%input[2]))%input[2]);
		
	}

}


