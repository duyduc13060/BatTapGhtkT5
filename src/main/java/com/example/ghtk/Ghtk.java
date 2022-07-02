package com.example.ghtk;

import java.util.*;

public class Ghtk {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Cho 2 danh sách chứa các số có thể duplicate. Viết chương trình lấy ra 1
        // danh sách duy nhất chứa tất cả các số đấy, không chứa phần tử duplicate
        // và danh sách kq được sắp xếp theo thứ tự từ bé đến lớn
        //      kg =  1,2,3,4,5,6,7,8,9,10,11

        Integer a[] = null;
        Integer b[] = null ;

        System.out.println("nhap phan tu a");
        a = nhap(a);

        System.out.println("nhap phan tu b");
        b = nhap(b);

        List<Integer> list = Arrays.asList(a);
        List<Integer> list1 = Arrays.asList(b);

        SortedSet<Integer> set = new TreeSet<>();
        set.addAll(list);
        set.addAll(list1);

        System.out.println(set);
    }


    public  static Integer[] nhap(Integer[] arr){
        System.out.println("Nhap so phan tu mang: ");
        int n = sc.nextInt();

        arr = new Integer[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ",i);
            arr[i] = sc.nextInt();
        }
        return arr;
    }

}
