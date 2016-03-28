import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * Count the occurrences of each character. If any character appears a number of times not divisible by K,
 *  obviously, there is no solution. Otherwise, 
 * if the string is a K-string   then create your result strings other
 * */
public class k_String {

	private static Scanner in;
	private static char[] inputChars;
	private static Map<Character, Integer> charOccurances;
	private static boolean k_string = true;

	public static void main(String[] args) {

		int k;
		String input, result = "", resultPartial = "";
		charOccurances = new HashMapDefaultedValue<Character, Integer>(0);
		in = new Scanner(System.in);
		k = in.nextInt();
		input = in.next();
		inputChars = input.toCharArray();
		Arrays.sort(inputChars);
		for (int j = 0; j < inputChars.length; j++) {

			charOccurances.put(inputChars[j],
					charOccurances.get(inputChars[j]) + 1);
		}
		int counter = k;
		while (counter-- > 0) {
			for (Map.Entry<Character, Integer> entry : charOccurances
					.entrySet()) {
				char key = entry.getKey();
				int value = entry.getValue();
				if (value % k > 0) {
					k_string = false;
					break;
				}

				for (int i = 0; i < value / k; i++) {
					resultPartial += key;
				}

			}
			result += resultPartial;
			resultPartial = "";
		}
		if (k_string) {
			System.out.println(result);

		} else {
			System.out.println("-1");

		}
	}

	/*
	 * i made this to overlap the issue that java map gave a null default 
	 *  value for the map reference type Integer , and i could'nt create a map with int primitive type so i made the below class :D
	 * */
	public static class HashMapDefaultedValue<K, V> extends HashMap<K, V> {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		protected V defaultValue;

		public HashMapDefaultedValue(V defaultValue) {
			this.defaultValue = defaultValue;
		}

		@Override
		public V get(Object k) {
			return containsKey(k) ? super.get(k) : defaultValue;
		}
	}
}
