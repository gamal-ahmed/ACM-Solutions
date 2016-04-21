import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach {
	
	public static long vasyaScore = 0, petyaScore = 0;
	public static int m, elements, currentQuery;

	public static HashMap<Integer, Integer> inputElements;
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		elements = in.nextInt();
		inputElements = new HashMap<>(elements);
		for (int i = 0; i < elements; i++) {
			inputElements.put(in.nextInt(), i);
		}
		m = in.nextInt();
		for (int i = 0; i < m; i++) {
			currentQuery = in.nextInt();
			int elementIndex = inputElements.get(currentQuery);
			elementIndex += 1;
			vasyaScore += elementIndex;
			petyaScore += inputElements.size() - elementIndex + 1;

		}
		System.out.println(vasyaScore + " " + petyaScore);

	}

}
