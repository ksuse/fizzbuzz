package com.github.fizzbuzz;

/**
 * FizzBuzz を動かすための Main クラス．
 *
 * @author Haruaki Tamada
 */
public class Main{
    public void run(String[] args){
        FizzBuzz fizzbuzz = new FizzBuzz();
        String[] array;
        if(args.length == 0){
            array = fizzbuzz.run();
        }
        else{
            array = fizzbuzz.run(Integer.parseInt(args[0]));
        }
        for(String item: array){
            System.out.println(item);
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        main.run(args);
    }
}
