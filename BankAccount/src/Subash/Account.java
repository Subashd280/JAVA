package Subash;

public class Account {
    private String customerName;
    private String accountNumber;
    private String phoneNumber;
    private String email;
    private double balance;


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Constructor for an account class with parameter
    public Account(String customerName, String accountNumber, String phoneNumber, String email, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.balance = balance;


    }

    //Constructor without parameter for class Account
//    public Account() {
//
//    }

    //To deposit the money to account
    public double DepositMoney(double DepositedMoney) {
        this.balance = DepositedMoney + balance;
        System.out.println("Deposit is successful, new balance is: " + this.balance);
        return balance;
    }

    //To Withdrawn some cash from account
    public double withdrawMoney(double withdrawal) {
        if (this.balance - withdrawal < 0) {
            System.out.println("withdrawal is unsuccessful, and the current balance is" + this.balance);
        } else {
            this.balance = balance - withdrawal;
            System.out.println("withdrawal is successful and now the balance is:" + this.balance);
        }
        return balance;
    }

    //To add Aadhaar Number to Account
//    public String addAadhaar(String Aadhaar){
//        this.Aadhaar = Aadhaar;
//        System.out.println("Your Aadhaar Number is: "+this.Aadhaar);
//        return Aadhaar;
//    }

}
