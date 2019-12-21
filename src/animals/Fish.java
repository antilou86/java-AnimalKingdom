package animals;

//class declaration
public class Fish extends Animals {

    //class instance with super declaration 
    public Fish(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }
    //overrides for future inherited methods.
    @Override
    public String moves() {
        return "swim";
    }
    @Override
    public String breathes() {
        return "gills";
    }
    @Override
    public String reproduces() {
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
