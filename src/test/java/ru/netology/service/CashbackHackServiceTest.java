package ru.netology.service;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldRemainsIfBuy600() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(600);
        int expected = 400;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainsIfBuy999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainsIfBuy1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainsIfBuy1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldRemainsIfNotBuy() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(0);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }

}