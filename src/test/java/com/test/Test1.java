package com.test;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

/**
 * Created by intron on 2016/6/26 0026.
 */
public class Test1 implements AutoCloseable{


    static public void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(null);
        list.add(null);
        list.add(3);
        for (Integer integer : list) {
            if (integer != null)
                System.out.println(integer);
            else
                System.out.println("null");
        }
    }

    @Override
    public void close() throws Exception {
        out.println("close");
    }
}
