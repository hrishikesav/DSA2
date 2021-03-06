package com.hrishi.problems.strings;

public class LongestCommonSubSequence {

	public static void main(String[] args) {

		String one = "abcdaf";
		String two = "acbcf";

		logComSubSeq(one, two);

	}

	static void logComSubSeq(String one, String two) {
		int[][] array = new int[two.length()][one.length()];

		for (int i = 0; i < one.length(); i++) {
			for (int j = 0; j < two.length(); j++) {
				if (one.charAt(i) == two.charAt(j)) {

					if (i - 1 >= 0 && j - 1 >= 0) {
						array[j][i] = array[j - 1][i - 1] + 1;
					} else {
						array[j][i] = 1;
					}
				} else {

					int jth = 0;
					if (j - 1 >= 0) {
						jth = array[j - 1][i];
					}

					int ith = 0;
					if (i - 1 >= 0) {
						ith = array[j][i - 1];
					}

					int val = Integer.max(jth, ith);
					array[j][i] = val;
				}
			}
		}

		printArray(array, one);

	}

	static void printArray(int[][] array, String one) {
		int maxSeq = Integer.MIN_VALUE;
		int iPos = -1;
		int jPos = -1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] > maxSeq) {
					maxSeq = array[i][j];
					iPos = i;
					jPos = j;
				}
//				System.out.print(array[i][j] + " ");
			}
//			System.out.println();
		}

		System.out.println("Length of max sequence=" + maxSeq);
		
		char[] chArray = new char[maxSeq];

		int count = maxSeq - 1;
		int val = array[iPos][jPos];
		while (count >= 0) {
			char temp = one.charAt(jPos);
			

			if (iPos > 0 && array[iPos - 1][jPos] == val) {
				iPos--;
			} else if (jPos > 0 && array[iPos][jPos - 1] == val) {
				jPos--;
			} else {
				iPos--;
				jPos--;
				chArray[count] = temp;
				count--;
			}
			
			if(iPos > -1 && jPos > -1) {
				val = array[iPos][jPos];
			}
			
		}
		
		System.out.print("Sequence is: ");
		for (char c : chArray) {
			System.out.print(c + " ");
		}
	}

}
