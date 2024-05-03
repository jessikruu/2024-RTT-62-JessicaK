package org.example.slides_303_3_3;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("filename.txt");

        sb.insert(0,"new_");

        System.out.println(sb);

        sb.replace(0,4,"old_");
        System.out.println(sb);

        sb.replace(0,4,"very_old_");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        sb.delete(0,4);
        System.out.println(sb);





    }
}
