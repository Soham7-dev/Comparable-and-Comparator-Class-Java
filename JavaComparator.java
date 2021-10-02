import java.util.*;
import java.lang.*;

public class JavaComparator{

    public static void main(String args[]){
        
        List<Student> li = new ArrayList<>();

        li.add(new Student(5, "Sophiet", 16));
        li.add(new Student(10, "Julia", 17));
        li.add(new Student(8, "Samuel", 15));
        li.add(new Student(4, "Alex", 18));

        //WITHOUT LAMBDA METHOD
        // Collections.sort(li, new Comparator<Student>(){
        //     @Override
        //     public int compare(Student s1, Student s2){
        //         return s1.name.compareTo(s2.name);
        //     }
        // });

        //WITH LAMBDA METHOD
        Collections.sort(li, (s1,s2) -> s1.name.compareTo(s2.name));

        System.out.println("\n**********Sorting Student According to their Names**********\n");

        System.out.println(li + "\n");
    }

    static class Student{
        int roll_no;
        String name;
        int age;

        Student(int roll_no, String name, int age){
            this.roll_no = roll_no;
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString(){
            return String.format(roll_no + " " + name + " " + age);
        }
    }
}