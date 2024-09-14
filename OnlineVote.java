
import java.util.Scanner;

class OnlineVote{

  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    String name;
    String phoneNo;
    int run = 0;
    int choice,vote_ch;
    int party1=0,party2=0,party3=0;
    
    System.out.println("--ONLINE VOTING SYSTEM--");
    
    while(run==0)
    {
    in.nextLine();
    System.out.print("\nENTER NAME :");
    name = in.nextLine();
    System.out.print("ENTER PHONE :");
    phoneNo = in.nextLine();
    
    //choice:
    System.out.println("\nEnter your choice: \n1 SUBMIT YOUR VOTE \n2 CHECK RESULTS \n3 EXIT \n");
    choice = in.nextInt();
   switch(choice){
      case 1:    
        {
    System.out.println("Cast Your Vote Here :");
    System.out.println("1. party A\n2. party B\n3. party C");
    vote_ch = in. nextInt();
    switch(vote_ch){
      case 1: party1+=1; break;
      case 2: party2+=1; break;
      case 3: party3+=1; break;
      default : System.out.println("Invalid VOTE !");
    }
    }break;
    
     case 2:
     {
       System.out.printf("party1 :%d \nparty2 :%d \nparty3 :%d\n",party1,party2,party3);
     };break;
     
     case 3: run = 1; break;
     
      default : System.out.println("Invalid choice");
    }
    }
    
  }
    
  }