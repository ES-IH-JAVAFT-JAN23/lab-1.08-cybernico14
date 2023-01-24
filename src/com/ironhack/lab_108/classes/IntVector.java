package com.ironhack.lab_108.classes;

import com.ironhack.lab_108.interfaces.IntList;


    public class IntVector implements IntList {
        int[] arr = new int[20];
        int index = 0;

        public IntVector() {
            this.arr = arr;
        }

        public void add(int num) {
            if (arr.length == index) {
                int newArray[] = new int[arr.length * 2];
                for (int i = 0; i < arr.length; i++) {
                    newArray[i] = arr[i];
                    index++;
                }
                this.arr = newArray;
            } else {
                arr[index] = num;
                index++;
            }
        }

        public void get(int id) {
        }
    }
