package com.padtast.algorithm_project;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        int a[] = {1, 2, 3, 56, 45, 22, 22, 26, 89, 99, 100};

        System.out.println("排序前：");
        for (int i = 0; i < a.length; ++ i){
            System.out.print(a[i] + " ");
        }

        BubbleSort.bubbleSort(a);

        System.out.println("\n");
        System.out.println("排序后：");
        for (int i = 0; i < a.length; ++ i){
            System.out.print(a[i] + " ");
        }
    }
    @Test
    public void addition_isCorrects() {
        int a[] = {2, 4, 7, 18, 25, 34, 56, 68, 89};
        System.out.println("打印原始数据：");
        for (int i = 0; i < a.length; ++ i){
            System.out.print(a[i] + " ");
        }


        int pos = 0;
        pos = binaryFind.binaryFind(a, 5);
        if (-1 != pos)
            System.out.println("所查整数在数组中的位置下标是：" + pos);
        else
            System.out.println("没找到待查数据!");

    }
}