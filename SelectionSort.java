import java.util.ArrayList;
import java.util.Comparator;

class SelectionSort {
	    public static void SelectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
	       
	        for (int i = 0; i < students.size() - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < students.size(); j++) {
	                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
	                    minIndex = j;
	                }
	            }
	            Student temp = students.get(i);
	            students.set(i, students.get(minIndex));
	            students.set(minIndex, temp);
	        }
	    }
}
	    