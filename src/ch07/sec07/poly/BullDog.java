package ch07.sec07.poly;

public class BullDog extends Dog {

    @Override
    public void crying() {
        System.out.println("불독은 월~ 월~");
    }

    @Override
    public void jump() {
        System.out.println("불독이 ");
        super.jump();
    }
}