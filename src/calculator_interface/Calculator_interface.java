/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator_interface;
import javax.swing.JOptionPane;
/**
 *
 * @author Lee Click
 */
public class Calculator_interface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                   int i;
       String a,b;
               double rslt;
    String operation;
    
for (;;)
    {
  
        operation=JOptionPane.showInputDialog("Enter 1.addition, 2.Subtraction, 3.Division, 4.Multiplication, 5.Power");  
            int n1=Integer.parseInt(operation);
   
            switch(n1)
            {
            case 1:
             
             JOptionPane.showMessageDialog(null, "welcome you are using addition click ok" , "Addition", JOptionPane.PLAIN_MESSAGE);
             a=JOptionPane.showInputDialog("Enter A:");
             b=JOptionPane.showInputDialog("Enter B:"); 
             int number1=Integer.parseInt(a);
             int number2=Integer.parseInt(b);
             rslt=number1+number2;
            
             JOptionPane.showMessageDialog(null, "The Result:" +rslt, "Calculator", JOptionPane.PLAIN_MESSAGE);
         break;
    case 2:
             
             JOptionPane.showMessageDialog(null, "welcome you are using Subtraction click ok" , "Subtraction", JOptionPane.PLAIN_MESSAGE);
             a=JOptionPane.showInputDialog("Enter A:");
             b=JOptionPane.showInputDialog("Enter B:"); 
             int sub1=Integer.parseInt(a);
             int sub2= Integer.parseInt(b);
             rslt=sub1-sub2;
            
             JOptionPane.showMessageDialog(null, "The Result:" +rslt, "Calculator", JOptionPane.PLAIN_MESSAGE);
         break;
    case 3:
             
             JOptionPane.showMessageDialog(null, "welcome you are using Division click ok" , "Division", JOptionPane.PLAIN_MESSAGE);
             a=JOptionPane.showInputDialog("Enter A:");
             b=JOptionPane.showInputDialog("Enter B:"); 
             int div1=Integer.parseInt(a);
             int div2= Integer.parseInt(b);
             rslt=div1/div2;
            
             JOptionPane.showMessageDialog(null, "The Result:" +rslt, "Calculator", JOptionPane.PLAIN_MESSAGE);
         break;
        case 4:
             
             JOptionPane.showMessageDialog(null, "welcome you are using Multiplication click ok" , "Multiplication", JOptionPane.PLAIN_MESSAGE);
             a=JOptionPane.showInputDialog("Enter A:");
             b=JOptionPane.showInputDialog("Enter B:"); 
             int mult1=Integer.parseInt(a);
             int mult2= Integer.parseInt(b);
             rslt=mult1*mult2;
            
             JOptionPane.showMessageDialog(null, "The Result:" +rslt, "Calculator", JOptionPane.PLAIN_MESSAGE);
         break;
            
        case 5:
             
             JOptionPane.showMessageDialog(null, "welcome you are using Power click ok" , "Power", JOptionPane.PLAIN_MESSAGE);
             a=JOptionPane.showInputDialog("Enter A:");
             b=JOptionPane.showInputDialog("Enter B:"); 
             int pow1=Integer.parseInt(a);
             int pow2= Integer.parseInt(b);
             rslt=Math.pow(pow1, pow2);
             JOptionPane.showMessageDialog(null, "The Result:" +rslt, "Calculator", JOptionPane.PLAIN_MESSAGE);
         break; 
       
         default:
             JOptionPane.showMessageDialog(null, " Choice Not Listed Plz Try Again..." ,"Calculator", JOptionPane.PLAIN_MESSAGE);
            break;  
    }
    
    }
    
}
}
