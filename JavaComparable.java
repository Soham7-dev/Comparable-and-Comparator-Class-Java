import java.util.*;
import java.lang.*;

public class JavaComparable{

    public static void main(String args[]){

        List<Student> li = new ArrayList<>();

        li.add(new Student(2, "Adam", 17));
        li.add(new Student(5, "Bob", 16));
        li.add(new Student(9, "Alice", 17));
        li.add(new Student(10, "Soham", 14));
        li.add(new Student(11, "Madison", 19));

        System.out.println("\n**********Sorting Students According to their Age**********\n");
        Collections.sort(li);
        System.out.println(li + "\n");
    }

    static class Student implements Comparable<Student>{
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

        @Override
        public int compareTo(Student that){
            return this.age - that.age;
        }

    }
}