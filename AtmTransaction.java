import java.util.Scanner;
public class AtmTransaction {
	public static void main(String[] args) {
        int balanceAmount = 10000;
        Scanner sc = new Scanner(System.in);
        while(true) {
            int choice, withdrawAmount, depositAmount;
            System.out.println("AUTOMATED TELLER MACHINE");
            System.out.println("Choose 1 to withdraw");
            System.out.println("Choose 2 to deposit");
            System.out.println("Choose 3 to checking balance");
            System.out.println("Choose 4 to exit");
            System.out.print("Enter your option: ");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("\nEnter the amount to be withdrawn: ");
                    withdrawAmount = sc.nextInt();
                    if(withdrawAmount <= balanceAmount) {
                        balanceAmount = balanceAmount - withdrawAmount;
                        System.out.println("Please collect your money.\n");
                    }
                    else {
                        System.out.println("OOPS! Insufficient balance.\n");
                    }
                    break;
                case 2:
                    System.out.print("\nEnter the amount to be deposited: ");
                    depositAmount = sc.nextInt();
                    balanceAmount = balanceAmount + depositAmount;
                    System.out.println("Your amount has been successfully deposited!\n");
                    break;
                case 3:
                    System.out.println("\nYour bank balance: Rs." + balanceAmount + "\n");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nOOPS! That's an incorrect option. Choose a correct one.\n");
            }
            
        }
	}
}