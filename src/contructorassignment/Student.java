/*Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name
should be "Unknown", otherwise the name should be equal to the String value passed while
creating object of Studentclass.*/

package contructorassignment;

public class Student {

       public Student(){
            System.out.println("Student name is Unknown");

        }
        public Student(String name){

            System.out.println("Student name is " + name);
        }
    public static void main(String[] args) {
        Student student = new Student();
       Student student1 = new Student("Jayita");

    }

}
