import java.util.*;
public class b1 {
	 static List<Object> list;
	 Object c;
	 public b1() {
		 list=new LinkedList<>();
	 }
	
	boolean a;
	 
	 public void put(Object o) {
		
		 list.add(o);
	 }
	 public Object get(int index) {
		 c=list.get(index);
		 list.remove(index);
		 return c;
	 }
	 public boolean isEmpty() {
		 a=list.isEmpty();
		 return a;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		b1 b=new b1();
		
		b.put("a");
		b.put("b");
		b.put(56);
		b.get(0);
		
		System.out.println(list);
		b.get(0);System.out.println(b.c);
		b.get(0);System.out.println(b.c);
		System.out.println(b.isEmpty());
		
		
	}

}
