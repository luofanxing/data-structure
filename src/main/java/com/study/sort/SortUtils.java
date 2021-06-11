package com.study.sort;


/**
 * 排序工具包
 *
 * @author luofanxing
 * @create 2021-06-10 20:32
 */
public class SortUtils {


    /**
     *  冒泡排序
     *  时间复杂度 ： O(n²)，也就是两个for循环次数的乘积
     * @param array
     */
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true; //标识
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;

                    flag = false;
                }
            }
            //若本次循环，没有交换数据，说明排序提前完成了
            if (flag){
                break;
            }
        }
    }


    /**
     *  选择升序
     * @param array
     */
    public static void selectSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            //若本次循环，没有交换数据，说明排序提前完成了
           if (i != minIndex){
               int t = array[minIndex];
               array[minIndex] = array[i];
               array[i] = t;
           }
        }
    }



    /**
     * 快速排序
     * @param array
     */
    public static void quickSort(int[] array){}


    /**
     * 归并排序
     */
    public static void mergeSort(int[] array){}



    /**
     * 桶排序
     */
    public static void bucketSort(int[] array){}



    /**
     * 堆排序
     */
    public static void headSort(int[] array){}


    /**
     * fffffffffffffffffffffff
     */

    /**
     * master update
     */
}
