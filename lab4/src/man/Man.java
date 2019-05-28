package man;

import cashbox.Cashbox;
import kitchen.Kitchen;

import java.util.concurrent.TimeUnit;

public class Man extends Thread {
    private Cashbox cashbox = null;
    private Kitchen kitchen = null;

    public Man(Cashbox cashbox, Kitchen kitchen){
        this.cashbox = cashbox;
        this.kitchen = kitchen;
    }
    @Override
    public void run(){
        cashbox.toOrder();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        kitchen.getOrder();
    }
}
