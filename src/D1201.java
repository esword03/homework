import java.io.*;
import java.util.*;
public class D1201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("c:/Apps");
		String[] a=f.list();
		
		for(String s:a) {
			System.out.println("文件名："+s);
			File f1=new File(f,s);
			System.out.println("路径名："+f1.getPath());
			System.out.println("-----------------------------");
		}

	}

}
