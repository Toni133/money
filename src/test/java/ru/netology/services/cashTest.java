package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class cashTest {
    @Test
    public void test1() {
        cash service = new cash();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

         Assertions.assertEquals(expected, actual);


    }

}