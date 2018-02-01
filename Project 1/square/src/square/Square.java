/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package square;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Square {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        double a, b, c, x1, x2;
//        
//        a = 4;
//        b = 1;
//        c = -3;

        double x, x1, x2, d, dSqrt;
        
        System.out.println("Введите значение a: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        
        System.out.println("Введите значение b: ");
        double b = sc.nextInt();
        
        System.out.println("Введите значение c: ");
        double c = sc.nextInt();
        
        if (a!=0.0) {
            
        d = b * b - 4 * a * c;
        dSqrt = Math.sqrt(d);
        
        if (d > 0) {
            x1 = (-b + dSqrt) / (2 * a);
            x2 = (-b - dSqrt) / (2 * a);
            System.out.println("Корни квадратного уравнения: ");
            System.out.println(x1);
            System.out.println(x2);
        }
        
        else if (d==0) {
            x = -b / 2 * a;
            System.out.println("Корень квадратного уравнения: ");
            System.out.println(x);
        }
        
        else if (d < 0) {
            System.out.println("Вещественных корней нет");
        }
        
        }
        
        else {
            System.out.println("Уравнение не является квадратным");
        }
    }
    
}
