package com.qiheng.junit;

public class Array1 {
	public int getLargest(int[] array) throws Exception {
		if (array == null || array.length == 0) {
			throw new Exception("Could not be null");
		} else {
			int max = 0;
			for (int i = 0; i < array.length; i++) {
				if (array[i] > max) {
					max = array[i];
				}
			}
			return max;

		}
	}
}
