import java.util.Comparator;

class SortedByAge implements Comparator<Students> {

	public int compare(Students obj1, Students obj2) {

		double age1 = obj1.getAge();
		double age2 = obj2.getAge();

		if (age1 > age2) {
			return 1;
		} else if (age1 < age2) {
			return -1;
		} else {
			return 0;
		}
	}
}
