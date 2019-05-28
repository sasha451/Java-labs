package kitchen;

public class Kitchen extends Thread {
    private int ordersNumber = 0;
    private boolean readyToCook = false;

    public synchronized void toCook(){
        readyToCook = true;
        if(ordersNumber > 5){
            System.out.println("Now kitchen is busy, please wait...");
            try {
                wait();
            } catch (InterruptedException e) {
               // e.printStackTrace();
            }
        }
        ordersNumber++;
        System.out.println("Order is in queue");
        notify();
    }
    public synchronized void getOrder(){
        if(ordersNumber < 1 || readyToCook == false){
            System.out.println("Kitchen is waiting for order...");
            readyToCook = false;
            try {
                wait();
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
        }
        ordersNumber--;
        System.out.println("Order is ready");
        notify();
    }
    @Override
    public void run(){
        do
        {
            if(!Thread.interrupted())	//Проверка прерывания
            {
            }
            else
                return;		//Завершение потока

            try{
                Thread.sleep(1000);		//Приостановка потока на 1 сек.
            }catch(InterruptedException e){
                return;	//Завершение потока после прерывания
            }
        }
        while(true);
    }
}
