package animals;

//class declaration
public class Mammals extends Animals {

    //class instance with super declaration 
    public Mammals(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }
    //overrides for future inherited methods.
    @Override
    public String moves() {
        return "walk";
    }
    @Override
    public String breathes() {
        return "lungs";
    }
    @Override
    public String reproduces() {
        return "live births";
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getYearDiscovered() {
        return yearDiscovered;
    }
}
