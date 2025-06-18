package ch07.sec07.poly;

public class AnimalExample {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Tiger tiger = new Tiger();
        Cow cow = new Cow();
        Dog dog = new Dog();
        BullDog bulldog = new BullDog();

        animalCrying(cat);
        animalCrying(tiger); // 여기서 어흥어흥 없어지면 그위에있는
        //cat이 작동해서 야옹야옹 으로 출력된다
        // override가 되어있다면 상위 상속 하는 것에 있는 객체가 실행된다
        animalCrying(dog);
        animalCrying(bulldog);
        // 불독은 월~ 월~
        // 불독이 짬푸한다.
    }
    public static void animalCrying (Animal animal) {
        animal.crying();
        // Dog 객체 넘어오면 jump 메소드 호출
        if (animal instanceof Dog) {
            ((Dog) animal).jump();
        }
//        Dog dog = (Dog)animal;
//        dog.jump();
//        }
    }
//    public static void animalCrying (Cat cat)   {cat.crying(); }
//    public static void animalCrying (Tiger tiger)   {tiger.crying(); }
//    public static void animalCrying (Cow cow)   {cow.crying(); }


}
