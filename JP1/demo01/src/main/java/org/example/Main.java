package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       show();
        System.out.println("Total x + y = "+total(4,7));
        showLoop();
    }
    private static void show(){
        for (int i =0; i<10; i++){
            System.out.println("i= "+i);
        }
    }
    public static  double total(double x, double y){
        return x+y;
    }
    private static  void  showLoop(){
        int i =0;
        while (i<10){
            System.out.println(i);
            if (i%2==0)
            {
                System.out.println("Even");
            }
            else {
                System.out.println("Old");
            }
            i++;
        }
    }
}