package com.gof.jdk;


/**
 * <p>
 *     测试threadLocal
 * </p>
 */
public class Tl {



    ThreadLocal<String> tl = new ThreadLocal<String>(){
        @Override
        protected String initialValue() {
            return super.initialValue();
        }
    };

    public static void main(String[] args) {


    }


}
