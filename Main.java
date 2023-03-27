interface Exam {
    void examSpring();
    void examSummer();
    void examFall();
}
abstract class Spring implements Exam {
    public void examSpring() {
        System.out.println("Spring exam");
    }
}
class Summer extends Spring {
    public void examSummer() {
        System.out.println("Summer exam");
    }
    public void examFall() {
        System.out.println("Fall exam");
    }
}
public class Main {
    public static void main(String[] args) {
        Summer summer = new Summer();
        summer.examSpring();
        summer.examSummer();
        summer.examFall();
    }
}
