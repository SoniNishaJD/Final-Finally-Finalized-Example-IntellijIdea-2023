package com.nishasoni;

public class Finally {

    public static void show() {

        int i = 20;    //2. variable Now make a catch

        try {
            System.out.println("In Show Method");
            double d = i/0;   // this statement should throw exception

            double d1 = i/10;      //3. return
            return;
        }
        catch (ArithmeticException e){
            System.out.println("In catch Block");
            e.printStackTrace();
        }
        finally {
            System.out.println(" In Finally Block"); // Always finally block will executed
        }

    }


    public static void main(String[] args) {
        show();
    }
}