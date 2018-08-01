package com.padtast.algorithm_project;

import org.junit.Test;

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

        SelectSort.selectSorts(a);

        System.out.println("\n");
        System.out.println("排序后：");
        for (int i = 0; i < a.length; ++ i){
            System.out.print(a[i] + " ");
        }
    }
}