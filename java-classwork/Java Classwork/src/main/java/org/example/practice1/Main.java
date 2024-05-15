package org.example.practice1;

public class Main {
    public static void main(String args[]) {
        B obj = new C();
        for (int i = 0; i < obj.getSdlc().length;
             i++) {
            System.out.print(obj.getSdlc()[i] + "");
        }
    }
}
