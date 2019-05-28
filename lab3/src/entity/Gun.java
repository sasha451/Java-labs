package entity;

public abstract class Gun {
    protected int caliber;
    protected int barrelLength;

    public Gun(){

    }

    public Gun(int caliber, int barrelLength){
        this.caliber = caliber;
        this.barrelLength = barrelLength;
    }

    public abstract String toShoot();
}
