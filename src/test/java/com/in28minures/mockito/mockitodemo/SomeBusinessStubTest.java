package com.in28minures.mockito.mockitodemo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SomeBusinessStubTest {

    @Test
    public void testFindTheGreatestFromAllData() {
        SomeBusinessImpl business = new SomeBusinessImpl(new DataServiceStub());
        int result = business.findTheGreatestFromAllData();
        System.out.println(result);
        assertEquals(24, result);
    }
}

class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{24, 6, 15};
    }
}