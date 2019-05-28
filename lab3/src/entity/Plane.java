package entity;

public class Plane {

    private String name;
    private Destroyer destroyer;

    public Plane(String name){
        this.name = name;
    }


    public Plane(){}

    public String takeOffPlane(){
        //System.out.println("take off plane");
        return "запустить самолет";
    }

    public String toBomb(){
        return "самолет проводит бомбардировку";
    }

    public String landPlane(){
        if(destroyer == null)
            destroyer = new Destroyer();
        //System.out.println("land plane");
        String result ="самолет садится, " + destroyer.takePlane();
        return result;
    }
}
