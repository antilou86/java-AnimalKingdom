package animals;

//class declaration
public class Birds extends Animals {

    //class instance with super declaration 
    public Birds(String name, int yearDiscovered) {
        super(name, yearDiscovered);

    }
    //overrides for future inherited methods.
    @Override
    public String move() {
        return "fly";
    }
    @Override
    public String breathe() {
        return "lungs";
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
