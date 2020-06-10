package java8.fun.stuff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        IntStream.range(0, 3).map(i -> scanner.nextInt()).forEach(a::add);
        IntStream.range(0, 3).map(i -> scanner.nextInt()).forEach(b::add);
        scanner.close();
        int aScore = 0, bScore = 0;
        for (int i = 0; i < a.size() && i < b.size(); i++) {
            aScore += a.get(i) > b.get(i) ? 1 : 0;
            bScore += b.get(i) > a.get(i) ? 1 : 0;
        }
        System.out.println(aScore + " " + bScore);
    }
}
