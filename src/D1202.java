import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class D1202 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path a=Paths.get("d:/io/copydes.doc");
		Path b=Paths.get("d:/io/copysrc.doc");
		try {
			Files.copy(b, a);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		}

}


