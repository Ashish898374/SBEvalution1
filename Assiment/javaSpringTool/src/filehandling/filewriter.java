package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {
	public static void main(String[] args) throws IOException  {
  FileWriter f=new FileWriter("apna.txt");
  f.write(102);
  System.out.println("welcome");
  f.flush();
  f.close();
	}

}
