import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//ºÚµ•œ‡º”
public class a1 {
	private static BufferedReader  stdIn =
			new  BufferedReader(new  InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a=stdIn.readLine();
		String b=stdIn.readLine();
		Integer c=Integer.parseInt(a);
		Integer d=Integer.parseInt(b);
		System.out.println(c+d);

	}

}
