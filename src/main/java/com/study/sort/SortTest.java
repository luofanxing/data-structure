package com.study.sort;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 *  排序测试
 *
 * @author luofanxing
 * @create 2021-06-10 19:53
 */
public class SortTest {


    @Test
    public  void sort() {
        // 待排序数组
        int[] array = new int[]{3, 2, 7, 5, 4, 8, 6, 5};

        // 冒泡排序
        //SortUtils.bubbleSort(array);

        // 选择排序
        SortUtils.selectSort(array);


        System.out.println(Arrays.toString(array));
    }


}
