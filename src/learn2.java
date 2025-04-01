public class learn2 {
    public static void main(String[] args) {
 Candidates sample = new Candidates("cse", 2024, "Kodenst");
 Candidates c1 = new Candidates(sample);
 c1.name = "Summit";
 c1.cgpa = 7.5;
c1.display();
    }
}

class Candidates {
    String name;
    String branch;
    int yop;
    double cgpa;
    String institute;

    public Candidates(String branch, int yop, String institute) {
        this.branch = branch;
        this.yop = yop;
        this.institute = institute;
    }

    public Candidates(Candidates c) {
        this.branch = c.branch;
        this.yop = c.yop;
        this.institute = c.institute;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Year: " + yop);
        System.out.println("Cgpa: " + cgpa);
        System.out.println("Institute: " + institute);
    }
}
