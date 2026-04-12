import java.util.*;

// Transaction Class
class Transaction {
    String type;
    double amount;

    Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

// Bank Account Class
class BankAccount {
    String username;
    String phone_no;
    String aadhar_no;
    String pin;
    double balance;
    List<Transaction> history = new ArrayList<>();

    BankAccount(String username, String phone_no, String aadhar_no, String pin, double minBalance) {
        this.username = username;
        this.phone_no = phone_no;
        this.aadhar_no = aadhar_no;
        this.pin = pin;
        this.balance = minBalance;
        history.add(new Transaction("\nAccount Created", minBalance));
    }

    boolean login(String inputPin) {
        return this.pin.equals(inputPin);
    }

    void deposit(double amount) {
        balance += amount;
        history.add(new Transaction("Deposit", amount));
        System.out.println(+ amount + "\nDeposited");
    }

    void withdraw(double amount) {
        double amt=balance-500;
        if (amount >= amount) {
            balance -= amount;
            history.add(new Transaction("Withdraw", amount));
            System.out.println(+ amount + "\nWithdrawn");
        } else {
            System.out.println("\nInsufficient Balance!");
        }
    }

    void viewBalance() {
        System.out.println("Balance: $" + balance);
    }

    void showHistory() {
        System.out.println("\nTransaction History:");
        for (Transaction t : history) {
            System.out.println(t.type + " - $" + t.amount);
        }
    }
}

// Main Class
public class BankingSystem {

    static Map<String, BankAccount> accounts = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("=====================================");
            System.out.println("\n1.Create Account \n2.Login \n3.Exit");
            System.out.println("=====================================");
            System.out.print("\nChoice: ");
            int ch = Integer.parseInt(sc.nextLine());
            System.out.println("\n------------------------------------");

            switch (ch) {

                // To Create Account
                case 1:
                    System.out.print("Username: ");
                    String user = sc.nextLine();

                    System.out.print("phone_no: ");
                    String phone_no = sc.nextLine();
                    if(phone_no.length()!=10){
                        System.out.println("!Error:Invalid Number,check the Number");
                        break;
                    }

                    System.out.print("aadhar_no: ");
                    String aadhar_no = sc.nextLine();
                    if(aadhar_no.length()!=12){
                        System.out.println("!Error:Invalid Number,check the Number");
                        break;
                    }

                    System.out.print("Set PIN: ");
                    String pin = sc.nextLine();

                    System.out.print("Minimum Balance: ");
                    double minBal = Double.parseDouble(sc.nextLine());
                    
                    accounts.put(user, new BankAccount(user, phone_no, aadhar_no, pin, minBal));
                    System.out.println("Account Created!");
                    break;

                //  For Login
                case 2:
                    System.out.print("Enter Username: ");
                    String uname = sc.nextLine();

                    BankAccount acc = accounts.get(uname);

                    if (acc == null) {
                        System.out.println("Account not found!");
                        break;
                    }

                    System.out.print("Enter PIN: ");
                    String inputPin = sc.nextLine();

                    if (!acc.login(inputPin)) {
                        System.out.println("Wrong PIN!");
                        break;
                    }

                    System.out.println("Login Successful!");

                    // After Login Menu
                    while (true) {
                        System.out.println("\n1.Deposit \n2.Withdraw \n3.Balance \n4.History \n5.Logout");
                        System.out.print("Choice: ");
                        int op = Integer.parseInt(sc.nextLine());

                        switch (op) {
                            case 1:
                                System.out.print("Amount: ");
                                acc.deposit(Double.parseDouble(sc.nextLine()));
                                break;

                            case 2:
                                System.out.print("Amount: ");
                                acc.withdraw(Double.parseDouble(sc.nextLine()));
                                break;

                            case 3:
                                acc.viewBalance();
                                break;

                            case 4:
                                acc.showHistory();
                                break;

                            case 5:
                                System.out.println("Logged out!");
                                break;

                            default:
                                System.out.println("Invalid choice");
                        }

                        if (op == 5) break;
                    }
                    break;

                case 3:
                    System.out.println("System Exit");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}