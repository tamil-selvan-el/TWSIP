/* a java program to implement the atm interface */
import java.util.Scanner;

class AtmInt{
  public static void main(String[] args){
    
    Scanner in = new Scanner(System.in);
    int balance = 0;
    int option;
    Boolean run = true;
    System.out.println("Balance : "+balance);
    
    //main loop of program :
    while(run)
    {
    System.out.println("\n\n\nATM Machine\n");
    System.out.println("Choose 1 for Withdraw\nChoose 2 for Deposit\nChoose 3 for Check Balance\nChoose 4 for EXIT\n");
    System.out.print("Choose the operation:");
    option = in.nextInt();
    switch(option){
      
      case 1:
      System.out.print("Enter money to be withdraw :");
      int withd = in.nextInt();
      balance = balance-withd;
      System.out.println("Your money has been successfully withdrawed");
      break;
      
      case 2:
      System.out.print("Enter money to be deposited :");
      int depo = in.nextInt();
      balance = balance+depo;
      System.out.println("Your money has been successfully deposited");
      break;
      
      case 3:
      System.out.println("Balance : "+balance);
      break;
      
      case 4:
        run = false;
        break;
    }
    
    }
  }
}