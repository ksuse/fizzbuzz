package com.github.fizzbuzz;

import java.util.*;

/**
 * 1から与えられた整数nまでの整数を，全て出力するプログラム．
 * ただし，値が3の倍数のときは，数値の代わりにFizzという文字列を，
 *        値が5の倍数のときは，数値の代わりにBuzzという文字列を，
 *        値が3の倍数でもあり，5の倍数でもあるときは，数値の代わりにFizzBuzzという文字列を出力する．
 */
public class FizzBuzz {
    private static final int DEFAULT_MAX = 100;

    public String[] run(){
        return run(DEFAULT_MAX);
    }
    
    public String[] run(int max){
        return new String[0];
    }
}
