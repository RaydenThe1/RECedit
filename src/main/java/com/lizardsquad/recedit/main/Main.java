package com.lizardsquad.recedit.main;

import com.lizardsquad.recedit.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

import java.util.ArrayList;
import java.util.Random;

@ExcludeFromGeneratedCodeCoverage
public class Main {

    public static void main(String [] args) {

        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            arr.add(rand.nextInt(50));
            System.out.println("Array value is : " + arr.get(i));
        }
    }
}
