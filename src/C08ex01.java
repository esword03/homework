import java.util.Scanner;

public class C08ex01 {
	static int a;

	@SuppressWarnings("resource")
	public static void main(String[] args){
		// TODO Auto-generated method stub
		try{int a= new Scanner(System.in).nextInt();
		    compare(a);
		}catch(ByteSizeException e) {
			e.printStackTrace();
			
		}

	}public static void compare(int a)throws ByteSizeException {
		if(a>-128&&a<127) {
			System.out.println("输入的数字是byte类型");
		}
		else {
			throw new ByteSizeException();
		}
	}

}
