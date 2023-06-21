package com.nishasoni;

public class FinalizeTest {

    public void finalize(){

        System.out.println("Overridden finalize method called");

    }

    public static void main(String[] args) {
//        String s = "Nisha Soni";
//        s = null;

        FinalizeTest f = new FinalizeTest(); //create a obj to call a finalize method
        f = null;

        System.gc();  // call gc just before destoying the obj
        System.out.println("End of main method");
    }
}
