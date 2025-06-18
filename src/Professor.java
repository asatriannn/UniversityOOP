public class Professor extends Staff{

    public Professor(String name, int id, String dept, double baseSalary){
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return baseSalary + 1500;
    }

    @Override
    public void printDetails(){
        System.out.println("Professor: " + name + " | ID: " + id + " | Salary: $" + calculateSalary());
    }
}
