package giai_thuat;

import java.util.Scanner;

public class VeHinhThoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kích thước của hình thoi ");
        int height = input.nextInt();
        if (height%2==1){
            height+=1;
        }
        int n=height;
        int a = n/2;
        int b = n/2;
        int x = 0;
        for (int i = 0; i < n-1; i++) {
            if (i<(height/2)){
                a--;
                b++;
                x++;
            }else {
                a++;
                b--;
                x--;
            }
            for (int j = 0; j < n+1; j++) {
                if (j == a || j == b) {
                    System.out.print(x);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}