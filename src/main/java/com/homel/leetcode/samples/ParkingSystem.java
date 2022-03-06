package com.homel.leetcode.samples;

import java.util.ArrayList;
import java.util.List;

public class ParkingSystem {

    int[] bank;

    public ParkingSystem(int big, int medium, int small) {
        bank = new int[]{big, medium, small};
    }

    public boolean addCar(int carType) {
        return bank[carType - 1]-- > 0;
    }
}
