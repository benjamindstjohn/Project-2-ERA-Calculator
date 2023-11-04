
   // Calculate a given player's earned run average (E.R.A.) by program user inputting custom values //
    //----------------------------------------------------------------------------------------------//
     //<=================>//
      // Benjamin St. John //
       // bdstjohn@uwm.edu  //
        // Intro Programming //
         // CS250-805         //
          // Program 3         //
           //<=================>//


import java.util.Scanner;                                                        // Importing Scanner Utility Package //

public class prj4                                                                 // Starting-point of cs3.class //
{
  public static void main(String[] args)                                         // Starting-point of Main Method //
    {
        Scanner y = new Scanner(System.in);                                      // Input Scanner y Created //

        System.out.println("Enter the Pitchers First Name: ");                 // Asks for string-variable value of pitcher's first name  //
            String Firstname = y.nextLine();                                     // Declare entered string as "Firstname" variable //        
                                                                                                                                             
         System.out.println("Enter the Pitchers Last Name: ");                 // Asks for string-variable value of pitcher's last name //
            String Lastname = y.nextLine();                                      // Declare entered string as "Lastname" Variable //
    
        System.out.println("Enter the Pitchers Number of Earned Runs: ");      // Asks for integer-variable value of pitcher's total number of earned runs //
            int RunsEarn = y.nextInt();                                          // Declare entered integer as RunsEarn variable //

        System.out.println("Enter the Pitchers Number of Innings Pitched: ");  // Asks for integer-variable value of pitcher's total number innings pitched //
            int InnPitch = y.nextInt();                                          // Declare entered integer as InnPitch variable //

        double ERA = (RunsEarn*9)/InnPitch;                                      // Computation of earned run average with given player statistics (# earned runs × 9) ÷ # innings pitched //

        System.out.println(Firstname + " " + Lastname + "'s E.R.A. is " + ERA);  // System printing the entered player's full name & calculated E.R.A. value //

        y.close();                                                               // Closure of y scanner //

    }                                                                            // Ending-point of main method //
                                                                            
}                                                                                // Ending-point of cs3.class //=ER