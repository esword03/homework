import java.util.*;


public class C0801 {
   
     @SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	 String a=new Scanner(System.in).nextLine();
        	 String[] str=a.split(" ");
        	 int b=Integer.parseInt(str[0]);
        	 int c=Integer.parseInt(str[1]);
        	 System.out.println(b/c);
        	
        }catch(NumberFormatException ne) {
        	ne.printStackTrace();
        	
        }catch(ArithmeticException ae) {
        	ae.printStackTrace();
        }finally {
        	System.out.println("总是被执行");
        }
        }
}


