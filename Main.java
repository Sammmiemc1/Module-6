 import java.util.ArrayList;
import java.util.Comparator;
public class Main {
	            public static void main(String[] args) {
	               
	                ArrayList<Student> students = new ArrayList<Student>();
	                students.add(new Student(1, "Carrie", "2024 Isla dr"));
	                students.add(new Student(2, "Ryan", "500 orange st"));
	                students.add(new Student(3, "Drew", "567 orange st"));
	                students.add(new Student(4, "Eric", "432 rick rd"));
	                students.add(new Student(5, "Christy", "600 Stanton dr"));
	                students.add(new Student(6, "Frank", "981 Oaklynn St"));
	                students.add(new Student(7, "Gabriella", "1212 Galveston St"));
	                students.add(new Student(8, "Joe", "8990 Maplewood St"));
	                students.add(new Student(9, "Kaleb", "4565 Beach St"));
	                students.add(new Student(10, "Marilyn", "1230 Burk St"));

	                
	                System.out.println("Before sorting:");
	                for (Student student : students) {
	                    System.out.println(student.rollno + " " + student.name + " " + student.address);
	                }

	                
	                SelectionSort.SelectionSort(students, new SortByName());
	                
	                System.out.println("\nAfter sorting by name:");
	                for (Student student : students) {
	                    System.out.println(student.rollno + " " + student.name + " " + student.address);
	                }

	               
	                SelectionSort.SelectionSort(students, new SortByRollNo());
	                System.out.println("\nAfter sorting by rollno:");
	                for (Student student : students) {
	                    System.out.println(student.rollno + " " + student.name + " " + student.address);
	                }
	            }
	    }

