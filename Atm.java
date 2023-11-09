import java.util.*;
public class Atm {
    public static void welcome (String Name, String acc_num){
       System.out.println("Welcome to your account " + Name + " Your account number is " + acc_num);
    }
    public static void deposit1 (int amt_dep, int balance1){
          balance1 += amt_dep;
        System.out.println("Deposit successfull, your new balance is " + balance1);
    }
    public static void withdraw1(int balance1, int amount1){
        balance1 -= amount1;
    System.out.println("Withdraw successful, your new balance is now " + balance1);
    }
    public static void balance_c (int balance_cc){
        System.out.println("Your balance is " + balance_cc);
    }    
    /**
     * @param args
     */
    public static void main(String[] args){
        String Names = "Victor Alliu";
        String acc_num1 = "123456789";
        int new_amount;
        int balance2 = 10000;
        Scanner sc = new Scanner(System.in);

// calling of first method
        welcome(Names, acc_num1);

        System.out.println("What will you like to do ? \n 1.Deposit \n 2.Withdraw \n 3.Check balance");

        int choice = sc.nextInt();

        if (choice == 1){
        System.out.println("How much do you wish to deposit ?");
        Scanner Sc = new Scanner(System.in);
        int amt_dep2 =+ sc.nextInt();
        Sc.close();
// calling the second method
        deposit1(amt_dep2, balance2);
        }else

        if( choice == 2){
        System.out.println("How much do you wish to withdraw ?");
        new_amount = sc.nextInt();
        sc.close();
// calling the third method
        withdraw1(balance2, new_amount);
        }

        if (choice == 3){
//  calling the fourth method
            balance_c(balance2);
        }
    }
}    

