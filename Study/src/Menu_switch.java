import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

abstract class Menu_switch {
	
	protected String about;
    public abstract Menu_switch giveCase();
    protected void Save(String file) throws IOException	{
    	BufferedReader br = new BufferedReader(new FileReader("src/temp"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    	try {
    		 String temp = "";
    		 while ((temp = br.readLine()) != null) {
    			 bw.write(temp);
    			 bw.newLine();
    			 bw.flush();
    		 }
    		 while ((temp = br.readLine()) != null) {
    			 bw.write(temp);
    			 bw.newLine();
    			 bw.flush();
    		 }
    	}
    	catch (IOException e) {
    		 e.printStackTrace();
    	 }
    	finally {
    		bw.close();
    		br.close();
    	}
    }
    protected void Print(String file) throws IOException{
    	String line = "";
    	BufferedReader bfr = new BufferedReader(new FileReader(file));
    	try{
			while((line = bfr.readLine()) != null){
				System.out.println(line);
			}
		} catch (IOException e){ 
			e.printStackTrace();
		} finally {
			try {
                if (bfr != null)bfr.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
		}
    }
    protected void Delete(String path){
    	try{
    		 
    		File file = new File(path);
 
    		if(file.delete()){
    			System.out.println(file.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
 
    	}catch(Exception e){
 
    		e.printStackTrace();
 
    	}
    }
}
     

