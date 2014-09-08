import java.util.Scanner;


public class Ask {
	public static String InputFile(){
		Scanner scan = null;
		String f;
		try{
			System.out.println("Type path to file\n");
			scan = new Scanner(System.in);
			f = scan.nextLine();
		}
		finally{
			scan.close();
		}
		return f;
	}
}
