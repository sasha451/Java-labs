package entity;
// Эсминец
public class Carrier extends Ship {
    private Torpedo torpedo;
    private AntiAircraftGun airGun;
    private MainGun mainGun;

    public String launchTorpedo(){
        if (torpedo == null)
            torpedo = new Torpedo();
        //System.out.println("launch torpedo");
        String result ="запускает торпеду, " + torpedo.blowUp();
        return result;
    }
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
