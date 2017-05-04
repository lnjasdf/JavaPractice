package com.test;

import static java.lang.System.out;

/**
 * Created by intron on 2016/6/26 0026.
 */
public class Test1 implements AutoCloseable{


    static public void main(String[] args) {
        try (Test1 t = new Test1()) {
            out.println("hello world");
        } catch (Exception e) {

        }
    }

    @Override
    public void close() throws Exception {
        out.println("close");
    }
}
