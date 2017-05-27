package com.example.sushi.first;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by sushi on 27.05.17.
 */
public class HttpRestTest {
    @Test
    public void updateLocation() throws Exception {
        assertTrue(HttpRest.updateLocation(1, 50.00d, 50.00d) > 0);
    }

}