package sort;

/**
 * The evenOddSort method takes an array of integers and partitions it so that
 * all the even integers in the array precede all the odd integers in the array.
 * 
 * The algorithm operates in-place and it has O(n) time complexity.
 * 
 * @author Dusan Eremic
 *
 */
public class EvenOdd {

	public static void main(String[] args) {
		int[] input = { 2, 4, 1, 6, 4, 7, 1, 3, 5 };
		new EvenOdd().evenOddSort(input);
		for (int i : input) {
			System.out.print(i + ", ");
		}
	}

	public void evenOddSort(final int[] ints) {

		for (int left = 0, right = ints.length - 1; left < right; left++, right--) {

			// find first odd number from the left
			while ((ints[left] & 1) == 0 && left < right) {
				left++;
			}

			// find first even number from the right
			while ((ints[right] & 1) == 1 && right > left) {
				right--;
			}

			// swap
			if (left < right) {
				final int temp = ints[left];
				ints[left] = ints[right];
				ints[right] = temp;
			}
		}
	}

}