/*
 * Lewis White
 * March 01, 2019
 * This program will show the values of resistors
 */

package resistors;



import static java.lang.reflect.Array.set;


import javax.swing.*;
import javax.swing.JOptionPane;

/**
 * @author lewhi7273
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String enteredValues = JOptionPane.showInputDialog("Please enter the colours on the resistor \n (seperated by hyphens)");
        String values[] = new String[10];
        int finalValue;
       String[] splits = enteredValues.split("-",9);
        //set the values in the array to colours
         set(values, 0 , "Brown");
         set(values, 1 , "Black");
         set(values, 2 , "Yellow");
         set(values, 3 , "Green");
         set(values, 4 , "Violet");
         set(values, 5 , "White");
         set(values, 6 , "Orange");
         set(values, 7 , "Grey");
         set(values, 8 , "Blue");
         set(values, 9 , "Red");
              
               
       //Find the values from the entered colours
        for(int i = 0; i<=2; i++){
            if(splits == (values[0])){
                set(values, 0, 1);
               System.out.print(values[0]);
               
            }else if(enteredValues.equalsIgnoreCase("Black")){
               set(values, 1, 0);
               System.out.print(values[1]);
               
            }else if(enteredValues.equalsIgnoreCase("Yellow")){
               set(values , 2 ,4);
              System.out.print(values[2]);
              
            }else if(enteredValues.equalsIgnoreCase("Green")){
                set(values , 3 , 5);
              System.out.print(values[3]);   
              
            }else if(enteredValues.equalsIgnoreCase("Violet")){
                set(values , 4 , 7);
               System.out.print(values[4]);
               
            }else if(enteredValues.equalsIgnoreCase("White")){
                set(values , 5 , 9);
               System.out.print(values[5]);
               
            }else if(enteredValues.equalsIgnoreCase("Orange")){
                set(values , 6 , 3);
                System.out.print(values[6]);
                
            }else if(enteredValues.equalsIgnoreCase("Grey")){
                set(values , 7 , 8);
                System.out.print(values[7]);
                
            }else if(enteredValues.equalsIgnoreCase("Blue")){
                set(values , 8 , 6);
                System.out.print(values[8]);
                
            }else if(enteredValues.equalsIgnoreCase("Red")){
                set(values , 9 , 2);
                System.out.print(values[9]);
           
        
     //  finalValue = values.get(j);
      
   
         }
        }  
    }
}

    

         
