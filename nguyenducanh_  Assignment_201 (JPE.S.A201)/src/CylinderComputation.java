
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
public class CylinderComputation {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double radius, height, surfaceArea, baseArea,Volume;
		System.out.println("Nhap ban kinh hinh tru:");
		radius = sc.nextDouble();
		System.out.println("Nhap so cieu cao hinh tru:");
		height = sc.nextDouble();
		surfaceArea = 2*Math.PI*radius*height + 2*Math.PI*radius*radius;
		System.out.println("Surface area = " + surfaceArea);
		baseArea = Math.PI*radius*radius;
		System.out.println("Base area = " + baseArea);
		Volume = Math.PI * radius * radius * height;
		System.out.println("Volume = " + Volume);
	}
}
