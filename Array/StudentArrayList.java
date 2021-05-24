package Array;

import Array.Student;

import java.util.ArrayList;
 public class StudentArrayList{
       public static void main(String args[]){

       	//ArrayList are dynamic collections of objects (refence types only)
       	ArrayList<Student> stu = new ArrayList<Student>();


        // Adding Some Students
        stu.add(new Student("Arun",3.9));
        stu.add(new Student("Raja",4.9));
        stu.add(new Student("saleem",2.9));
        stu.add(new Student("safir",4.5));
        stu.add(new Student("subash",5.0));

        // Access as a collectiom
        System.out.printf("Student\tGPA\n");
        for(Student s : stu){
        	System.out.printf("%s\n",s);
        }
        System.out.println();


        //Access with index,similar to an array
        System.out.printf("Student\tGPA\n");
        for(int i=0;i< stu.size(); i++){
        	System.out.printf("%s\n",stu.get(i));
        }
       }
 }