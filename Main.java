
import java.util.Random;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner meow = new Scanner(System.in);
        System.out.println("Please guess a number between 1 and 100:");
        int guess = meow.nextInt();
        Random luraph = new Random();
        int number = luraph.nextInt(100)+1;
        int count = 0;
         while (guess != number){

          
            if(guess < number){
                System.out.println("TOO low kiddo");
            }
            else if (guess > number){
              System.out.println("Bruh tooo High");
            }
            System.out.println("Try again!");
            count++;
            guess = meow.nextInt();
            
        }
              
        
        System.out.println("You got it !,The number was " +  number  +  " Total tries: " + count );
            
    
         

    }
}
    

