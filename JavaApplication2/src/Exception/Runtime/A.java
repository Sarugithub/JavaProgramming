/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception.Runtime;

/**
 *
 * @author SACHIN AGRAWAL
 */
public class A {
        static void demoproc(){
            try {
                throw new NullPointerException("Demo");
                // control goes to immediate matched exception in catch
                // If matched exception is not found in nearest catch then control goes to another catch in the program,
                // IF matched exception is found in another catch it will executed 
                //If matched exception is not found in any catch, system prints stack trace.
                
            } catch(NullPointerException e){
                System.out.println("Inside DemoProc ...." +e);
                throw e;  // rethrow exception 
            }
            
                        
}
        public static void main(String args[]) 
        {
            try{
                 demoproc();
            }
            catch(ArithmeticException e) {
              System.out.println("Rethrow .."+e);
                
            }
           
            
        }
    }
    

