package entity;

public class AntiAircraftGun extends Gun {
    public AntiAircraftGun() {
        this.caliber = 7;
        this.barrelLength = 80;
    }

    public String toShoot() {
        long time = System.currentTimeMillis();
        if (time % 2 == 0) {
            return "Мимо!";
        } else {
            return "Попадание!";
        }
    }
}
