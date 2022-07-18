public class StartApp {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(1000, "10/01/2022");
        account.deposit(200,"13/01/2022");
        account.withdraw(500,"14/01/2022");
        account.printStatements();
    }

}