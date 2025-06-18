public abstract class Staff extends Person implements Payable {

    protected double baseSalary;

    public Staff(String name, int id, double baseSalary){
        super(name, id);
        this.baseSalary = baseSalary;
    }

}
