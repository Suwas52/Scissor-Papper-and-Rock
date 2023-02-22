import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
// take input from user, S,P,R

Scanner inputObj = new Scanner(System.in);
System.out.println("Please enter S, P, or R");

char userMove = inputObj.next().charAt(0);


System.out.println("User gave this input>> " +userMove);
 


//make compute to make there move
char[] arr = {'S','P','R'};

Random random = new Random();

int guessNumber = random.nextInt( 3);

char computerMove = arr[guessNumber];

System.out.println("Computer move >>" + computerMove);



        //computer = user  -> draw!!

        
        if(userMove == 'P' && computerMove == 'P' || userMove == 'S' && computerMove == 'S' || userMove == 'R' && computerMove == 'R' ){
            System.out.println("Draw ");
        }
        else if(userMove == 'S' && computerMove == 'P' ){
            System.out.println("User Won ");
        }
        else if(userMove == 'P' && computerMove == 'S' ){
            System.out.println("Computer Won ");
        }
        else if(userMove == 'R' && computerMove == 'S' ){
            System.out.println("User Won ");
        }
        else if(userMove == 'S' && computerMove == 'R' ){
            System.out.println("Computer Won ");
        }
        else if(userMove == 'R' && computerMove == 'P' ){
            System.out.println("Computer Won ");
        }
        else if(userMove == 'P' && computerMove == 'R' ){
            System.out.println("User Won ");
        }
        else {
            System.out.println("Invalid Character");
        }


//ma
    }
}