package ru.netology.services;
public class cash {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int maney = 0;

        for (int i = 0; i < 12; i++)
            if (maney <= threshold) {
                maney = maney - expenses;
                maney = maney / 3;
                count++;
            } else {
                maney = maney + income - expenses;

            }
        return count;
    }
}
