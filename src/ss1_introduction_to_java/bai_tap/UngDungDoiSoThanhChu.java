package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDoiSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số bất kì: ");
        int nhapSo = Integer.parseInt(scanner.nextLine());
        int donVi = nhapSo/10;
        int chuc = nhapSo%10;
        int tram = nhapSo/100;
        int donViCuaTram=(nhapSo%100)%10;
        int chucCuaTram=(nhapSo%100)/10;
        if (nhapSo==0){
            System.out.println("Zero");
        } else if (nhapSo < 10 && nhapSo >= 0) {
            System.out.println(lessTen(nhapSo));
        } else if (nhapSo<20) {
            System.out.println(lessTwenty(chuc));
        } else if (nhapSo<100) {
            System.out.println(lessOneHundred(donVi)+"-"+lessTen(chuc));
        }else if (nhapSo<1000){
            if (chucCuaTram==0) {
                System.out.println(lessTen(tram) + " Hundered and " + lessTen(donViCuaTram));
            } else if (donViCuaTram==0){
                System.out.println(lessTen(tram) + " Hundered " + lessOneHundred(chucCuaTram));
            }else {
                System.out.println(lessTen(tram)+" Hundered "+ lessOneHundred(chucCuaTram)+" "+lessTen(donViCuaTram));
            }
        }else {
            System.out.println("Nhập lại!");
        }
    }

    public static String lessTen(int number) {
        String lessTen = "";
        switch (number) {
            case 1:
                lessTen = "One";
                break;
            case 2:
                lessTen = "Two";
                break;
            case 3:
                lessTen = "Three";
                break;
            case 4:
                lessTen = "Four";
                break;
            case 5:
                lessTen = "Five";
                break;
            case 6:
                lessTen = "Six";
                break;
            case 7:
                lessTen = "Seven";
                break;
            case 8:
                lessTen = "Eigh";
                break;
            case 9:
                lessTen = "Nine";
                break;
        }
        return lessTen;
    }

    public static String lessTwenty(int number) {
        String lessTwenty = "";
        switch (number) {
            case 1:
                lessTwenty = "Eleven";
                break;
            case 2:
                lessTwenty = "Twelve";
                break;
            case 3:
                lessTwenty = "Thirteen";
                break;
            case 4:
                lessTwenty = "Fourteen";
                break;
            case 5:
                lessTwenty = "Fifteen";
                break;
            case 6:
                lessTwenty = "Sixteen";
                break;
            case 7:
                lessTwenty = "Seventeen";
                break;
            case 8:
                lessTwenty = "Eighteen";
                break;
            case 9:
                lessTwenty = "Nineteen";
                break;
        }
        return lessTwenty;
    }
    public static String lessOneHundred(int number){
        String less100="";
        switch (number){
            case 1:
                less100="Ten";
                break;
            case 2:
                less100 ="Twenty";
                break;
            case 3:
                less100 ="Thirty";
                break;
            case 4:
                less100 ="Fourty";
                break;
            case 5:
                less100 ="Fifty";
                break;
            case 6:
                less100 ="Sixty";
                break;
            case 7:
                less100 ="Seventy";
                break;
            case 8:
                less100 ="Eighty";
                break;
            case 9:
                less100 ="Ninety";
                break;
        }
        return less100;
    }
}