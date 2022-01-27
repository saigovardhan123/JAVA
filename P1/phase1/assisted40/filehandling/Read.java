package filehandling;

import java.io.*;
import java.util.Scanner;

public class Read {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			File f=new File("C:\\\\Users\\\\User\\\\abc.txt");
			try {
			Scanner s=new Scanner(f);
			while(s.hasNextLine()) {
				String data=s.nextLine();
				System.out.println(data);
			}
			s.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}