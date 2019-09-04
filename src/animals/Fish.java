package animals;

//class declaration
public class Fish extends Animals {

    //class instance with super declaration 
    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }
    ///overrides for inherited methods.
    @Override
    public String move() {
        return "swim";
    }
    @Override
    public String breathe() {
        return "gills";
    }
    @Override
    public String reproduce() {
        return "eggs";
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
