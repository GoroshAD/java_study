package ru.netology.service;

public class CustomsService {
    public static final int CUSTOM_RATE = 100;

    public static int calculateCustoms(int cost, int weight) {
        int customsCost = cost / 100 + weight * CUSTOM_RATE;
        return customsCost;
    }
}
