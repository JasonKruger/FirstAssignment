import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        int PIN = 1234;
        
        System.out.println("Please enter your PIN");
        int entry = myObj.nextInt();

        while (entry != PIN)
        {
                System.out.println("Incorrect PIN. Please try again.");
                System.out.print("Please enter your PIN: ");
                entry = myObj.nextInt();
            
        }
        System.out.println("PIN Accepted.");
        
        //FIRST STEP COMPLETE. NOW STEP 2

        double Balance = 50;

        System.out.println("Your balance is: " + Balance);
        System.out.println("You may Withdraw or Deposit");

        String="Choice"



        
    }
    
}
