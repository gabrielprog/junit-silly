package com.gabriel.junit.tests;

import org.junit.Assert;
import org.junit.Test;

public class JunitFirstLesson {
    
    @Test
    public void toBeEqualsName() {
        String name = "Gabriel";
        Assert.assertEquals("Gabriel", name);
    }

    @Test
    public void toBeNotEqualsName() {
        String name = "Gabriel";
        Assert.assertNotEquals("Gabriel01", name);
    }
}
