package ru.netology.service;

public class CustomsService {
    public static int calculateCustoms(int productPrice, int productWeight) {
        int priceDuty = productPrice / 100;
        int weightDuty = productWeight * 100;
        return priceDuty + weightDuty;
    }
}
