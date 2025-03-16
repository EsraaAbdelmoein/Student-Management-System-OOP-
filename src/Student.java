public class Student extends Person {
    private static int idCounter = 1000;
    private String studentId;
    private String major;
    private double GPA;

    public Student(String name, int age, String address, String major, double GPA) {
        super(name, age, address);
        this.studentId = generateStudentId();
        this.major = major;
        this.GPA = GPA;
    }

    public Student() {
        super("Unknown", 0, "Unknown");
        this.studentId = generateStudentId();
        this.major = "Undeclared";
        this.GPA = 0.0;
    }

    public static String generateStudentId() {
        return "S" + (idCounter++);
    }

    public String getStudentId() {
        return studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
        System.out.println("-------------------------");
    }
}

