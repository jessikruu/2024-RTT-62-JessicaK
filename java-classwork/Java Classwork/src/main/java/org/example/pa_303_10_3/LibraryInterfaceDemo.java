package org.example.pa_303_10_3;

public class LibraryInterfaceDemo {

    public static void main(String[] args) {

        KidUser k1 = new KidUser();
        KidUser k2 = new KidUser();

        AdultUser a1 = new AdultUser();
        AdultUser a2 = new AdultUser();

        k1.setAge(10);
        k2.setAge(18);

        k1.setBookType("Kids");
        k2.setBookType("Fiction");

        a1.setAge(5);
        a2.setAge(23);

        a1.setBookType("Kids");
        a2.setBookType("Fiction");

        k1.registerAccount();
        k1.requestBook();

        k2.registerAccount();
        k2.requestBook();

        a1.registerAccount();
        a2.requestBook();

        a1.registerAccount();
        a2.requestBook();


    }
}
