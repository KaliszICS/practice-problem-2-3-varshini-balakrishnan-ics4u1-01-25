public class PracticeProblem {

	public static void bubbleSortString(String[] strings) {
		boolean swapped;
		for (int j = 0; j < strings.length - j; j++) {
			swapped = false;
			for (int i = 1; i < strings.length - j; i++) {
				if (strings[i-1].compareToIgnoreCase(strings[i]) > 0) {
					String temp = strings[i-1]; 
					strings[i-1] = strings[i];
					strings[i] = temp;
					swapped = true;
				}
			}
			if(!swapped) {
				break;
			}
		}
	}
}
