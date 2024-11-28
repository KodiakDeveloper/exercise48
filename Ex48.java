package loops;

import javax.swing.JOptionPane;

public class Ex48 {

    public static void main(String[] args) {

        int userInput, userResult;

        String userAnswer;

        do {

      
            userInput = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Enter a number, and we will check if it is a perfect number."));

            
            if (userInput == 0) {

                JOptionPane.showMessageDialog(null, "Please input a number greater than zero!");
            } else {

                userResult = userInput / 2;  
                
                int sum = 0;

              
                for (int i = 1; i <= userResult; i++) {
                	
                	
                    if (userInput % i == 0) {  
                    	
                    	
                        sum += i;  
                    }
                }

                
                if (sum == userInput) {
                	
                	
                    JOptionPane.showMessageDialog(null, "Number: " + userInput + " is a perfect number.");
                    
                    
                } else {
                	
                    JOptionPane.showMessageDialog(null, userInput + " is not a perfect number.");
                    
                }
            }

            
            userAnswer = JOptionPane.showInputDialog(null, "Do you want to check another number? (yes/no)");

        } while (userAnswer.equalsIgnoreCase("yes"));
    }
}