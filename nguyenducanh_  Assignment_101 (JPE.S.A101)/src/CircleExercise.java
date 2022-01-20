
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
public class CircleExercise {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ban kinh hinh tron: ");
		Radius = sc.nextDouble();
		System.out.println(Radius * 2 * Math.PI);
		System.out.println(Radius * Radius * Math.PI);
	}
}
