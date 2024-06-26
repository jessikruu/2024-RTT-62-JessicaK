package org.example.pa_303_11_1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student implements Comparable<Student>{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    //============ code writen here===============
    public int compareTo(Student s){
        if(this.getCgpa()<s.getCgpa())return 1;
        else if(this.getCgpa()==s.getCgpa()){
            if(this.getFname().compareTo(s.getFname())==0){
                return this.getId()-s.getId();
            }else return this.getFname().compareTo(s.getFname());
        }else return -1;
    }
}


class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        ArrayList<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }
        //calling sort method on studentList
        Collections.sort(studentList);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }


}
