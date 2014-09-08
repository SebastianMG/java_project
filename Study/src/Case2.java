import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Case2 extends Menu_switch {
	public Case2()
    {
    about = "Deleting all whitespaces: \n  ";
    }
	public static void Edit(){
		FileReader pl=null;
		String sCurrentLine="";
		System.out.println("Input file:\n\n");
		try{
		pl = new FileReader("src/data");
	} catch (FileNotFoundException e) {
	       System.out.println("Opening file error!");
	       System.exit(1);
	   }
		BufferedReader bfr = new BufferedReader(pl);
		try{
			while((sCurrentLine = bfr.readLine()) != null){
				System.out.println(sCurrentLine);
				sCurrentLine = sCurrentLine.replaceAll(" ", "");
				if(sCurrentLine.length() != 0){
					writer.save_me(sCurrentLine);
				}
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
    public Menu_switch  giveCase()
    {   
        System.out.println(about);
        Edit();
		try{
			Save("src/data");
		}
		catch(IOException e){
			e.printStackTrace();
		}
        System.out.println("Output file:\n\n");
        try{
        	Print("src/data");
        }
        catch(IOException e){
        	e.printStackTrace();
        }
        Delete("src/temp");
        return this;
    }

}
