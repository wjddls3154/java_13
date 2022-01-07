package org.opentutorials.javatutorials.classinstance;

class Calculator3 {

    public static void sum(int left, int right) {
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println( (left+right) / 2 );
    }

}

public class CalculatorDemo3 {

    public static void main(String[] args) {

        Calculator3.sum(10,20); // 30 출력
        Calculator3.avg(10,20); // 15 출력

        Calculator3.sum(20,40); // 60 출력
        Calculator3.avg(20,40); // 30 출력

        /**
         * 1. 인스턴스가 등장하지 않음.
         * 2. 클래스명.sum , 클래스명.avg 를 통해서 class 에 직접 접근해서, sum 과 avg 라는 메소드를 호출하고 있다.
         */


    }

}
