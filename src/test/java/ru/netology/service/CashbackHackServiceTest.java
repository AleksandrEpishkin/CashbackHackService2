package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService  cashbackHackService = new CashbackHackService();

    @Test
    public void testRemain() {
        int actual = cashbackHackService.remain(999);
        int exepted = 1;
        assertEquals(actual, exepted);

    }

    @Test
    public void testRemain1() {
        int actual = cashbackHackService.remain(1000);
        int exepted = 0;
        assertEquals(actual, exepted);

    }

    @Test
    public void testRemain2() {
        int actual = cashbackHackService.remain(1001);
        int exepted = 999;
        assertEquals(actual, exepted);

    }

    @Test
    public void testRemain3() {
        int actual = cashbackHackService.remain(0);
        int exepted = 1000;
        assertEquals(actual, exepted);

    }
}