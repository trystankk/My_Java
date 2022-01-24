/* First import scanner keyboard to allow input data to the system for weight in kg and hight in cm. 
   Set weight, height, Value_BMI in double and Patient_Name in char. Prompt to input data for the name, 
   weight, and height to get the Value_BMI. The system will stop when detected invalid data from the input 
   like negative value for weight and height. When all data receive correctly, then will calculate the Value_BMI. 
   Use IF statement to opt out the incorrect value and display Invalid data. While calculation of Value_BMI received, 
   then, ELSE IF statement is to sort out from the result which status suppose to categorise to, like Underweight, 
   Healthy, Overweight or Obese. Then, ELSE statement to print the Value_BMI. At the output of the program will 
   you the patient’s BMI status. */

import java.util.Scanner;
public class Question1 
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    double weight, height, Value_BMI;
   
    System.out.print("Enter weight(KG): ");
        weight = keyboard.nextDouble();
    System.out.print("Enter  height(CM): ");
        height = keyboard.nextDouble();
    
         Value_BMI = weight / (height * height* 0.0001);
    
    if (weight <= 0 || height <= 0) 
    {
    System.out.print("Invalid Data \n");
    }
       
            else if (Value_BMI >0 && Value_BMI <=24)
            {
            System.out.printf("Your BMI is: %.2f\n ", Value_BMI);
            System.out.print("Your BMI Status : Underweight \n");
            }
                else if (Value_BMI >24 && Value_BMI <=29)
                {
                System.out.printf("Your BMI : %.2f\n ", Value_BMI);
                System.out.print("Your BMI Status : Healthy \n");
                }
                    else if (Value_BMI >29 && Value_BMI <=34)
                    {
                    System.out.printf("Your BMI is: %.2f\n ", Value_BMI);
                    System.out.print("Your BMI Status: Overweight \n");
                    }
                        else if (Value_BMI >34)
                        {
                        System.out.printf("Your BMI is: %.2f\n ", Value_BMI);
                        System.out.print("Your BMI Status: Obese \n");
                        }
                            else
                            {
                            System.out.println(Value_BMI);
                            }
    }
}
