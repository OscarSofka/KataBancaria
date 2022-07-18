import java.time.LocalDate;
import java.util.ArrayList;

import static java.lang.String.valueOf;

public class Account {
    private double saldoActual = 0;
    private ArrayList<Transaction> Transacciones = new ArrayList<>();
    void deposit(int amount, String date) {
        this.saldoActual += amount;
        LocalDate Fecha = DateFormatter.format(date);
        Transacciones.add(new Transaction(Fecha, saldoActual, "deposito", amount));
    }
    void withdraw(int amount, String date){
        this.saldoActual -= amount;
        LocalDate Fecha = DateFormatter.format(date);
        Transacciones.add(new Transaction(Fecha, saldoActual, "retiro", amount));
    }
    void printStatements() {
        for (Transaction movimiento:this.Transacciones){
            System.out.println("|   Fecha    || Operacion ||  Monto  ||  Balance |");
            System.out.print("| "+movimiento.getDate()+ " |");
            if (movimiento.getOperation().getTipo().equals("retiro")){
                System.out.print("| " + movimiento.getOperation().getTipo() + "    |");
            }
            if (movimiento.getOperation().getTipo().equals("deposito")){
                System.out.print("| " + movimiento.getOperation().getTipo() + "  |");
            }
            double monto = movimiento.getOperation().getMonto();
            String montoS = String.valueOf(monto);
            if (montoS.length() == 5){
                System.out.print("|  "+movimiento.getOperation().getMonto()+"  |");
            }
            if (montoS.length() == 6){
                System.out.print("|  "+movimiento.getOperation().getMonto()+" |");
            }
            System.out.print("|  "+movimiento.getBalance()+"  |");
            System.out.println();
        }
    }

}