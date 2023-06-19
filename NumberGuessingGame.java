import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
       int RandomNumber = rand.nextInt(100) ;
       int cnt=0;
        
       int attempt=5;

       System.out.println("\n\n");
       System.out.println("-------------------- Welcome to The Number Guessing Game --------------------");
       System.out.println("\n\n");
        System.out.println("Enter The Numbers From 1 To 100 \n (You Have Only 5 Attempt) \n Best Of Luck !!!!! \n " );
        System.out.print("Start Guessing..");
        while(cnt<attempt)
        {
        int UserGuess = sc.nextInt();
         cnt++;


            if(RandomNumber==UserGuess)
            {
                System.out.println("Congratulations , You are the Winner! ");
                System.out.println("You took "+cnt+" Attempt to Win....");
                break;
            }
            else if(RandomNumber>UserGuess)
            {
                System.out.println(" Oops Enter the Higher Number....");
            }
            else
            {
                System.out.println("Oops Enter the Lower Number....");
            }
        }
        
        if(cnt==1)
        {
            System.out.println("You Got 100 Points");
        }
        else if(cnt==2)
        {
            System.out.println("You Got 80 Points....");
        }
        else if(cnt==3)
        {
            System.out.println("You Got 60 Points....");
        }
        else if(cnt==4)
        {
            System.out.println("You Got 40 Points....");
        }
        else if(cnt==5)
        {
            System.out.println("You have reached your 5 Attempt......... \n\n");
            System.out.println("You Got 20 Points....");

        }
       else
        {
            System.out.println("Sorry!! You LOSS.....");
            System.out.println(" Best of luck For the Next Time..!!!");
        }

    }
}
