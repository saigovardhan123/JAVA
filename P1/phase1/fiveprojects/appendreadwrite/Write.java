package appendreadwrite;



import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	FileWriter f=new FileWriter("C:\\\\Users\\saigovd\\\\abc.txt");

	f.write("welcome to java");
	f.close();
	System.out.println("succesfilly updated");
	}
		catch(IOException e) {
		e.printStackTrace();
	}
	}

}