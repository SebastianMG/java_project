import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writer {
	public static void save_me(String temp){
	FileWriter fw = null;

    try {
       fw = new FileWriter("src/temp",true);
          } 
	catch (IOException e) { 
        e.printStackTrace();
     }
 
   BufferedWriter bw = new BufferedWriter(fw);
   try {
	   		 bw.write(temp);
	         bw.newLine();
     } catch (IOException e) {
        e.printStackTrace();
     }

     try {
        bw.close();
     } catch (IOException e) {
           e.printStackTrace();
     }
}
}

