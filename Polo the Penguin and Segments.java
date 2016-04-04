import java.util.Scanner;

public class PolothePenguinand_Segments {

	public static int valueOfSetN = 0;
	public static int k, n, currentSegmentStart, currentSegmentEnd;
	private static Scanner in;

	public static void calculateValueOfSetN(int segmentStart, int segmentEnd) {
		int diff = segmentEnd - segmentStart;
		if (diff == 0)
			valueOfSetN++;
		else if (diff == 1)
			valueOfSetN += 2;
		else
			valueOfSetN += diff + 1;

	}

	public static int enhanceTheSetValue() {
		if(valueOfSetN-k<0)
			return (k-valueOfSetN);
		else 
			return k-(valueOfSetN%k);
	}

	public static void main(String[] args) {

		in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		for (int i = 0; i < n; i++) {
			currentSegmentStart = in.nextInt();
			currentSegmentEnd = in.nextInt();
			calculateValueOfSetN(currentSegmentStart, currentSegmentEnd);
		}
		if (valueOfSetN % k == 0)
			System.out.println("0");
		else {
			int result = enhanceTheSetValue();
			System.out.println(result);
		}

	}
}
