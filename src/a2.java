import java.util.Scanner;
//ºÏ≤‚”–∂‡…Ÿe
public class a2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		String a= new Scanner(System.in).next();
		char[] a1=a.toCharArray();
		for(int i=0; i<a1.length;i++) {
			if(a1[i]=='e') {
				num++;
				
			}
		
		
		}System.out.println(num);
         
	}

}
