package entity;

public abstract class Ship {
    private String name;
    private int displacement;

    public Ship() {

    }

    public Ship(String name, int displacement) {
        this.name = name;
        this.displacement = displacement;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public String sail() {
        return "плывет";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Ship ship = (Ship) o;

        if (displacement != ship.displacement) {
            return false;
        }
        return name != null ? name.equals(ship.name) : ship.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + displacement;
        return result;
    }
}
