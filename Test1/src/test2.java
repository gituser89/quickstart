
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test2 {

	
	public static void main(String args[]) throws IOException
	{
		/*
		BufferedWriter writeIt = new BufferedWriter(new FileWriter("D:/EWorkspace/test.txt"));
		writeIt.write("Hello");
		writeIt.newLine();
		writeIt.write("This is a test....");
		writeIt.close();
		*/
   BufferedReader read = new BufferedReader(new FileReader("D:/EWorkspace/test.txt"));
   String line;
   while((line = read.readLine())  != null)
   {
	   System.out.println(line);
   }
  }
}
