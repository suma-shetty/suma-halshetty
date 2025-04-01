public class learn {
    public static void main(String[] args) {
        Candidate c1 = new Candidate("Summit", "CS", 2023, 8.2, "ganga");
        c1.display();
        Candidate c2 = new Candidate("Suma", "CS", 2024, 8.2, "bharathi");
        c2.display();
        Candidate c3 = new Candidate("Ganni", "CS", 2023, 8.2, "cef");
        c3.display();
    }
}
class Candidate {
    String name;
    String branch;
    int yop;
    double cgpa;
    String institute;

    public Candidate (String name, String branch, int yop, double cgpa, String institute) {
        this.name = name;
        this.branch = branch;
        this.yop = yop;
        this.cgpa = cgpa;
        this.institute = institute;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + yop);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("Institute: " + institute);
    }
}
