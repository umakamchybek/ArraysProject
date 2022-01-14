// Copyright 2020 Techtorial LLC
package Main;

import java.util.Arrays;


public class Main {

	// method 1

	/**
	 * Write a method that will accept an array as parameter
	 * and return maximum value from array.
	 * <p>
	 * for example:
	 * {3,9,55,73,99,2,10} -> return 99
	 *
	 * @param arrays of numbers
	 * @return maximum value from array
	 */
	public int maxNum(int[] arrays) {
		int biggest = arrays[0];
		for (int i = 1; i < arrays.length; i++) {

			if (arrays[i] > biggest) {
				biggest = arrays[i];
			}
		}
		return biggest;
		//***********************************
//		Arrays.sort(arrays);
//		//System.out.println(Arrays.toString(arrays));
//		int biggestNum = arrays[arrays.length-1];
//
//		return biggestNum;

	}
	//method 2

	/**
	 * Write a method that received an integer array and returns the sum of all
	 * odd numbers in the array
	 *
	 * @param array
	 * @return sum of odd numbers in the array
	 */
	public int sumOfOdds(int[] array) {
		// TODO
		int sum = 0;

		for (int a = 0; a < array.length; a++) {
			if (array[a] % 2 != 0) {
				sum += array[a];
			}
		}
		return sum;
	}
	// method 3

	/**
	 * Write a method that takes an array of integers and returns a boolean. Your
	 * method should return true if array contains three consecutive even number
	 * or three consecutive odd numbers. Return false otherwise.
	 * threeAmigos([2, 1, 3, 5]) -> true
	 * threeAmigos([2, 1, 2, 5]) -> false
	 * threeAmigos([2, 4, 2, 5]) -> true
	 */


	public boolean threeAmigos(int[] array) {
		// TODO

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] % 2 != 0 && array[i + 1] % 2 != 0 && array[i + 2] % 2 != 0) {
				return true;
			} else if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i + 2] % 2 == 0) {
				return true;
			}
		}

		return false;
	}

	// method 4

	/**
	 * Write a method that takes an array of ints and returns a boolean.
	 * Return true if that array contains two numbers anywhere in the array
	 * whose sum is 100
	 *
	 * @param nums
	 * @return boolean
	 */
	public boolean make100With2(int[] nums) {
		// TODO

		for (int i = 0; i < nums.length - 1; i++) {
			for (int k = i + 1; k < nums.length; k++) {

				if (nums[i] + nums[k] == 100) {
					return true;
				}
			}

		}

		return false;
	}
	//method 5


	/**
	 * Write a method switchPairs that switches the order of values in an Array of Strings in a pairwise fashion.
	 * Your method should switch the order of the first two values,
	 * then switch the order of the next two, switch the order of the next two, and so on.
	 * <p>
	 * {"four", "score", "and", "seven", "years", "ago"}-> return {"score", "four", "seven", "and", "ago", "years"}
	 * {"to", "be", "or", "not", "to", "be", "hamlet"} -> return {"be", "to", "not", "or", "be", "to", "hamlet"}
	 * <p>
	 * Method that is using String[]
	 *
	 * @param Array
	 * @return switched pairs array
	 */
	public String[] switchPairs(String[] list) {
		//TODO
//		String str[] = new String[list.length];
//		if (list.length%2 == 0 ){
//			for (int i = 0, s = 1 ; s<list.length; i+=2, s+=2 ){
//				str[i] = list[s];
//				str[s] = list[i];
//			}
//		}else if (list.length%2 != 0 && list.length > 1) {
//			for (int i = 0, s = 1 ; s<list.length-1; i+=2, s+=2 ){
//				str[i] = list[s];
//				str[s] = list[i];
//				str[str.length-1] = list[list.length-1];
//			}
//		}else if (list.length == 1){
//			str[0] = list[0];
//		}
//		return str;
		// Index number we used always has to be smaller than length
		for (int i = 0;i+1<list.length; i+=2) {
			//	list[i+1]&&list[i]
			// list[i+1] has to become list[i]
			// list[i] has to become list[i+1]
			String temp = list[i];
			// temp has the value of i
			list[i] = list[i+1];
			// on line 87 list[i] and list[i+1] has the same value
			list[i+1] =temp;
		}
		return list;


	}




	//method 6

	/**
	 * @param array of book pages
	 * @return page that is out of order; if all pages in the order return -1;
	 * <p>
	 * For example you given an array
	 * int[]pages={20,100,55,78,44,90}; -> method will return 55
	 * int[]pages2={20,21,22,78,44,90};-> method will return 44
	 * int[]pages3={20,21,22,78,84,90};-> method will return -1
	 */
	public int outOfOrder(int[] arr) {
		//TODO
		for(int a = 0;a+1< arr.length;a++){
			if(arr[a]>arr[a+1]){
				return arr[a+1];
			}
		}
		return -1;
	}
	//method 7

	/**
	 * Write a method that takes an array of integers and returns a boolean.
	 * Return true if the array contains 1 and 2 later somewhere in the array,
	 * and 1 has to come before 2.
	 * <p>
	 * contains12([1, 3, 2]) -> true
	 * contains12([3, 1, 2]) -> true
	 * contains12([3, 1, 4, 5, 2]) -> true
	 * contains12([3, 2, 4, 5, 1]) -> false
	 *
	 * @param nums
	 * @return boolean
	 */

	public boolean contains12(int[] nums) {
		// TODO

		for(int a = 0;a< nums.length;a++) {

			if (nums[a] == 1) {
				for (int b = a+1; b < nums.length; b++) {
					if (nums[b] == 2) {
						return true;
					}
				}
			}
		}

		return false;
	}
	//method 8

	/**
	 * Write a method that will accept array of integers as parameter
	 * and will return one long number of combined numbers.
	 * If the number is negative accept it as positive
	 * <p>
	 * For example:
	 * {2,66,3,90,1,-10} -> return int 266390110
	 * {0,34,5,3,8} -> return int 34538
	 *
	 * @param array of numbers
	 * @return combined numbers of array
	 */
	public long combineNumbers(int[] numbers) {
		//TODO
		int sum = 0;
		int negative = -1;//2   66  ==266  //2*100=200+66=266    2 5 =25 =2*10+5

		for (int a = 0; a < numbers.length; a++) {
			if (numbers[a] > 9) {
				sum = sum * 100 + numbers[a];
			} else if (numbers[a] < 9 && numbers[a] > 0) {
				sum = sum * 10 + numbers[a];
			} else if (numbers[a] < 0) {
				sum = sum * 10 + (numbers[a] * negative);

			}
		}
		return sum;
	}
	//method 9

	/**
	 * Write a method that will accept one array as parameter and will remove duplicates
	 * and return will have unique numbers inside
	 * <p>
	 * for example:
	 * {3,6,8,3,2,7,9,9} -> return {3,6,8,2,7,9}
	 * {-1,5,8,-1,-55,55,0} -> return {-1,5,8,-55,55,0}
	 *
	 * @param array of numbers
	 * @return array of unique numbers
	 * we should keep the first  number then we should delete the second one
	 * when i return there is length differences between the arrays
	 */
	public int[] removeDuplicates(int[] nums) {
		//TODO

		int end = nums.length;
		for (int i = 0; i < end; i++) {
			for (int j = i + 1; j < end; j++) {
				if (nums[i] == nums[j]) {
					int shiftLeft = j;
					for (int k = j + 1; k < end; k++, shiftLeft++) {
						nums[shiftLeft] = nums[k];
					}
					end--;
					j--;
				}
			}
		}

		int[] whitelist = new int[end];
		for (int i = 0; i < end; i++) {
			whitelist[i] = nums[i];
		}
		return whitelist;
	}

}
