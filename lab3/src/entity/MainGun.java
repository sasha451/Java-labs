package entity;

public class MainGun extends Gun {
    public MainGun(){
        this.caliber = 30;
        this.barrelLength = 140;
    }
    public String toShoot(){
        long time = System.currentTimeMillis();
        if(time % 2 == 0){
            return "Попадание!";
        } else {
            return "Мимо!";
        }
    }
}
