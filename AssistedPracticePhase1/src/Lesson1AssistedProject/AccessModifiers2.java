package Lesson1AssistedProject;
public class AccessModifiers2 {

	public static void main(String[] args) {
		System.out.println("Dafault Access Specifier");
		DefaultAccessSpecifier obj = new DefaultAccessSpecifier(); 		  
        obj.defaultdisplay(); 
        AccessModifiers2.Privatedisplay(); 
        protecteddisplay();
        publicdisplay();
        
        
	}
	  static private void Privatedisplay() 
	    { 
	        System.out.println("You are using private access specifier"); 
	    }
		static protected void protecteddisplay() 
	    { 
	        System.out.println("This is protected access specifier"); 
	    } 
		static public void publicdisplay() 
	    { 
	        System.out.println("This is Public Access Specifiers"); 
	    } 
	} 
class DefaultAccessSpecifier{
  void defaultdisplay() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
 

}














