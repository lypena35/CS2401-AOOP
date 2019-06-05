package Exercise1;
 import java.util.*;

/**
 * Created by LoriPena on 9/17/18.
 * Lorianne Pena
 */
public class Professor extends Person {
        public Professor (String name, String department, int id){
            this.name = name;
            this.department = department;
            this.ID = ID;
        }

        public ArrayList<Student> studentList = new ArrayList<Student>();

        public static void viewCourses(){}

        public static void grade(){}

        public static void listStudents(){}

        public void addStudent(String name, String department, int id){
            Student newStudent1 = new Student(name, department,id);

            studentList.add(newStudent1);
        }

    }

