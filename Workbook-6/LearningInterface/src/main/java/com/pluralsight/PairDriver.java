package com.pluralsight;

public class PairDriver {
    public static void main(String[] args) {
        // Create an instance of a Pair<T> where T is a String
        Pair<Integer> twoNums = new Pair<Integer>(63, 65);
        System.out.println(twoNums.getLeftThing() +
                " - " + twoNums.getRightThing());

        // Create an instance of a Pair<T> where T is an
//        Pair<String> twoWords = new Pair<String>("Me", "You");
//        System.out.println(twoWords.getLeftThing() +
//                " n " + twoWords.getRightThing());
//
//    }
}

}
