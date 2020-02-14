/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p17;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author marcosjulmas
 */
public class P17 {
  static Scanner keyboard = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    DecimalFormat df = new DecimalFormat("0.00");

        userMenu();
        
        int op = -1;
        keyboard.useDelimiter("\n");
        userMenu();
        while (op != 0) {

            op = keyboard.nextInt();

            switch (op) {
                case 1:
                    int euro=0;
                    float res;
                    System.out.println(" how much Euros");
     euro = keyboard.nextInt();
     
     res = function01(euro);
       System.out.println(res+"USD");
       
     
                
                    break;

                case 2:
                    double resdouble;
                    
                      System.out.println(" how much Euros");
     euro = keyboard.nextInt();
     
     resdouble = function02(euro);
       System.out.println (resdouble+"USD");
       
                 
                    break;
                     case 3:
                    
                     
   break;
                    case 4:
                    String euro1;
                     System.out.println("How many euro? ");
                    euro1 = keyboard.next();
                    int result4 = Function4(euro1);
                    System.out.println(euro1 + " € " + " = " + result4 + " $");
                    break;
                    
                    
           case 5:
              
 System.out.println("How many euros?");
 
           System.out.print("How many euro? ");
            int euro2 = keyboard.nextInt();
                    int result5 = Function5(euro2);
                    System.out.println(df.format(euro2) + "€ " + " = " + result5 + "$");

               
                   
               
               
                    break;

                case 6:
                  
                    break;

                case 7:
                    System.out.println("Letter?");
                    char letter=(keyboard.next()).charAt(0); 
                  String letterBinary=Integer.toBinaryString(letter);
                  
                  System.out.println(letter+"="+letterBinary);
                  
                    break;

                case 8:
                    System.out.println("word?");
                    String str=keyboard.next();
                    String result=function8(str);
                    System.out.println(result);
                     System.out.println(" ");
                    break;

                case 9:
                    
                    break;
                 case 10:
                     function10();
                     
                   
                    break;
                     case 11:
                 
                    break;

           
                case 0:
                   
                   
           
                    break;

                default:
                    System.out.println("no option");

                    break;

            }
        
        /*double preu=100;
        double tax=21;
        double res=function(preu,tax);
      
        methodAitor(preu,tax,res);
*/
        // TODO code application logic here
    
        }}
     private static void userMenu() {

        System.out.println("OP1");
        System.out.println("OP2");
        System.out.println("OP3");
        System.out.println("OP4");
        System.out.println("OP5");
        System.out.println("OP6");
        System.out.println("OP7");
        System.out.println("OP8");
        System.out.println("OP9");
         System.out.println("OP10");
        System.out.println("press 0 to exit");
       

        System.out.println("\n\nchoose an option");

    }
  
    private static float function01(int euro) {
        float res = 0;
        res=euro/0.91f;
        
        return res;
    }
    
     private static double function02(int euro) {
        double resdouble = 0;
        resdouble=euro/0.91f;
        
        return resdouble;
    }
     
     private static int Function4(String euro1) {
        int result4;
        result4 = Integer.parseInt(euro1);

 

        return result4;
    }
         private static int Function5(float euro2) {
        int result5 = 0;
        result5 = (int) (euro2 / 0.91); //cast      
        return result5;
    }
         
         private static void function7(char ch){
             
             String letterBinary=Integer.toBinaryString(ch);
             System.out.println(ch+"="+letterBinary);
           
         }
                    
     private static String function8(String str){
String result="";
char ch=' ';
for(int i=0; i<str.length(); i++){
    ch=str.charAt(0);
result +=Integer.toBinaryString(ch);

}
Integer.toBinaryString(ch);
return result;
}
private static void function10(){
    
    
    System.out.println("-------");
    for(int i=0; i<255; i++){
        System.out.println(i+"\t"+ Integer.toString(i,16)
                + "="+(char)i);
    }
}
}  



     
    
      
      
      
      

