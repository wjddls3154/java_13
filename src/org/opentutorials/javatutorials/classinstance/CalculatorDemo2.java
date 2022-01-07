package org.opentutorials.javatutorials.classinstance;

class Calculator2 {
    static double PI = 3.14; // 클래스 변수 PI, 실수를 담음.

    static int base = 0; // 클래스 변수인 base 가 추가되었다, 정수를 담음.
    int left,right; // 인스턴스 변수, 인스턴스마다 다른 값을 가짐. 클래스 변수 아님. this.left 와 this.right 가 이에 해당.


    public void setOprands(int left,int right) { // int left, int right 에는 인스턴스마다 다른 값 10,20 과 20,40이 들어옴.
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base); // 더하기에 base 의 값을 포함시킨다.
    }

}

public class CalculatorDemo2 {

    public static void main(String[] args) {
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10,20);
        c1.sum(); // 30 출력, 기존에는 base 의 값이 0이기 때문에 더해도 똑같음.

        Calculator2 c2 = new Calculator2();
        c2.setOprands(20,40);
        c2.sum(); // 60 출력, 기존에는 base 의 값이 0이기 때문에 더해도 똑같음.

        Calculator2.base = 10; // 허나, 클래스 변수 base 의 값을 10으로 지정했다. 그래서 이후의 값도 변하게 됨.

        c1.sum(); // 기존에 있는 base 의 값 10에, c1.sum 의 값 30을 더하여 40 출력

        c2.sum(); // 기존에 있는 base 의 값 10에, c2.sum 의 값 60을 더하여 70 출력

    }

}
