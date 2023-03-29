package baitap2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size");
        int size = Integer.parseInt(scanner.nextLine());
        int list[]= new int[size];
        for (int i = 0; i < size; i++) {
            list[i]=new Random().nextInt(20);
        }
        System.out.println("mang truoc khi sap xep"+ Arrays.toString(list));
        for (int i = 1; i < size; i++) {
            int temp=list[i];
            int j;
            for (j = i-1; j >= 0&&list[j]>temp; j--) {
                list[j + 1] = list[j];
            }
            list[j+1]=temp;

        }
        System.out.println("sau khi sap xep"+Arrays.toString(list));
    }
}