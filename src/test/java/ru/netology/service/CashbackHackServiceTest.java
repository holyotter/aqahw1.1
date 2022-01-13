package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn0() {
        int actual = service.remain(1000);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn100() {
        int actual = service.remain(900);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldReturn500() {
        int actual = service.remain(500);
        int expected = 500;
        Assert.assertEquals(expected, actual);
    }
}