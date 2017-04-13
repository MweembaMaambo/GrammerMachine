/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grammermachine;

/**
 *
 * @author Cus
 */

import java.util.Scanner;

public class GrammerMachine {

     
    public static void main(String[] args) {
        String[] expression = new String[2]; //stores each variable of the expression
        
        
       String[] grammer;
        
        int n = 0; //determines if the expression is regular or context free
        
    
        
        Scanner input = new Scanner(System.in);
        
        
         Prime pr = new Prime();
         
         language language = new language(10);
        
        
        System.out.println("The system draws trees for expressions of the form a^n b^n: n E all prime numbers");
        System.out.println();
        
        System.out.println("The variables used in this GrammarMachine are :");
        System.out.println("a and b");
        System.out.println();
        
        for (int i=0;i< expression.length;i++){
           System.out.println("Enter Variable:");
           expression[i] = input.nextLine(); 
        
       
        }
             System.out.println();
        
          
        do{
            
            System.out.println("Enter a prime number where L = {a^p.b^p : p>=2}");
		int z=Integer.parseInt(input.nextLine());
        while (!pr.isPrimeNum(z)){
            System.out.println("The number you entered is not prime number.");
			System.out.println("");
                     System.out.println(" Try again.");
			System.out.println("");   
		System.out.println("Enter prime number p where a^p.b^p");
		z=Integer.parseInt(input.nextLine());
		}
          
             
        grammer = new String[(expression.length * 2)]; //stores the grammer            
            
        int j = 0;
        for (int i = 0; i < expression.length; i++) //inserts the grammer into the array
        {            
            grammer[j] = expression[i];
            grammer[j +1] = expression[i] +" "+ "S";
            j += 2;
        }
            
        System.out.println();
        
        //display the grammer 
        System.out.println("Grammer: ");
        for( int i = 1; i < grammer.length; i+=2)
        {
            System.out.print(grammer[i] + "/ " );
        }
        System.out.println("^");
        System.out.println();
        
      
                
                
             
            
        // printing out this tree!!!
      //The tree is a left derivation tree
        
	        String A = "";
		String B = "";
		String Variable = "S";	
		System.out.println(Variable);
                
                 //prints a tree of a's only       
		for (int r = 0; r < z; r++)
        {
            A += "a";
            String fs;
            fs = String.format("%s%s", A, Variable);
            System.out.println(fs);
            
            
        }
		
		
		//prints a tree of b's only
		for(int x = 0; x < z; x++){
			B += "b";
			String fs;
			fs = String.format("%s%s%s", A, B,Variable);
			System.out.println(fs);
			
		}
		System.out.printf("%s%s%c", A, B, '\u03BB');
		
		System.out.println("");
		System.out.println("");
		
		//printing the language of the given prime.	
			language.add(A, B);	
		
                System.out.println("");
		
		System.out.print("L = { " );
		
                language.display();
                System.out.print("}");
                System.out.println("");
                System.out.println("");
              
           System.out.println("-------------------------------------------------------------------------------------------------");
              
                          
          } while (!language.isEmpty());
        
         
    } 
}   
  
    
     


	
          
        
    
    
