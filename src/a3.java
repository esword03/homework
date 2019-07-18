import java.util.Arrays;
public class a3 {
	static double[] b=new double[10]; 
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			double a=(int)(Math.random()*101);
			b[i]=a;
			
		}
		Arrays.sort(b);
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
	}

}
