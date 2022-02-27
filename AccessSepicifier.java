package abc;
class defAccessSpecifier
{ 
  void display() 
     { 
         System.out.println("You are using defalut access specifier"); 
     } 
} 

public class AccessSepicifier {

	public static void main(String[] args) {
		                                                
		System.out.println("Dafault Access Specifier"); //default
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
        obj.display(); 

	}
}



