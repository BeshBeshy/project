import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner in = new Scanner(System.in);
	String[] list = { "Sort", "Check palindrome", "Check sorted", "Count primes", "Get median", "Minimum 3 numbers",
			"Distinct array", "Most repeated value", "Return only primes", "Find largest prime", "Shuffle",
			"Reverse array", "Shift array", "Find smallest prime", "Get average", "Maximum 3 numbers",
			"Zero if less than zero", "ALL", "EXIT", };

	public static void main(String[] args) {
		Main m = new Main();
		ArrayList<Integer> inputArray;
		inputArray = m.read();
		m.start(inputArray);
	}

	ArrayList<Integer> read() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		System.out.println("Enter The Array : ");
		String line = in.nextLine();
		String[] nums = line.split(" ");
		for(int i = 0; i < nums.length; ++i)
		{
			input.add(Integer.parseInt(nums[i]));
		}
		return input;
	}

	void start(ArrayList<Integer> arr) {

		System.out.println("Enter your choice :");
		for (int i = 0; i < list.length; i++) {
			System.out.println((i + 1) + ". " + list[i]);
		}
			int choice = in.nextInt();
			operation(arr, choice);
	}

	public void operation(ArrayList<Integer> hold, int choice) {

		switch (choice) {
		case 1:
			sort(hold);
			break;
		case 2:
			isPalindrome(hold);
			break;
		case 3:
			checkSorted(hold);
		case 4:
			countPrimes(hold);
			break;
		case 5:
			getMedian(hold);
			break;
		case 6:
			getMinimum3Numbers(hold);
			break;
		case 7:
			isDistinctArray(hold);
			break;
		case 8:
			mostRepeatedValue(hold);
			break;
		case 9:
			returnOnlyPrimes(hold);
			break;
		case 10:
			findLargestPrime(hold);
			break;
		case 11:
			shuffle(hold);
			break;
		case 12:
			reverseArray(hold);
			break;
		case 13:
			shiftArray(hold);
			break;
		case 14:
			findSmallestPrime(hold);
			break;
		case 15:
			getAverage(hold);
			break;
		case 16:
			getMaximum3Numbers(hold);
			break;
		case 17:
			zeroIfLessThanZero(hold);
			break;
		case 18:
			doAll(hold);
			break;
		case 19:
			return;
		}

	}
	public void doAll(ArrayList<Integer> arr) 
	{
		for(int i = 1; i <= 17; ++i)
		{
			operation(arr, i);
		}
	}

	boolean isPalindrome(ArrayList<Integer> parameter) {
		return true;
	}

	ArrayList<Integer> zeroIfLessThanZero(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = null;
		return returnValue;
	}

	boolean isDistinctArray(ArrayList<Integer> parameter) {
		return true;
	}

	ArrayList<Integer> returnOnlyPrimes(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = null;
		return returnValue;
	}

	int findSmallestPrime(ArrayList<Integer> parameter) {
		return 0;
	}

	int getMedian(ArrayList<Integer> parameter) {
		return 0;
	}

	ArrayList<Integer> shuffle(ArrayList<Integer> parameter) {
		ArrayList<Integer> shuff = null;
		return shuff;
	}

	int mostRepeatedValue(ArrayList<Integer> parameter) {
		return 0;
	}

	ArrayList<Integer> reverseArray(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = null;
		return returnValue;
	}

	boolean checkSorted(ArrayList<Integer> parameter) {
		return true;
	}

	ArrayList<Integer> shiftArray(ArrayList<Integer> parameter) {
		return null;
	}

	ArrayList<Integer> getMinimum3Numbers(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = null;
		return returnValue;
	}

	ArrayList<Integer> findLargestPrime(ArrayList<Integer> parameter) {
		return null;
	}

	void sort(ArrayList<Integer> arr) {
		for(int i = 1; i < arr.size(); ++i)
		{
			Integer temp = arr.get(i);
			int j = i;
			for(; j > 0 && temp < arr.get(j - 1); --j)
				arr.set(j, arr.get(j - 1));
			arr.set( j, temp);
		}
		System.out.println("The sorted array :");
		System.out.println(arr);
		System.out.println();
	}

	int countPrimes(ArrayList<Integer> parameter) {
		return 0;
	}

	double getAverage(ArrayList<Integer> parameter) {
		return 0;
	}

	ArrayList<Integer> getMaximum3Numbers(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = null;
		return returnValue;
	}
}
