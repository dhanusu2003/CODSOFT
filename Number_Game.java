import java.util.*;
public class Number_Game {
    static Scanner s=new Scanner(System.in);
    static void Random(){
        int random_no=(int)(Math.random()*100)+1;
        int n=15;
        int count=1;
        System.out.println("---------- You Can Enter Your Guess Atmost "+n+" Times ----------");
        int sub=15;
        for(int i=1;i<=n;i++) {
            System.out.println("Enter Your Guessed Number"+"(You have "+sub+" Attempt Remaining )!");
            --sub;
            int user_no=s.nextInt();
            if(user_no>random_no){
                System.out.println("!!!!! Your Guess is To High So Enter Lesser Value !!!!!");
            } else if (user_no<random_no) {
                System.out.println("!!!!! Your Guess is To Low So Enter Higher Value !!!!!");
            }
            else
            {
                System.out.println("Congrats!!!.Your Guess is Correct");
                break;
            }
            count=count+1;
        }
        if(count<=15)
        System.out.println("You guess the Number in "+count+" Attempt");
        else{
            System.out.println("Sorry !!! The Limit is Over Try Again");
        }
    }
    public static void main(String args[]){
        System.out.println("********** Welcome to Number Game **********");
        Random();
        System.out.println("********** Thank You **********");
    }
}
