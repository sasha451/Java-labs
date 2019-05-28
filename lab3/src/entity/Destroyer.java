package entity;
// Авианосец
public class Destroyer extends Ship{
    private Plane plane;
    private AntiAircraftGun airGun;

    public Destroyer(){}

    public String launchPlane(){
        if(plane == null)
            plane = new Plane();
        //System.out.println("launch plane");
        String result = plane.takeOffPlane() + ", ";
        result += plane.toBomb() + ", ";
        result += plane.landPlane();
        return result;
    }
    public String takePlane(){
        return "принять самолет на палубу";
    }
    public String toUseAntiAircraftGun(){
        if(airGun == null)
            airGun = new AntiAircraftGun();
        return airGun.toShoot();
    }

}
