package com.test;

import org.junit.Test;
import practice.sorting.*;

/**
 * Created by intron on 2017/3/29 0029.
 */
public class TestSort {

    public static final int[] listInt = {49,38,65,97,76,13,27,49,78,34,12,64,1};

    @Test
    public void testBubbleSorter() {
        sort(new BubbleSorter(), listInt);
    }

    @Test
    public void testInsertSorter() {
        sort(new InsertSorter(), listInt);
    }

    @Test
    public void testSelectionSorter() {
        sort(new SelectionSorter(), listInt);
    }

    @Test
    public void testMergeSorter() {
        sort(new MergeSorter(), listInt);
    }

    @Test
    public void testQuickSorter() {
        sort(new Quicksorter(), listInt);
    }

    @Test
    public void ShellSorter() {
        sort(new ShellSorter(), listInt);
    }

    private void sort(Sortable sortable, int[] list) {
        System.out.println(sortable.getName());
        System.out.println("排序之前：");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println();
        sortable.sort(list);
        System.out.println("排序之后：");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+" ");
        }
        System.out.println("\n");
    }
}
