import java.util.ArrayList;
import java.util.Comparator;

class Student {
	    int rollno;
	    String name;
	    String address;

	    public Student(int rollno, String name, String address) {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	}

	class SortByName implements Comparator<Student> {
	    public int compare(Student s1, Student s2) {
	        return s1.name.compareTo(s2.name);
	    }
	}

	class SortByRollNo implements Comparator<Student> {
	    public int compare(Student s1, Student s2) {
	        return s1.rollno - s2.rollno;
	    }
	}
	