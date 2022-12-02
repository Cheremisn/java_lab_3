package org.example;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ListComparing {
    public static void main(String[] args) {

        int[] numberOfElements = new int[]{1000, 2000, 10000000};

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int[][] res = new int[10][3];

        List<Integer> dataSet = new ArrayList<>();
        for (int i = 0; i < numberOfElements[2]; i++) {
            dataSet.add((int) (Math.random() * 1000));
        }

        for (int i = 0; i < numberOfElements.length; i++) {

            arrayList.clear();
            linkedList.clear();

            int start = (int) System.currentTimeMillis();
            for (int j = 0; j < numberOfElements[i]; j++) {
                arrayList.add(dataSet.get(j));
            }
            int stop = (int) System.currentTimeMillis();
            res[0][i] = stop - start;

            start = stop;


            for (int j = 0; j < numberOfElements[i]; j++) {
                linkedList.add(dataSet.get(j));
            }
            stop = (int) System.currentTimeMillis();
            res[1][i] = stop - start;

            start = stop;

            arrayList.get(i / 2);
            stop = (int) System.currentTimeMillis();
            res[2][i] = stop - start;

            start = stop;

            linkedList.get(i / 2);
            stop = (int) System.currentTimeMillis();
            res[3][i] = stop - start;

            start = stop;

            arrayList.remove(i / 2);
            stop = (int) System.currentTimeMillis();
            res[4][i] = stop - start;

            start = stop;

            linkedList.remove(i / 2);
            stop = (int) System.currentTimeMillis();
            res[5][i] = stop - start;


            arrayList.size();
            stop = (int) System.currentTimeMillis();
            res[6][i] = stop - start;

            start = stop;


            linkedList.size();
            stop = (int) System.currentTimeMillis();
            res[7][i] = stop - start;

            start = stop;


            arrayList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            stop = (int) System.currentTimeMillis();
            res[8][i] = stop - start;

            start = stop;


            linkedList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o1.compareTo(o2);
                }
            });
            stop = (int) System.currentTimeMillis();
            res[9][i] = stop - start;


        }

        String place = "| %-17s | %-8s | %-8s | %-8s |%n";
        System.out.printf("------------------------------------------------------%n");
        System.out.printf("|               Arraylist VS LinkedList              |%n");
        System.out.printf("------------------------------------------------------%n");
        System.out.printf(place, "CATEGORY", numberOfElements[0], numberOfElements[1], numberOfElements[2]);
        System.out.printf("------------------------------------------------------%n");
        System.out.printf(place, "ArrayList add", res[0][0], res[0][1], res[0][2]);
        System.out.printf(place, "LinkedList add", res[1][0], res[1][1], res[1][2]);
        System.out.printf(place, "ArrayList get", res[2][0], res[2][1], res[2][2]);
        System.out.printf(place, "LinkedList get", res[3][0], res[3][1], res[3][2]);
        System.out.printf(place, "ArrayList remove", res[4][0], res[4][1], res[4][2]);
        System.out.printf(place, "LinkedList remove", res[5][0], res[5][1], res[5][2]);
        System.out.printf(place, "ArrayList size", res[6][0], res[6][1], res[6][2]);
        System.out.printf(place, "LinkedList size", res[7][0], res[7][1], res[7][2]);
        System.out.printf(place, "ArrayList sort", res[8][0], res[8][1], res[8][2]);
        System.out.printf(place, "LinkedList sort", res[9][0], res[9][1], res[9][2]);
        System.out.printf("------------------------------------------------------%n");

    }
}