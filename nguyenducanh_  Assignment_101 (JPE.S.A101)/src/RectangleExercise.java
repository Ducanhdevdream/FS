
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
public class RectangleExercise {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double Width, Height, S, D;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong HCN: ");
        Width = sc.nextDouble();
        System.out.println("Nhap chieu dai HCN: ");
        Height = sc.nextDouble();
        D = (Width + Height) * 2;
        S = Width * Height;
        System.out.println(" Area is " + Width + " * " + Height + " = " + D);
        System.out.println(" Perimeter is 2*(" + Width + " + " + Height + ") = " + S);
    }
}
