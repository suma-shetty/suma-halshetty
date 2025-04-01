public class practice {
    static {
        System.out.println("Static block is executing");
    }
    {
        System.out.println("Non-static block / instance block is executing");
    }
    practice() {
        System.out.println("Constructor is executing");
    }
    public static void main(String[] args) {
        System.out.println("Main() is executing");
       practice p1 = new practice();
        practice p2 = new practice();
        practice p3 = new practice();

    }
}
