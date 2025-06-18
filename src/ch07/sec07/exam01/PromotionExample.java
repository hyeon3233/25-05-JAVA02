package ch07.sec07.exam01;

public class PromotionExample {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();


        A a1 = b; // 부모타입은 자식 객체 주소값 담을 수 있다. > 다형성
        // 반대로 자식타입이 부모 객체를 담을 순 없다
        // 타입을 알고 있는 메소드만 호출 할 수 있다.

        A a2= e; // 이건 됨 그리고 자동 형변환이 된다

        E e2 = (E)a2;
       // D d2= e; //안 된다
       // D d3= (D)b; //자식 타입은 부모 객체 주소값 담을 수 없다 .
    }
}

class A{}
class B extends  A{}
class C extends  A{}

class D extends  B{}
class E extends  C{}


