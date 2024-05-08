package abstractEmployee;

public class Wagonr extends Car {
    @Override
    public void drive() {
System.out.println("driving");
    }

    @Override
    void fly() {
        System.out.println("flying car");
   }

    @Override
    public void playMusic() {
      System.out.println("playing music");
    }
public void seats(){
System.out.println("It is a 5 seater");
    }
}
