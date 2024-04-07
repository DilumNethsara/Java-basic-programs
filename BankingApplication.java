package bankingapplication;

import java.util.Scanner;

public class BankingApplication {
    public static Scanner sc = new Scanner(System.in);
    public static double balance = 0;
    
    public static void deposit(){
        
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        if(amount>0){
            balance=+amount;
            System.out.println("Deposit successful...");
        }
        else{
            System.out.println("Invalid amount...");
        }
    }
    
    public static void withdraw(){
        System.out.print("Enter amount to withdraw : ");
        double amount = sc.nextDouble();
        
        if(amount>0 && amount<balance){
            balance=balance-amount;
            System.out.println("Withdrawal successful...");
        }
        else
            System.out.println("Invalid amount...");
    }
    
    public static void checkBalance(){
        System.out.println("Balance : " + balance);
    }
    

    public static void main(String[] args) {
        
        boolean exit = false;
        
        System.out.println("1 - Deposit \n 2 - Withdraw \n 3 - Check balance \n 4 - Exit");
        

        
        
        while(!exit){
            System.out.println("Enter a number here : ");
            int choice = sc.nextInt();
        switch(choice) {
            case 1 -> {deposit(); 
                        break;}
            case 2 -> {withdraw();
                        break;}
            case 3 -> {checkBalance();
                        break;}
            case 4 -> {
                exit = true;
                System.out.println("The program is exiting...");
                break;
                }
            default -> {System.out.println("Wrong input.");
                break;}
        }
        }
    }
    
}
