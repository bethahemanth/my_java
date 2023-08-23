package oops;

public class oop3 {
    public static void main(String args[])
    {
        final int si=21;//initialized while declaring and cannot be modidied or initialized
        final a s=new a("hemanth");
        s.name="rohit";
        System.out.println(s.name);
       //cannot reassign in non primitive datatypes s=new a("hello");
    }
}
class a
{
    String name;
    a(String n)
    {
        this.name=n;
    }
}