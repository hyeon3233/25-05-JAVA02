package ch02.sec01;

public class Basic {

        /*
        컴퓨터 메모리 = RAM (Random Access Memory): 휘발성, 데이터를 저장하는 공간
        변수 = 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
        하나의 변수는 다양한 타입의 값을 저장할 수 없다.
        즉, 정수형 변수에는 정수값만 저장 가능! 정수형 변수로 선언 후 다른 형의 변수로 변경 불가능
            실수형 변수에는 실수값만 저장 가능! 중간에 저장할 수 있는 타입을 바꿀 수 없음

        변수를 사용하려면 변수 선언 해야한다. 변수 선언할 때 저장할 값의 타입과 이름을 정한다.
        변수 선언할 때 저장할 값의 타입과 이름(변수명)을 정한다.
        같은 스코프(Scope) 안에서는 (같은 블록 안에서는) 같은 이름의 변수 선언은 최초 한번만 한다.
        int num;
        float num2;

        로컬(지역) 변수: 메소드 안에서 선언된 변수
         */
        public static void main(String[] args) {
            int a;
            // int a;
            { int b; }
            { int b; }
    }
}
