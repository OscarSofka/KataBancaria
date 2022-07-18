package co.com.sofka;

import co.com.sofka.Account;

public class StarApp {
    public static void main(String[] args){
      
        Account account = new Account(); 
        
        account.deposit(amountOf(1000),date("10/01/2021"));
        
    }
}
