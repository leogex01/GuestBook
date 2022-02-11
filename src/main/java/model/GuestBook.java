/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Feb 9, 2022
 */
package model;


public class GuestBook {
	String name;
	
	
	public GuestBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GuestBook(String name) {
		super();
	    this.name = capitalizeWords(name);
		
	}

	public void setName(String name) {
		this.name = capitalizeWords(name);
	}



	//Capitalize names
	
		public String getName() {
		return this.name;
	}

		public static String  capitalizeWords(String str) {
			String words[] =str.split("\\s");   //Had to look up regex
			String capitalizeWords="";
			for(String w:words) {
				String first=w.substring(0,1);  //get first element of array
				String afterFirst = w.substring(1); 
				capitalizeWords+=first.toUpperCase()+afterFirst + ""; //cat name 
			}
			return capitalizeWords.trim();
	    }
				
		@Override
		public String toString() {
			return "GuestBook [name=" + name + ", getName()=" + getName() + "]";
		}




		
        
		

		
		
}
	  
	
	


