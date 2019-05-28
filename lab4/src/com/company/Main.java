package com.company;

import cashbox.Cashbox;
import kitchen.Kitchen;
import man.Man;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Kitchen kitchen = new Kitchen();
        kitchen.setDaemon(true);
        final Cashbox cashbox = new Cashbox(kitchen);
        kitchen.start();
        for (int i = 0; i < 10; i++){
            Man man = new Man(cashbox, kitchen);
            man.start();
        }
        try{
            Thread.sleep(1000);		//Приостановка потока на 1 сек.
        }catch(InterruptedException e){
            return;	//Завершение потока после прерывания
        }
        //kitchen.interrupt();
    }
}
