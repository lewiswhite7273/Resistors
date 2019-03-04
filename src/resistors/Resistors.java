/*
 * Lewis White
 * March 01, 2019
 * This program will show the values of resistors
 */

package resistors;


import javax.swing.*;
import static java.lang.reflect.Array.set;
import java.util.ArrayList;
import java.util.Collections;
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
        int finalValue, j = 0;
        String[] splitting = enteredValues.split("-");
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
            if(enteredValues.equalsIgnoreCase("Brown")){
                //set(values, 0, 1);
                j = 1;
            }else if(enteredValues.equalsIgnoreCase("Black")){
                //set(values, 1, 0);
                j = 0;
            }else if(enteredValues.equalsIgnoreCase("Yellow")){
               // set(values , 2 ,4);
               j
            }else if(enteredValues.equalsIgnoreCase("Green")){
                //set(values , 3 , 5);
                           
            }else if(enteredValues.equalsIgnoreCase("Violet")){
                //set(values , 4 , 7);
                    
            }else if(enteredValues.equalsIgnoreCase("White")){
                //set(values , 5 , 9);
                
            }else if(enteredValues.equalsIgnoreCase("Orange")){
                //set(values , 6 , 3);
                
            }else if(enteredValues.equalsIgnoreCase("Grey")){
                //set(values , 7 , 8);
                
            }else if(enteredValues.equalsIgnoreCase("Blue")){
                //set(values , 8 , 6);
                
            }else if(enteredValues.equalsIgnoreCase("Red")){
                //set(values , 9 , 2);
            }
            finalValue = values.get(i);
     //  finalValue = values.get(j);
       System.out.println(splitting[i]);
   
    
       }
    }
}
