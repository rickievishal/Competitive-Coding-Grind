import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
class Bank {
    List<BankAccount> bankRecord;
    Bank(){
        this.bankRecord = new ArrayList<>();
    }
    public void addAccount (BankAccount acc){
        int n = bankRecord.size();
        
        for(int i = 0 ; i < n ; i++){
            BankAccount temp = bankRecord.get(i);
            if(temp.number == acc.number){
                System.out.println("Account Already exist!");
                return;
            }
        }
        bankRecord.add(acc);
        System.out.println("Account has been created!");
        return;
    }
   public boolean validateAcc(String number, String pass) {
        BankAccount b = findAcc(number);
        if (b != null) {
            if (Objects.equals(b.pass, pass)) {
                System.out.println("Account has been signed in");
                return true;
            } else {
                System.out.println("Account password is invalid");
                return false;
            }
        }
        System.out.println("Account not found");
        return false;
    }
    public BankAccount findAcc(String number){
        for (BankAccount a : bankRecord) {
            if (Objects.equals(number, a.number)) {
                System.out.println("Account has been found!");
                return a;
            }
        }
        System.out.println("Account not found!");
        return null;
    }
    public void deleteAccount(BankAccount acc){
        int n = bankRecord.size();
        for(int i = 0 ; i < n ;i++){
            if(bankRecord.get(i).number == acc.number){
                System.out.println("Account has been deleted");
                bankRecord.remove(i);
            }else{
                System.out.println("Account has not been found");
            }
            return;
        }
    }
    void findAndUpdate (BankAccount b){
        int n = bankRecord.size();
        for(int i =0;i<n;i++){
            BankAccount t = bankRecord.get(i);
            if(Objects.equals(b.number,t.number)){
                bankRecord.remove(i);
                bankRecord.add(i,b);
                System.out.println("The data is updated");
                return;
            }
        }
    }
}
class BankAccount {
    float bal;
    String cardHolder,pass;
    String number;
    String phoneNumber;

    BankAccount(String name, String number , String pass , String phone) {
        this.cardHolder = name;
        this.number = number;
        this.phoneNumber = phone;
        this.bal = 0;
        this.pass = pass;
    }
    void fetchBalance() {

        System.out.println();
        System.out.println();
        System.out.println("Account Holder : " + cardHolder);
        System.out.println("Account Number : " + number);
        System.out.println("The Available Balance in the Account  : " + this.bal + "$.");
        System.out.println();
        System.out.println();

        return;
    }
    void depositAmount(float amt) {
        bal += amt;
        System.out.println("Amount " + amt + "$ is deposited in the Account.");
        fetchBalance();
        return;
    }
    void debitAmount(float amt) {
        if (bal >= amt) {
            bal -= amt;
            System.out.println("Amount " + amt + "$ is Debited.");
        } else {
            System.out.println("Insufficient balance.");
        }
        fetchBalance();
        return;
    }
   
}
class Customer{
    String name,branch;
    int phoneNumber,atmNumber;

    Customer(){
        System.out.println("Customer Creation Portal");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String op = sc.nextLine();
        System.out.println("Enter the ATM number :");
        float atmNumber = sc.nextFloat();
        System.out.println("Enter the phone number :");
        int phoneNumber = sc.nextInt();
        System.out.println("");
        String branch = sc.nextLine();
    }
}
public class BankATM {

    public static void main(String[] args) {
        BankAccount b = new BankAccount("Vishal", "9443919192","vishalT78","123");
        Bank bank = new Bank();
        bank.addAccount(b);
        bank.findAcc(b.number);
        System.out.println(bank.validateAcc("9443919192","vishalT78"));
        Scanner sc = new Scanner(System.in);
        boolean isSignedIn = false;
        while(true){
            System.out.println("Choose an operation to perform");
            System.out.println("1 . To Login In ");
            System.out.println("2 . To Create an Account");
            int op1 = Integer.parseInt(sc.nextLine().trim());

            switch(op1){
                case 1 :
                    System.out.print("Enter the Account Number: ");
                    String accNo = sc.nextLine().trim();
                    System.out.print("Enter the Password: ");
                    String pass = sc.nextLine();
                    isSignedIn = bank.validateAcc(accNo, pass);
                    
                    while(isSignedIn){
                        BankAccount session = bank.findAcc(accNo);
                        System.out.println("Choose an operation to perform");
                        System.out.println("1 . To deposit cash ");
                        System.out.println("2 . To withdraw cash ");
                        System.out.println("3 . To check Balance ");
                        System.out.println("4 . To exit the process ");
                        int op2 = Integer.parseInt(sc.nextLine().trim());
                        float amt;
                        switch(op2){
                            case 1:
                                System.out.println("Enter the amount to deposit : ");
                                amt = Float.parseFloat(sc.nextLine().trim());
                                session.depositAmount(amt);
                                bank.findAndUpdate(session);
                                isSignedIn = false;
                                break;
                            case 2: 
                                System.out.println("Enter the amount to withdraw : ");
                                amt = Float.parseFloat(sc.nextLine().trim());
                                session.depositAmount(amt);
                                isSignedIn = false;
                                break;
                            case 3:
                                System.out.println("Balance Fetched!");
                                session.fetchBalance();
                                isSignedIn = false;
                                break;
                            case 4:
                                System.out.println("Session Logged out!");
                                isSignedIn = false;
                                break;
                        }
                    }
                    break;
                case 2 :
                    System.out.println("Account Creation");
                    System.out.println("Enter your name : ");
                    String name = sc.nextLine().trim();
                    System.out.println("Enter your Account Number : ");
                    String acc = sc.nextLine().trim();
                    System.out.println("Enter you Phone Number : ");
                    String phone = sc.nextLine().trim();
                    System.out.println("Enter your password : ");
                    String password = sc.nextLine().trim();
                    BankAccount newAcc = new BankAccount(name,acc,password,phone);
                    bank.addAccount(newAcc);
                    break;

            }
        }
    }
}
