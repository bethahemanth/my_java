package oops;
public class oop2 {
    public static void main(String args[])
    {
        st h=new st(3,"Heamnth",45.435f);//calling with constructor arguments
        System.out.println(h.rank);
        System.out.println(h.name);
        System.out.println(h.marks);
        st ha=new st();
        System.out.println(ha.rank);
        System.out.println(ha.name);
        System.out.println(ha.marks);
        st one=new st();
        st two=one;//refering to object one
        two.name="madhav";
        System.out.println(two.name);
        one.name="yuvraj";
        System.out.println(one.name);
        System.out.println(two.name);//two.name cahnges as one name is changed
        //No, pass by reference does not apply to primitive data types in Java.
        // Primitive data types are passed by value, meaning that a copy of the value is passed to the method.
        //Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
        Integer a=10;
        System.out.println("wrapper class value "+a);//printing value 
    }
}
class st
{
    int rank;
    String name;
    float marks;
    st()
    {
        //calling another constructor
        //basically refers to student(2."hanish",454.233f)
        this(2,"hanish",454.233f);
    }
    st(int r,String n,float m)
    {
        this.rank=r;
        this.name=n;
        this.marks=m;
    }
}
class a
{
    String nam;
    a(String n)
    {
        this.nam=n;
    }
}
