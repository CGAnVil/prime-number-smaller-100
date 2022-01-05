package com.codegym;

public class Main {

    public static void main(String[] args) {
	int n = 0;
    while (n<100){
        if(n<2){
            n++;
            continue;
        }else if (n == 2){
            System.out.println(n);
        }else {
            boolean checkPrime = true;
            for (int i = 2; i<Math.sqrt(n); i++){
                if(n%i==0){
                    checkPrime = false;
                    break;
                }
            }
            if(checkPrime){
                System.out.println(n);
            }
        }
        n++;
    }
    }
}
