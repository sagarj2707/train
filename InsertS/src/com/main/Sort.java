package com.main;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		int[] array1 = { 79, 98, 97, 7, 4, 88, 45 };

		int key, i;
		for (int j = 1; j < array1.length; j++) {
			key = array1[j];
			i = j - 1;
			while (i >= 0 && array1[i] > key) {
				array1[i + 1] = array1[i];
				i = i - 1;
				System.out.println("while executed " + i);
			}
			System.out.println("b4 " + Arrays.toString(array1));
			array1[i + 1] = key;
			System.out.println("atr " + Arrays.toString(array1));

		}

		// System.out.println(Arrays.toString(array1));
	}
}
