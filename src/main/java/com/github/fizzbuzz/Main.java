package com.github.fizzbuzz;

/**
 * FizzBuzz を動かすための Main クラス．
 *
 * @author Haruaki Tamada
 */
public class Main{
    public void run(String[] args){
        FizzBuzz fizzbuzz = new FizzBuzz();
        if(args.length == 0){
            fizzbuzz.run();
        }
        else{
            fizzbuzz.run(Integer.parseInt(args[0]));
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        main.run(args);
    }
}
