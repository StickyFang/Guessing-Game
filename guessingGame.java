import java.util.Random;
import java.util.Scanner;
public class guessingGame
{
   //Execute Program
   public static void main(String[] args)
   {
   Scanner input = new Scanner(System.in);
   Random random = new Random();
   ascii(); 
   System.out.println("    Do you belive in luck?");
   System.out.println("            y/n?");
  
   char yes = input.next().charAt(0);
   if (yes == 'y'|| yes == 'Y'){
   game();
   }
   else{System.out.println("Fate is in your hands.\n   Goodbye(^-^`)");}


   }//end of main
   public static void ascii(){
    for (int i = 0; i < 10; i++) {
      if (i == 0 || i == 4) {
        System.out.println("        @@        @@        ");
      } else if (i == 1 || i == 2 || i == 3 ||i==8) {
        System.out.println("      @@@@@@    @@@@@@     ");
      } else if (i == 5) {
        System.out.println("   @                    @   ");
      } else if (i == 6) {
        System.out.println("   @@                  @@   ");
      } else if (i == 7) {
        System.out.println("    @@                @@    ");
      } else {System.out.println("         @@@@@@@@@@     ");
      }}}  
      
   public static void game(){
   Scanner input = new Scanner(System.in);
   Random random = new Random();
   System.out.println("I'm thinking of a number");
   int randomInt = random.nextInt(10)+1;
   System.out.println(randomInt);
   
   int guess = input.nextInt();
   

   if(guess==randomInt){
   System.out.println("CORRECT!");
   }else System.out.println("Guess Again");
   
   }//end of game
   

     
      
}//end of class