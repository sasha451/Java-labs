package ship;

public class Carrier extends Ship {
    private Torpedo torpedo;
    public String launchTorpedo(){
        if (torpedo == null)
            torpedo = new Torpedo();
        //System.out.println("launch torpedo");
        String result ="запускает торпеду, " + torpedo.blowUp();
        return result;
    }
}
