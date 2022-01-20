/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author Nguyen Duc Anh
 */
public class SumAverageRunningInt {
    public static void main(String[] args) {
		int firstnum, lastnum, sum = 0;
		double average;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so dau tien cua day: ");
		firstnum = sc.nextInt();
		System.out.println("Nhap so cuoi cung cua day: ");
		lastnum = sc.nextInt();
		for (int i = firstnum; i <= lastnum; ++i) {
			sum += i;
		}
		average = sum / lastnum;
		System.out.println("Average = " + average);
	}
}
