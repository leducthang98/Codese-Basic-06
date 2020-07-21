/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson02;

import java.util.Scanner;

/**
 *
 * @author Wind
 */
public class Lesson02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int input;
//        System.out.println("Nhap vao mot so: ");
//        input = sc.nextInt();
//        for (int i = 1; i <= input; i++) {
//            if (i == 1) {
//                if (input % i == 0) {
//                    System.out.print(i);
//                }
//            } else {
//                if (i == input - 1) {
//                    System.out.print(", " + i + ".");
//                } else {
//                    System.out.print(", " + i);
//                }
//            }
//        }
//       
//        int random = (int) (Math.random() * 10); // 0 < ran < 1
//        System.out.println(random);
//        System.out.println("sqrt:" + Math.sqrt(1));
//        int numA = 1;
//        int numB = 2;
//
//        int[] array = new int[10];
//        int i;
//        for (i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        // LuyenGiaiThuat => UpperCamelCase
        // numA => LowerCamelCase
        // goToSchool() 
        // const = LE_DUC_THANG
//        int i = 0;
//        while (i < 10) {
//            System.out.print(i + " ");
//            i++;
//        }
//        do {
//            System.out.println(i);
//            i++;
//        } while (i > 10);
//        int a = 2;
//        int b = 3;
//        switch (a) {
//            case 1:
//                System.out.println("MOT");
//                break;
//            case 2:
//                System.out.println("HAI");
//                break;
//            default:
//                System.out.println("KHONG BIET");
//        }
//        String[] arrString = new String[10];
        // B1: Yeu cau nguoi dung nhap vao 1 so nguyen duong n
        // B2: Tao ra 1 mang int co do dai = so nguyen duong nguoi dung nhap
        // B3: Yeu cau nguoi dung nhap vao n lan so tu nhien
        // B4: In ra: 
        // tat ca cac phan tu cua mang 
        // tong cac phan tu trong mang do
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap vao phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
            sum += arr[i]; // <=> sum = sum + arr[i]
        }
        System.out.println("Tong:" + sum);

    }
}
