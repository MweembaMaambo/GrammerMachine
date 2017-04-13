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


public class Prime {
    boolean[] prime=new boolean[10];
     
    public boolean isPrimeNum(int i) {
        int factors = 0;
        int j = 1;

        while(j <= i)
        {
            if(i % j == 0)
            {
                factors++;
            }
            j++;
        }
        return (factors == 2);
	}
   // public void displayString(){
		
	//}
}
//----------------------------------------------------------------------------------------------------------------------------------
     class language{  
    language[] language ;
   // String[] language = new String[10];
    int E;
    
        String A;
	String B;
	
	public language (String a, String b){
		A = a;
		B = b;
	}
	
	public void displayString(){
		System.out.print(A + B + ", ");
	}
    
    public language(int maxsize){
        maxsize=10;
        language= new language [maxsize];
        E = 0;
    }
    public void add(String a, String b){
		language[E] = new language(a,b);
		E++;
	}
	
	public void display(){
		for(int i = 0; i<E; i++)
		language[i].displayString();
	}
    
         public boolean isEmpty(){
		if(language[0] == null)
			return true;
		else
			return false;
	}
    
}
