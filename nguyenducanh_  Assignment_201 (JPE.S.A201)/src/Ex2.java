
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nguyen Duc Anh
 */
public class Ex2 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, num4;
		System.out.println("Nhap so thu nhat:");
		num1 = sc.nextInt();
		System.out.println("Nhap so thu hai:");
		num2 = sc.nextInt();
		System.out.println("Nhap so thu ba:");
		num3 = sc.nextInt();
		System.out.println("Nhap so thu tu:");
		num4 = sc.nextInt();
		if (num1 == num2 && num2 == num3 && num3 == num4) {
			System.out.println(" "+num1+" = "+ num2 + " = "+num3+" = "+num4);
		}
		else System.out.println("Numbers are not equal!!!");
	}
}
