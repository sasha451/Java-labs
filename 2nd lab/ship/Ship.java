package ship;

public class Ship {
    private String name;
    private int displacement;

    public Ship(){

    }

    public Ship(String name, int displacement){
        this.name = name;
        this.displacement = displacement;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDisplacement(int displacement){
        this.displacement = displacement;
    }
    public String sail(){
        return "плывет";
       // System.out.println("to sail");
    }
}
