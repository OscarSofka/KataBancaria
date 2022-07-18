import java.time.LocalDate;
public class Transaction {
    private LocalDate date;
    private double balance;
    private Operation Operation;
    public Transaction(LocalDate date, double balance, String operation, double amount) {
        this.date = date;
        this.balance = balance;
        this.Operation = new Operation(operation,amount);
    }

    public LocalDate getDate() {
        return date;
    }
    public double getBalance() {
        return balance;
    }
    public Operation getOperation() {
        return Operation;
    }
}