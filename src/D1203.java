import java.io.*;
public class D1203 {
	static String c;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		try (BufferedReader reader=new BufferedReader(new FileReader("c:/test.txt"));
				){
			
			
			String a=reader.readLine();
			System.out.println("从文件c:/test.txt中读取的内容是:"+a);
			char[] b=a.toCharArray();
			for(int i=0;i<b.length;i++) {
				if(b[i]=='l') {
					b[i]='L';
				}
			}
			c=new String(b);
			
		}catch(IOException e) {
			e.printStackTrace();}
		
		try(BufferedWriter writer=new BufferedWriter(new FileWriter("c:/test.txt"));){
			
		
			
			writer.write(c);
			
			System.out.println("通过过滤流写到文件c:/test.txt中的内容是："+c);
			
		}catch(IOException i) {
			i.printStackTrace();
		}
		
	

}}
