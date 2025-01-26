import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
   
   Random random = new Random();
   Scanner scanner = new Scanner(System.in);
   
   int  x = 1;  
   
   while (x <= 10) {

   System.out.println("0 = Rock");
   System.out.println("1 = Paper");
   System.out.println("2 = Scissors");

   int  randomChoice = random.nextInt(3);
   
   System.out.println("Enter your choice: ");
   int number = scanner.nextInt();

   String[] choices = {"Rock", "Paper", "Scissors"};

   System.out.println("You chose: " + choices[number]);
   System.out.println("I choose: " + choices[randomChoice]);

   if(number == 0 && randomChoice == 1) {

    System.out.println("You Lose");
} else if (number == 1 && randomChoice == 2) {

   System.out.println("You Lose");
} else if (number == 2 && randomChoice == 0) {

   System.out.println("You Lose");
} else if (number == 1 && randomChoice == 0) {

   System.out.println("You Win");
} else if (number == 0 && randomChoice == 2) {

   System.out.println("You Win");
} else if (number == 2 && randomChoice == 1) {

   System.out.println("You Win");
} else {

   System.out.println("Its a Tie");
}
  } 
}
}

