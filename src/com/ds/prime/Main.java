package com.ds.prime;

/*
 * This program can be used to find a prime from a list of prime numbers.
 * This also demonstrates binary search implementation
 */

public class Main {

    public static void main(String[] args) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
       System.out.print(isPrime(primes, 100));
    }

    static boolean isPrime(int[] primes, int num) {

        int min = 0;
        int max = primes.length-1;
        int guess;
        boolean iterate = true;

        if (num>primes[primes.length-1]) {
            System.out.println("Argument more than the largest prime number in list. Try with a number less than "+primes[max]);
            return false;
        }

        while (iterate) {

            if (max < min) {
                return false;
            }
            guess = (min+max)/2;
            if (primes[guess] == num) {
                return true;
            } else if (primes[guess] < num) {
                min = guess+1;
            } else if (primes[guess] > num) {
                max = guess - 1;
            }

        }
        return false;
    }
}
