import java.util.Comparator;

public class SortByName implements Comparator<Students> {

	@Override
	public int compare(Students o1, Students o2) {
		 String str1 = o1.getName();
         String str2 = o2.getName();
         return str1.compareTo(str2);
	}
}
