public class Main {
    public static void main(String[] args) {

        Person[] people =  new Person[4];

        people[0] = new Student("Davit", 1, "CS");
        people[1] = new Student("Elen", 2, "DS");
        people[2] = new Professor("Aram", 3, "Math", 5000);
        people[3] = new AdminStaff("Karen", 4, "Librarian", 3500);

        for( Person p : people){
            p.printDetails();
            if(p instanceof Payable){
                Payable staff = (Payable) p;
                System.out.println("Calculated Salary: " + staff.calculateSalary());
            }

            System.out.println("-----");
        }

        System.out.println("Total people: " + Person.getTotalPeople());

    }
}