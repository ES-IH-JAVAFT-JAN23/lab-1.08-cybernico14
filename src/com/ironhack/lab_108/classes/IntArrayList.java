package com.ironhack.lab_108.classes;

import com.ironhack.lab_108.interfaces.IntList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IntArrayList implements IntList {
    int[] arr = new int[10];
    int index = 0;

    public IntArrayList(int[] arr, int index) {
        this.arr = arr;
        this.index = index;
    }

    public void add(int num) {
        if (arr.length == index) {
            int arr2 = new BigDecimal(arr.length * 1.5f).setScale(0, RoundingMode.UP).intValue();
            int newArr[] = new int[arr2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                index += index;
            }
            this.arr = newArr;

        } else {
            arr[index] = num;
            index++;
        }

    }

    public void get(int id) {}
    }



