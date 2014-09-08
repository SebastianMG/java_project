
class Case_creator {
	public Menu_switch CaseCreating(String about)
	   {
	       Menu_switch choose = null;
	       if(about.equalsIgnoreCase("Case1"))
	       {
	           choose = new Case1();
	       }
	       if(about.equalsIgnoreCase("Case2"))
	       {
	           choose = new Case2();
	       }
	       return choose.giveCase();
	   }
}
