package org.example.slides_303_3_3;

public class StringBufferExample {
    public static void main(String[] args) {

        //run in debugger to u/s each method
        //for the KBA use a piece of paper to write the string down
        //the second argument isn't inclusive
        //for example, position 0,4 would replace 0 1 2 3

        StringBuffer sb = new StringBuffer("filename.txt");

        sb.insert(0,"new_");

        //new_filename.txt
        System.out.println(sb);

        //old_filename.txt
        sb.replace(0,4,"old_");
        System.out.println(sb);

        //very_old_filename.txt
        sb.replace(0,4,"very_old_");
        System.out.println(sb);

        //txt.emanelif_dlo_yrev
        sb.reverse();
        System.out.println(sb);

        //emanelif_dlo_yrev
        sb.delete(0,4);
        System.out.println(sb);





    }
}
