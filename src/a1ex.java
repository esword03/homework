import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class a1ex {

	@SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        System.out.println("���뵱ǰʱ�䣺��ʽΪ��-��-ʱ-��-��");
		String bj=new Scanner(System.in).next();
    
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-HH-mm-ss");
    
		Date bj1=sdf.parse(bj);
    
    
		long Bj=bj1.getTime();
    
		long Bl=Bj+7*60*60*1000;
    
		long Ny=Bj+12*60*60*1000;
		Date Ny1=new Date(Ny);
		Date Bl1=new Date(Bl);
    
    
		System.out.println("ŦԼʱ��Ϊ��"+Ny1.getDay()+"-"+Ny1.getHours()+"-"+Ny1.getMinutes()+"-"+Ny1.getSeconds());
    
		System.out.println("����ʱ��Ϊ��"+Bl1.getDay()+"-"+Bl1.getHours()+"-"+Bl1.getMinutes()+"-"+Bl1.getSeconds());
	}

}
