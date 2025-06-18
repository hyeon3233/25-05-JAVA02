package ch07.sec07.poly;

public abstract class Animal {
    private int age;

    // 위와 같이 맴버 필드 맴버객체 다 가질 수있다.
    // 객체화만 할 수없다

    // 추상 메소드
    // 추상 메소드를 단 하나라도 가지고 있다면 그 클래스는
    // 추상클래스가 되어야한다
    // abstract 이 붙으면 객체화가 안된다 new가 안된다
    //abstract 이게 붙으면 추상 메소드임
    // 추상 클래스는 구현 부가 없어야한다
    // {}  <- 이게 없어야한다는 말
    public abstract void crying();

}
