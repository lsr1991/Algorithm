package me.lsr.algorithm.basic.sort;

import java.util.List;

public class QuickSort {

	/**
	 * quicksort for a part of an integer arraylist
	 * 
	 * @param A
	 *            arraylist to sort
	 * @param p
	 *            begin index of the part to sort
	 * @param r
	 *            end index of the part to sort
	 */
	public static void quickSort(List<Integer> A, int p, int r) {
		if (p < r) {
			int x = partition(A, p, r);
			quickSort(A, p, x - 1);
			quickSort(A, x + 1, r);
		}
	}
	
	/**
	 * partition the sorted part to two smaller parts, A[p...x-1] and A[x+1...r]
	 * @param A
	 * @param p
	 * @param r
	 * @return
	 */
	private static int partition(List<Integer> A, int p, int r) {
		int x = p;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
