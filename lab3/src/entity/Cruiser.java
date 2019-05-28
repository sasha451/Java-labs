package entity;

public class Cruiser extends  Ship{
    private AntiAircraftGun airGun;
    private MainGun mainGun;

    public Cruiser(){}

    public String toUseAntiAircraftGun(){
        if(airGun == null)
            airGun = new AntiAircraftGun();
        return airGun.toShoot();
    }
    public String toUseMainGun(){
        if(mainGun == null)
            mainGun = new MainGun();
        return mainGun.toShoot();
    }
}
