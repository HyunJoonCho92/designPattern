package ex02_proxyPattern;

public class App {
    public static void main(String[] args) {
        Mouse m = new Mouse();
        Cat c = new Cat();
        DoorManProxy dm = new DoorManProxy(new DoorMan());

        dm.kickOut(m);
        dm.kickOut(c);
    }
    
}
