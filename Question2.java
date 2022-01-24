/* This Java code is to record to the rainfall data. From this code, first can input the rainfall data 
   by import scanner from the utilities. Rainfall_Max, Rainfall_Min, Rainfall_Total, Rainfall_Lv and 
   Rainfall_Avg set in double as the data may contain decimal points, and Entry will put int. 
   First, prompt to input rainfall data. WHILE loop to allow enter as much data as possible if the data of 
   Rainfall_Lv is greater than 0. IF and ELSE IF is to generate out the maximum and minimum from the Rainfall_Lv. 
   Every data input the Entry will automatically plus 1. Then every data input will add up together and calculate 
   to average rainfall (Rainfall_Avg).Each data input will output the result to show the maximum, minimum, average,
   and the entries of the rainfall. If the code receives incorrect data like negative value, the program will stop and 
   display the total entries of data and show invalid message. */


import java.util.Scanner;
public class Question2 
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
          int Total_entries = 0;
          double Rainfall_Max, Rainfall_Min, Rainfall_Total = 0, Rainfall_Lv, Rainfall_Avg;     
          Rainfall_Min = 0;
          Rainfall_Max = 0;

            System.out.print("Please Enter rainfall level : ");
                Rainfall_Lv = keyboard.nextDouble();           
                while (Rainfall_Lv > 0)
                {
                    if (Total_entries == 0)
                      {
                       Rainfall_Max = Rainfall_Lv;
                       Rainfall_Min = Rainfall_Lv;       
                      }
                          else if(Rainfall_Lv > Rainfall_Max)
                          { 
                          Rainfall_Max = Rainfall_Lv;
                          }         
                              else if(Rainfall_Lv < Rainfall_Min)
                              {
                              Rainfall_Min = Rainfall_Lv;
                              }

                    Total_entries ++;
                    Rainfall_Total = Rainfall_Total + Rainfall_Lv;
                    Rainfall_Avg = Rainfall_Total/Total_entries;
                    System.out.printf("Minimum Rainfall = %.1f \n" , Rainfall_Min);
                    System.out.printf("Maximum Rainfall = %.1f \n" , Rainfall_Max);
                    System.out.printf("Average Rainfall = %.1f \n" , Rainfall_Avg);          
                    System.out.print("Please Enter rainfall level : ");
                      Rainfall_Lv = keyboard.nextDouble();
                }
                    System.out.printf("Total Entries Made = %d \n" , Total_entries );
                    System.out.print("Invalid Entry \n");   

    }
}
