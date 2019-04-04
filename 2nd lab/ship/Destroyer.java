package ship;

public class Destroyer extends Ship{
    public Destroyer(){}

    private Plane plane;

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
}
