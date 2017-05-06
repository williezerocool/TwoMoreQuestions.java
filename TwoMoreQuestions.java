/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twomorequestions;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class TwoMoreQuestions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String q1, q2;
        
        System.out.print("Lets play a question game, I'll ask you guess\n Does it stay inside, outside, or both?  ");
        q1 = keyboard.next();
        System.out.print("Is it a living thing?  ");
        q2 = keyboard.next();
        
        if("inside".equals(q1) && "yes".equals(q2) || "both".equals(q1) && "yes".equals(q2) || "outside".equals(q1) && "yes".equals(q2) ){
           System.out.println(" Then it has to be a snake");
       
        }
        
        if("inside".equals(q1) && "no".equals(q2) || "both".equals(q1) && "no".equals(q2) || "outside".equals(q1) && "no".equals(q2) ){
           System.out.println(" Then it has to be a air");
       
        }
    }
    
}
