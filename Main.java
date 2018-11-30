import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	String[] list = { "Sort", "Check palindrome", "Check sorted", "Count primes", "Get median", "Minimum 3 numbers",
			"Distinct array", "Most repeated value", "Return only primes", "Find largest prime", "Shuffle",
			"Reverse array", "Shift array", "Find smallest prime", "Get average", "Maximum 3 numbers",
			"Zero if less than zero", "ALL", "EXIT", };

	public static void main(String[] args) {
		Main m = new Main();
		ArrayList<Integer> inputArray;
		// the input is sepatared by spaces
		inputArray = m.read();
		m.start(inputArray);
	}

	ArrayList<Integer> read() {
		ArrayList<Integer> input = new ArrayList<Integer>();
		System.out.println("Enter The Array : ");
		String line = in.nextLine();
		String[] nums = line.split(" ");
		for (int i = 0; i < nums.length; ++i) {
			input.add(Integer.parseInt(nums[i]));
		}
		return input;
	}

	void start(ArrayList<Integer> arr) {

		System.out.println("Enter your choice :");
		for (int i = 0; i < list.length; i++) {
			System.out.println((i + 1) + "- " + list[i]);
		}
		int choice = in.nextInt();
		operation(arr, choice);
	}

	ArrayList<Integer> copy(ArrayList<Integer> arr) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < arr.size(); ++i) {
			temp.add(arr.get(i));
		}
		return temp;
	}

	public void operation(ArrayList<Integer> arr, int choice) {

		ArrayList<Integer> hold = copy(arr);
		switch (choice) {
		case 1:
			sort(hold);
			break;
		case 2:
			System.out.println("Enter a String for Palindrome Testing...");
			Scanner scanner=new Scanner(System.in);
			String input=scanner.nextLine();
			ArrayList<String> array=new ArrayList<>();
			array.add(input);
			isPalindrome(array);
			break;
		case 3:
			checkSorted(hold);
			break;
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
			DistinctArray(hold);
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
			
                        System.out.println(reverseArray(hold));
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

	public void doAll(ArrayList<Integer> arr) {
		for (int i = 1; i <= 17; ++i) {
			operation(arr, i);
		}
	}

    public static void isPalindrome(ArrayList<String> array){
        String b=array.get(0);
        char[]arr=b.toCharArray();
        boolean palindrome=true;
        int length = arr.length;
        int x=(length/2);
        if (length>0){
            for(int i=0;i<x;i++)
            {
                if(arr[i]!=arr[length-1-i])
                    palindrome=false;
            }
        }
        if(palindrome==true)
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

	ArrayList<Integer> zeroIfLessThanZero(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = null;
		return returnValue;
	}
    //20160146
	public static ArrayList<Integer> DistinctArray(ArrayList<Integer> arr)
	{
		int n=arr.size();
		ArrayList<Integer> Result=new ArrayList<Integer>();
		boolean Notprint=false;
		for(int i=0;i<n;i++)
		{
			int j;
			if(i==0)
			{
				Result.add(arr.get(i));
			}
			for(j=0; j<i ;j++)
			{
				if(arr.get(i)==arr.get(j))
					break;
				if(j+1==i)
					Notprint=true;
			}
			if(Notprint==true)
			{
				Result.add(arr.get(i));
			}
			Notprint=false;
		}
		ArrayList<Integer> arr2=Result;
		System.out.println(arr2);
		
		return arr2;
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
		int len = parameter.size();
        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * len);
            int tem = parameter.get(i);
            parameter.set(i, parameter.get(index));
            parameter.set(index, tem);

        }
        for (int i = 0; i < len; i++) {
            System.out.print(parameter.get(i) + " ");
        }
		return parameter;
	}

	//20160149
	public int mostRepeatedValue(ArrayList<Integer>arr)
	{
		int menual = 0;
		int counter = 0;
		int tmpCount=0;

		for(int i=0;i<arr.size();i++)
		{
			int temp = arr.get(i);
			counter = 0;
			for(int j=0;j<arr.size();j++)
			{
				if(temp == arr.get(j))
				{
					counter++;
				}
			}
			if(counter > tmpCount)
			{
				menual = temp;
				tmpCount = counter;
			}
		}

		return menual;
	}

	ArrayList<Integer> reverseArray(ArrayList<Integer> parameter) {
		ArrayList<Integer> returnValue = new ArrayList();
                for(int j=parameter.size()-1;j>=0;j--)
                {
                    int num=parameter.get(j);
                    returnValue.add(num);
                }
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

	// 20160154
	void sort(ArrayList<Integer> arr) {
		for (int i = 1; i < arr.size(); ++i) {
			Integer temp = arr.get(i);
			int j = i;
			for (; j > 0 && temp < arr.get(j - 1); --j)
				arr.set(j, arr.get(j - 1));
			arr.set(j, temp);
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
