package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        example1();
    }
    private  static  void  example1(){
        GenericNumber genericNumber = new GenericNumber<Integer>();
        genericNumber.enterNumber(1);
        genericNumber.enterNumber(45);
        genericNumber.enterNumber(3);
        genericNumber.dislay();

        genericNumber = new GenericNumber<Float>();
        genericNumber.enterNumber(10f);
        genericNumber.enterNumber(20f);
        genericNumber.dislay();
    }
}