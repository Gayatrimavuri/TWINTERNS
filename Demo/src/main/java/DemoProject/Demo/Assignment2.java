package DemoProject.Demo;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] n = new int[10];
        for (int i = 0; i < 10;i++) {
            n[i] = sc.nextInt();
        }
        countNumbers(n);
    }
    public static void countNumbers(int[] a) {
        String str = "";
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    a = deleteIndex(a, j);
                    j--;
                    count++;
                }
            }
            str += count + " ";
        }
        String[] countString = str.split(" ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "-" + countString[i]);
        }
    }
    private static int[] deleteIndex(int a[], int index) {
        if (a == null || index > a.length || index < 0) {
            return a;
        }
        int[] b = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == index) {
                continue;
            }
            b[j++] = a[i];
        }
        return b;
    }
}
