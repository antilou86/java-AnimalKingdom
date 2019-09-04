package animals;

//create whole abstract class
public abstract class Animals {

    //define params
    private int maxId = 0;
    private int id;
    public int food = 0;
    public String name;
    public int yearDiscovered;
    public String moves;
    public String breathes;
    public String reproduces;

        //instantiate params
    public Animals (String name, int yearDiscovered) {
        maxId++;
        this.id = maxId;
        this.food = food;
        this.name = name;
        this.yearDiscovered = yearDiscovered;
        this.moves = moves;
        this.breathes = breathes;
        this.reproduces = reproduces;
    }   

        //create methods
    public int eats(int n) {
        return this.food += n;
    }

        //create abstract methods
    public abstract String getName();
    public abstract int getYearDiscovered();
    public abstract String moves();
    public abstract String breathes();
    public abstract String reproduces();

        //and an override on toString just in case.
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", yearDiscovered=" + yearDiscovered +
                ", breathes='" + breathes + '\'' +
                ", moves='" + moves + '\'' +
                ", reproduces='" + reproduces + '\'' +
                '}';
    }
}
