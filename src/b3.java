import java.util.*;
public class b3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> a=new TreeSet<>();
		a.add("apple");
		a.add("grape");
		a.add("banana");
		a.add("pear");
		
		Object[] b=a.toArray();
		System.out.println("����Ԫ��Ϊ"+b[3]);
		System.out.println("��С��Ԫ��Ϊ"+b[0]);
		
		System.out.println(a);
		
		

	}

}
