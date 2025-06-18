public class AdminStaff extends Staff{

    public AdminStaff(String name, int id, String dept, double baseSalary){
        super(name, id, baseSalary);
    }

    @Override
    public double calculateSalary(){
        return baseSalary + 500;
    }

    @Override
    public void printDetails(){
        System.out.println("Admin: " + name + " | ID: " + id + " | Salary: $" + calculateSalary());
    }
}
