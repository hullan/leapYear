package com.igarcia;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LeapYearTest {

    private LeapYear leapYear = new LeapYear();

    @Test
    public void year4_is_leapYear() {
        assertTrue(leapYear.isLeapYear(4));
    }

    @Test
    public void year_divisible_by_4_is_leap_year() {
        assertTrue(leapYear.isLeapYear(4));
        assertTrue(leapYear.isLeapYear(8));
        assertTrue(leapYear.isLeapYear(12));
        assertTrue(leapYear.isLeapYear(16));
        assertTrue(leapYear.isLeapYear(20));
        assertTrue(leapYear.isLeapYear(24));
        assertTrue(leapYear.isLeapYear(28));
        assertTrue(leapYear.isLeapYear(32));
        assertTrue(leapYear.isLeapYear(36));
        assertTrue(leapYear.isLeapYear(1996));
        assertTrue(leapYear.isLeapYear(1992));
    }

    @Test
    public void year_not_divisible_by_4_is_not_leap_year() {
        assertTrue(!leapYear.isLeapYear(1));
        assertTrue(!leapYear.isLeapYear(2));
        assertTrue(!leapYear.isLeapYear(3));
        assertTrue(!leapYear.isLeapYear(5));
        assertTrue(!leapYear.isLeapYear(6));
        assertTrue(!leapYear.isLeapYear(7));
        assertTrue(!leapYear.isLeapYear(9));
    }

    @Test
    public void year_not_divisible_by_400_is_not_leap_year() {
        assertTrue(!leapYear.isLeapYear(100));
        assertTrue(!leapYear.isLeapYear(200));
        assertTrue(!leapYear.isLeapYear(300));
        assertTrue(!leapYear.isLeapYear(500));
        assertTrue(!leapYear.isLeapYear(500));
    }

    @Test
    public void year_divisible_by_400_is_leap_year() {
        assertTrue(leapYear.isLeapYear(400));
        assertTrue(leapYear.isLeapYear(800));
        assertTrue(leapYear.isLeapYear(1200));
        assertTrue(leapYear.isLeapYear(1600));
        assertTrue(leapYear.isLeapYear(2000));
    }
}
