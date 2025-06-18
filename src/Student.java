public class Student extends Person{

    private String major;

    public Student(String name, int id, String major){
        super(name, id);
        this.major = major;
    }

    @Override
    public void printDetails(){
        System.out.println("Student: " + name + " | ID: " + id + " | Major: " + major);
    }
}
