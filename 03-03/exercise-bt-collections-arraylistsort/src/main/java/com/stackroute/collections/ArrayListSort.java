package com.stackroute.collections;

import java.math.BigInteger;
import java.util.Collections;
import java.util.ArrayList;

public class ArrayListSort {
    //write logic to sort given list in descending order
    public ArrayList<BigInteger> arrayListSortDesc(ArrayList<BigInteger> list) {
        Collections.sort(list, Collections.reverseOrder());

        return list;
    }
}
