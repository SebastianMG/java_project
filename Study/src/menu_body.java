class menu_body {
	private static menu_body instance = null;
	private static  int indentyfikator;
	private menu_body()
	{
		String menu = "\n" + "Hello" + "\n" + "1.remove any word" +
				"\n" + "2.remove whitespaces" + "\n\n";
		System.out.print(menu);
	}

	public static synchronized menu_body giveMenu()
	{
		if(instance ==null)
		{
			instance = new menu_body();
			return instance;
		}
		System.out.println("Menu ju¿ zosta³o utworzone");
		return instance;
	}
	public void about()
	{
		System.out.println("Indentyfikator = " + indentyfikator);
	}
}
