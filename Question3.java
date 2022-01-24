/* The program import java.util.Scanner to allow user to input data. Next, declaration for age, 
   HRrest, HRmax and VO2Max set as double variables and gender declare as characters. Prompt message 
   for user key in data from keyboard for gender, age and HRrest. These three variables will use WHILE loop, 
   so, when incorrect data has input, a message will prompt to request input the correct data. Once the 
   correct data has input, then only execute to the next input data request. Once the gender, age and the 
   HRrest data had input correctly, next is to calculate the HRmax follow by VO2Max, then run through IF statement 
   to check which sports is suitable, then output will display the eligible sports and VO2Max result. ELSE IF execute 
   when the result and data is not meet the requirement. If the result does not meet the requirement, the output
   will display not suitable message. */

import java.util.Scanner;
public class Question3 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        double HRmax, VO2Max = 0; 
        int age, HRrest;
        char gender;
            System.out.print("Gender [M / F] : " );
            gender = keyboard.next() .charAt(0);
                    while (gender != 'M' && gender !='m'&& gender != 'F' && gender != 'f')
                        {
                          System.out.println("Please enter again gender with M or F !");
                          gender = keyboard.next() .charAt(0);
                        } 
            System.out.print("Age    : ");
            age = keyboard.nextInt();
                    while (age <= 0 || age < 10)         
                      {
                        System.out.println("Age Error. Please enter your age again within 10 to 30.");
                        age = keyboard.nextInt();             
                      } 
        
            System.out.print("Resting Heart Rate : ");
            HRrest = keyboard.nextInt();
                    while (HRrest <= 0)
                    {
                        System.out.println("Please enter valid heart rate !");
                        HRrest = keyboard.nextInt();
                    }
            HRmax = 220 - age;
            VO2Max = 15 * (HRmax / HRrest);
            System.out.printf("Your VO2Max : %.2f \n", VO2Max); 

                    if (gender == 'M')
                    {
                       if((age >= 18 && age <= 30) && ( VO2Max >= 40 && VO2Max <= 60)) 
                      {
                       System.out.println("Your Suitable Sport is : Basketball");
                      }  
                          if ((age >= 18 && age <= 26) && (VO2Max >= 62 && VO2Max <= 74))
                         {
                          System.out.println("Your Suitable Sport is : Bicycling");
                         }   
                             if((age >= 18 && age <= 26) && (VO2Max >= 55 && VO2Max <= 67))
                            {
                             System.out.println("Your Suitable Sport is : Canoeing");
                            }
                                 if((age >= 18 && age <=22) && (VO2Max >= 52 && VO2Max <=58))
                                {
                                 System.out.println("Your Suitable Sport is : Gymnastic");
                                }
                                     if ((age >= 10 && age <= 25) && (VO2Max >= 50 && VO2Max <= 70))
                                    {
                                     System.out.println("Your Suitable Sport is : Swimming");
                                    }
                                       else
                                         if (VO2Max < 40 || VO2Max > 74)
                                        {   
                                        System.out.println("You are not suitable for sports.");
                                        }
                    }

                     if (gender == 'F')
                    {
                        if((age >= 18 && age <= 30) && ( VO2Max >= 43 && VO2Max <= 60))
                         {
                          System.out.println("Your Suitable Sport is : Basketball");
                         }  
                             if ((age >=18 && age <= 26)&&(VO2Max >= 47 && VO2Max <= 57))
                            {
                             System.out.println("Your Suitable Sport is : Bicycling");
                            }   
                                if((age >= 18 && age <= 26) && (VO2Max >= 47 && VO2Max <= 67))
                               {
                                System.out.println("Your Suitable Sport is : Canoeing");
                               }
                                    if((age >= 18 && age <=22) &&(VO2Max >= 36 && VO2Max <= 50))
                                   {
                                    System.out.println("Your Suitable Sport is : Gymnastic");
                                   }
                                        if((age >= 10 && age <= 25) && (VO2Max >= 40 && VO2Max <= 60))
                                       {
                                        System.out.println("Your Suitable Sport is : Swimming");          
                                       }
                                            else
                                                if (VO2Max < 36 || VO2Max > 67)
                                            {
                                            System.out.println("You are not suitable for sports.");
                                            }

                    }         
    }
} 
