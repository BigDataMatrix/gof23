package com.gof.jdk;


import java.util.HashMap;
import java.util.Map;

public class Jdk1 {

    static final int HASH_BITS = 0x7fffffff;

    public static void main(String[] args) {

        Map<String,String> map1 = new HashMap<String, String>();

        System.out.println(spread(1)+"="+spread(17) );

        System.out.println("abc="+ spread("abc".hashCode()));

        System.out.println("cde="+spread("cde".hashCode()));
        System.out.println("");

        System.out.println(spread(100) == spread(4));

    }

    static int spread(int h) {
        return (h ^ (h >>> 16)) & HASH_BITS;
    }

}
