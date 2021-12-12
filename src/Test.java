import java.util.*;
public class Test{
    public static void main(String args[]){
        ArrayList<  C> al=new ArrayList<C>();
        al.add(new C(1,"A",10));
        al.add(new C(2,"B",20));
        al.add(new C(3,"C",30   ));

        Collections.sort(al);
        for(C st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}