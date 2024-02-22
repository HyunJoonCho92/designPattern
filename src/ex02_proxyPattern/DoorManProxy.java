package ex02_proxyPattern;

public class DoorManProxy {

    //컴퍼지션
    private DoorMan doorMan;

    public DoorManProxy(DoorMan doorman){
        this.doorMan = doorman;
    }

    public void kickOut(Animal a){
        System.out.println("ByeBye");
        this.doorMan.kickOut(a);
    }
}
