package oops;
import java.util.*;
public class oop1 {
    public static void main(String args[])
    {
        student s=new student();//creating s object
        System.out.println(s.marks);
        System.out.println(s.name);
        System.out.println(s.rono);
        s.greeting();//calling greeting method
        s.changerollno(33344);//calling changerollno method
        System.out.println(s.rono);
        student r=new student();//creating r object
        r.changerollno(4528);
        System.out.println(r.marks);
        System.out.println(r.name);
        System.out.println(r.rono);
        student b=new student(r);//creating object b 
        System.out.println(b.name);//other.name=b.name
    }
}
    class student{
        int rono;
        String name;
        float marks;
        void greeting()//prints name
        {
            System.out.println("my name is"+" "+this.name);//refers to s.name
        }
        void changerollno(int rollno)//changes rollnumber
        {
             this.rono=rollno;//refers to s.name
        }
        //constructor with no arguments
    student()
    {
        this.rono=34;
        this.name="hemanth";
        this.marks=2342.5f;
    }
    student(student other)
    {
        this.name=other.name;
        this.rono=other.rono;
        this.marks=other.marks;
    }
    //constructor with  arguments
    student(int r,String n,float m)
    {
        this.rono=r;
        this.name=n;
        this.marks=m;
    }
}
