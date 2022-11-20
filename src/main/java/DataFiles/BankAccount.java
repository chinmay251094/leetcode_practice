package DataFiles;

public class BankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Steve Smith", 45000);
        System.out.println("Name of the holder "+bankAccount.getCustomerName()+" and balance is "+ bankAccount.getBalance()
        +" and their phone is "+bankAccount.getPhoneNumber());
    }

    String customerName;
    String email;
    int phoneNumber;
    private int accountNumber;
    private int balance;

    public BankAccount(String customerName, int balance) {
        this(54321, balance, customerName, "abc@gmail.com", 12345);
    }

    public BankAccount(int accountNumber, int balance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void depositFunds(int creditMoney) {
        balance = creditMoney + balance;
        System.out.println("Balance after crediting money is: " + balance);
    }

    public void withDrawFunds(int debitMoney) {
        if (balance <= 0) {
            System.out.println("Insufficient balance!");
        } else if (debitMoney > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance = balance - debitMoney;
            System.out.println("Withdrawl of " + debitMoney + " is processed. Balance after debiting money is: " + balance);
        }
    }
}
