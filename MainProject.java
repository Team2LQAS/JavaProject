import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainProject {

	public static boolean isLatinOnly(String string) {
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch <= 'A' || ch >= 'z') {
				return false;
			}
		}
		return true;
	}

	public static boolean isOnlyNumber(String number) {
		for (int i = 0; i < number.length(); i++) {
			char ch = number.charAt(i);
			if (ch <= '0' || ch >= '9') {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String filePath = "Students.txt";
		List<Students> list = new ArrayList<Students>();
		try {
			FileReader fin = new FileReader(filePath);
			Scanner sc = new Scanner(fin);
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String parts[] = line.split("[\\s.!:;?-]+");
				if (isLatinOnly(parts[0]) && isOnlyNumber(parts[1])
						&& isOnlyNumber(parts[2])) {
					list.add(new Students(parts[0], new Integer(parts[1]),
							new Integer(parts[2])));
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println(list);
		Collections.sort(list, new SortByName());
		System.out.println(list);
		Collections.sort(list, new SortedByAge());
		System.out.println(list);
	}

}
