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
    @Test
    public void addition_issCorrects() {
        System.out.println(ArrayClass.compare(2,2.00));


    }
    @Test
    public void MaxIMum(){
        int[] a = {40,-1,-2, -1, -4, -3, 2, -5, -3, -9};
        System.out.println("第一种暴力方法：" + MaximumSubsequenceAndProblem.maxSubSum1(a));
        System.out.println("第二种暴力改进方法：" + MaximumSubsequenceAndProblem.maxSubSum2(a));
        System.out.println("第三种分治策略方法：" + MaximumSubsequenceAndProblem.maxSubSum3(a));
        System.out.println("第四种线性方法：" + MaximumSubsequenceAndProblem.maxSubSum4(a));
        System.out.println("第五种动态规划方法：" + MaximumSubsequenceAndProblem.maxSubSum5(a));
    }
}