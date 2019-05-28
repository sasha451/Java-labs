package cashbox;

import kitchen.Kitchen;

public class Cashbox {
    private Kitchen kitchen;
    public Cashbox(Kitchen kitchen){
        this.kitchen = kitchen;
    }
    public synchronized void toOrder(){
        kitchen.toCook();
    }
}
