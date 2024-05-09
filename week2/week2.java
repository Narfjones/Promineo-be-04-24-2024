package week2;

import java.util.Scanner;
import java.util.Date;

public class week2 {
    
    public static void main(String[] args){

        logIn();

        for(int i = 0; i < 20; i++){
            System.out.println(i);
        }

        printNum(5);

    }

    /* 
    = -> assignment operator
    == -> checks if they're the same object(same place in memory)
    .equals() -> checks for equal values
    */

    static public int printNum(int n){

        for(int i = 0; i < n; i++){
        System.out.println("Is it summer yet? Please god can it be summer. I'm ready to strangle people.");
        }

        return n;
    }

    static public void logIn(){

        Date lockoutTimer = null;
        boolean loggedIn = false;
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        final int maxLoginAttempts = 5;
        
        while(!loggedIn) {
            System.out.print("Enter username: ");
            String username = sc.nextLine();
            System.out.println("Enter Password");
            String password = sc.nextLine();

            if(username.equals("samy123")  && password.equals("12345")){
                System.out.println("Welcome Back TO THE FUTURE!!!!" + username);
                loggedIn = true;
            } else {
                if(!check24(lockoutTimer)){
                    if (counter <= maxLoginAttempts){
                    System.out.println("THAT ISNT RIGHT WHAT IS WITH YOU PLEASE GO TAKE A NAP");
                    counter++;
                    } else {
                        System.out.println("YOURE OUT OF ATTEMPTS! GOOD LUCK NEXT TIME! FIND A NEW MATRIX TO HACK!");
                        lockoutTimer = new Date();
                    }
                } else {
                    System.out.println("You're locked out. Come back in 24 hours. Or never. Or write it down next time. No, don't do that. Don't write down passwords.");

                }

            }
        }
    }

    static public boolean check24(Date lockoutTimer){
        
        if(lockoutTimer != null){
            long currentTime = new Date().getTime();
            long timeElapsed = currentTime - lockoutTimer.getTime();
            if( timeElapsed < (24 * 60 * 60 * 1000)){
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

}
