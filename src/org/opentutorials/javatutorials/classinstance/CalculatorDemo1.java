package org.opentutorials.javatutorials.classinstance;

class Calculator {
    static double PI = 3.14; // static 이 앞에 붙어있으면, 뒤에 따라오는 변수는 클래스에 소속이 된다. 저 변수를 모든 인스턴스에서 동일한 값을 가지게 된다.
    // 여기서 PI는 left right 처럼, 인스턴스마다 값이 달라지는게 아닌, 고정 값.

    int left, right;

    public void setOprands(int left,int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left+this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right)/2);
    }

}



public class CalculatorDemo1 {

    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.PI); // 인스턴스를 통한 클래스 변수 접근 1

        Calculator c2 = new Calculator();
        System.out.println(c2.PI); // 접근 2

        System.out.println(Calculator.PI); // 클래스를 통한 직접적 클래스 변수 접근

    }




}
