import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    String[] list = {"Sort", "Check palindrome", "Check sorted", "Count primes", "Get median", "Minimum 3 numbers",
            "Distinct array", "Most repeated value", "Return only primes", "Find largest prime", "Shuffle",
            "Reverse array", "Shift array", "Find smallest prime", "Get average", "Maximum 3 numbers",
            "Zero if less than zero", "Execute ALL", "EXIT",};

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

        while (true) {
            System.out.println("Enter your choice :");
            for (int i = 0; i < list.length; i++) {
                System.out.println((i + 1) + "- " + list[i]);
            }
            int choice = in.nextInt();
            if (choice == 19) {
                System.out.println("You have exited the program");
                break;
            }
            operation(arr, choice);

        }
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
                System.out.println(hold);
                break;
            case 2:
                System.out.println(isPalindrome(hold));
                break;
            case 3:
                checkSorted(hold);
                break;
            case 4:
                System.out.println(countPrimes(hold));
                break;
            case 5:
                System.out.println(getMedian(hold));
                break;
            case 6:
                System.out.println(getMinimum3Numbers(hold));
                break;
            case 7:
                System.out.println(DistinctArray(hold));
                break;
            case 8:
                System.out.println(mostRepeatedValue(hold));
                break;
            case 9:
                System.out.println(returnOnlyPrimes(hold));
                break;
            case 10:
                System.out.println(findLargestPrime(hold));
                break;
            case 11:
                shuffle(hold);
                System.out.println(hold);
                break;
            case 12:
                reverseArray(hold);
                System.out.println(hold);
                break;
            case 13:
                shiftArray(hold);
                System.out.println(hold);
                break;
            case 14:
                System.out.println(findSmallestPrime(hold));
                break;
            case 15:
                System.out.println(getAverage(hold));
                break;
            case 16:
                System.out.println(getMaximum3Numbers(hold));
                break;
            case 17:
                zeroIfLessThanZero(hold);
                System.out.println(hold);
                break;
            case 18:
                executeAll(hold);
                break;
                
            case 19:if(largeprime (hold)!=-1)
        		{System.out.println("get large prime  :"+ 	largeprime (hold));}
        	
    		else 
    			{System.out.println("Numbers you entered are not included prime nums");}
                
                
                break;
            case 20:
                return;
        }
    }

    void executeAll(ArrayList<Integer> arr) {
        for (int i = 1; i <= 17; ++i) {
            operation(arr, i);
        }
    }

    boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
    }

    void reverseArray(ArrayList<Integer> parameter) {
        ArrayList<Integer> reversed = new ArrayList<>();
        for (int j = parameter.size() - 1; j >= 0; j--) {
            int num = parameter.get(j);
            reversed.add(num);
        }
        for (int i = 0; i < parameter.size(); ++i) {
            parameter.set(i, reversed.get(i));
        }
    }

    boolean isPalindrome(ArrayList<Integer> arr) {
        boolean palindrome = true;
        int length = arr.size();
        int x = length / 2;
        if (length > 0) {
            for (int i = 0; i < x; i++) {
                if (arr.get(i) != arr.get(length - 1 - i))
                    palindrome = false;
            }
        }
        return palindrome;
    }

    void zeroIfLessThanZero(ArrayList<Integer> parameter) {
        for (int i = 0; i < parameter.size(); ++i) {
            if (parameter.get(i) < 0)
                parameter.set(i, 0);
        }
    }

    //20160146
    ArrayList<Integer> DistinctArray(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> Result = new ArrayList<>();
        boolean Notprint = false;
        for (int i = 0; i < n; i++) {
            int j;
            if (i == 0) {
                Result.add(arr.get(i));
            }
            for (j = 0; j < i; j++) {
                if (arr.get(i) == arr.get(j))
                    break;
                if (j + 1 == i)
                    Notprint = true;
            }
            if (Notprint == true) {
                Result.add(arr.get(i));
            }
            Notprint = false;
        }
        return Result;
    }

    double getMedian(ArrayList<Integer> parameter) {
        return 0;
    }

    void shuffle(ArrayList<Integer> parameter) {
        int len = parameter.size();
        for (int i = 0; i < len; i++) {
            int index = (int) (Math.random() * len);
            int tem = parameter.get(i);
            parameter.set(i, parameter.get(index));
            parameter.set(index, tem);

        }
    }

    //20160149
    int mostRepeatedValue(ArrayList<Integer> arr) {
        int menual = 0;
        int counter = 0;
        int tmpCount = 0;

        for (int i = 0; i < arr.size(); i++) {
            int temp = arr.get(i);
            counter = 0;
            for (int j = 0; j < arr.size(); j++) {
                if (temp == arr.get(j)) {
                    counter++;
                }
            }
            if (counter > tmpCount) {
                menual = temp;
                tmpCount = counter;
            }
        }
        return menual;
    }

    boolean checkSorted(ArrayList<Integer> parameter) {
        ArrayList<Integer> tmp = copy(parameter);
        sort(tmp);
        for (int i = 0; i < parameter.size(); ++i) {
            if (parameter.get(i) != tmp.get(i))
                return false;
        }
        return true;
    }

    ArrayList<Integer> shiftArray(ArrayList<Integer> parameter) {
        return null;
    }

    ArrayList<Integer> getMinimum3Numbers(ArrayList<Integer> parameter) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        sort(parameter);
        for (int i = 0; i < Math.min(parameter.size(), 3); ++i) {
            ret.add(parameter.get(i));
        }
        return ret;
    }

    //return the largest prime, if there is no prime return -1
    int findLargestPrime(ArrayList<Integer> parameter) {
        return -1;
    }

    //return the smallest prime, if there is no prime return -1
    int findSmallestPrime(ArrayList<Integer> parameter) {
        sort(parameter);
        for (int i = 0; i < parameter.size(); ++i) {
            if (isPrime(parameter.get(i))) {
                return parameter.get(i);
            }
        }
        return -1;
    }

    int countPrimes(ArrayList<Integer> parameter) {
        int ret = 0;
        for (int i = 0; i < parameter.size(); ++i) {
            if (isPrime(parameter.get(i)))
                ++ret;
        }
        return ret;
    }

    ArrayList<Integer> returnOnlyPrimes(ArrayList<Integer> parameter) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < parameter.size(); ++i) {
            if (isPrime(parameter.get(i))) {
                ret.add(parameter.get(i));
            }
        }
        return ret;
    }

    double getAverage(ArrayList<Integer> parameter) {
        double ret = 0;
        for (int i = 0; i < parameter.size(); ++i) {
            ret += parameter.get(i);
        }
        ret /= parameter.size();
        return ret;
    }

    //20160299
    ArrayList<Integer> getMaximum3Numbers(ArrayList<Integer> parameter) {
        ArrayList<Integer> ret = new ArrayList<>();
        sort(parameter);
        reverseArray(parameter);
        for (int i = 0; i < Math.min(parameter.size(), 3); ++i) {
            ret.add(parameter.get(i));
        }
        return ret;
    }
    
    //20160099
    public static int largeprime (ArrayList<Integer> array)

    { ArrayList<Integer> sorted_arr= new ArrayList<>();
    //loop through the numbers one by one
    for (int i = 0; i < array.size(); i++) {
        boolean isPrime = true;
        if (array.get(i) == 1)
            isPrime = false;
        
        else {
            // check to see if the numbers are prime
            for (int j = 2; j <= array.get(i) / 2; j++) 
              {
                if (array.get(i) % j == 0) 
                {
                    isPrime = false;
                    break;
                }
              }
           }
    	        if(isPrime)
                 sorted_arr.add(array.get(i));
    	           
    	                                   }//end of first for loop
    	sorted_arr.sort(null); 
    	
    	if(sorted_arr.isEmpty())
    	{return -1;}
    	
    	else
    	{return sorted_arr.get(sorted_arr.size()-1);}
    		
    }//end of large prime function

}
