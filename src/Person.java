public abstract class Person {

    protected String name;
    protected int id;
    protected static int totalPeople = 0;
    public static final String UNIVERSITY_NAME = "AUA";

    public Person(String name, int id){
        this.name = name;
        this.id = id;
        totalPeople++;
    }

    public abstract void printDetails();

    public static int getTotalPeople() {
        return totalPeople;
    }

}
