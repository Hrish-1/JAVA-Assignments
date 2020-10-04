package Assignments;
import java.util.ArrayList;
import java.util.Scanner;

/*
51.	Create a program that helps banks to maintain records.
It should have following facilities. 
a. Anybody can create current or saving account with following initial information: account number, name, balance, and branch. 
b. display account detail for a particular accounts.
c. display total money deposited in bank.
d. allow deposit and  withdrawal in an account  
e. for saving account opening balance and minimum balance must be 5000.
f. for current account opening balance and minimum balance must be 1000.
g. can not withdraw the amount from the account that makes balance less than the minimum balance.
*/
public class q51_BankAccount{
    int AccNo;
    String name;
    double balance;
    String branch;
    q51_BankAccount(int AccNo,String name,double balance,String branch){
        this.AccNo = AccNo;
        this.name = name;
        this.balance = balance;
        this.branch = branch;
    }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int ch;
      ArrayList<q51_BankAccount> accountDetails = new ArrayList<>();
      
      do{
          System.out.println("Enter your choice");
          System.out.println("1. Create new Account");
          System.out.println("2. Display Account details");
          System.out.println("3. Display balance");
          System.out.println("4. Withdraw/deposit");
          System.out.println("0. Exit");
          ch = sc.nextInt();
        switch(ch){
            case 1 : System.out.println("Choose Account type");
                     System.out.println("1. Savings Account");
                     System.out.println("2. Current Account");
                     int type = sc.nextInt();
                    if(type == 1){
                       while(true){
                        System.out.println("Enter Account Number");
                        int AccNo = sc.nextInt();
                        System.out.println("Enter Accountholder's name");
                        String name = sc.next();
                        System.out.println("Enter balance");
                        double balance = sc.nextDouble();
                        System.out.println("Enter branch");
                        String branch = sc.next();
                        if(balance < 5000){
                            System.out.println("Balance should be above 5000");
                            continue;
                        }else{
                            accountDetails.add(new q51_BankAccount(AccNo, name, balance, branch));
                            break;
                        }
                       }
                    }
                    else if(type == 2){
                        while(true){
                            System.out.println("Enter Account Number");
                            int AccNo = sc.nextInt();
                            System.out.println("Enter Accountholder's name");
                            String name = sc.next();
                            System.out.println("Enter balance");
                            double balance = sc.nextDouble();
                            System.out.println("Enter branch");
                            String branch = sc.next();
                            if(balance < 3000){
                                System.out.println("Balance should be above 3000");
                                continue;
                            }else{
                                accountDetails.add(new q51_BankAccount(AccNo, name, balance, branch));
                                break;
                            }
                        }
                    }else{
                        break;
                    }
                    break;
            case 2 : System.out.println("Enter Account Number");
                    int acno = sc.nextInt();
                    int count = 0;
                    int size =  accountDetails.size();
                    for(int x = 0; x < size; x++){
                        if(acno == accountDetails.get(x).AccNo){
                            System.out.println("Name: "+accountDetails.get(x).name);
                            System.out.println("balance: "+accountDetails.get(x).balance);
                            System.out.println("branch: "+accountDetails.get(x).branch);
                            break;
                        }else if(count == size - 1){
                            System.out.println("Account Number not found");
                        }else{
                            count++;
                        }
                    }
                    break;
        }
        sc.close();
      }while(ch != 0);
 
  }
}