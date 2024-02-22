package ex01_strategyPattern;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorMan dm = new DoorMan();

        dm.kickOut(m);
        dm.kickOut(c);
    }
    
}
