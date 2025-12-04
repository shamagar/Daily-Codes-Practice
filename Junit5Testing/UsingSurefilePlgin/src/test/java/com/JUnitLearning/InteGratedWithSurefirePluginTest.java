package com.JUnitLearning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InteGratedWithSurefirePluginTest
{
    @Test
    public void test()
    {
        InteGratedWIthSurefirePlugin plugin = new InteGratedWIthSurefirePlugin();
        assertEquals(25,plugin.areaOfSquare(5));
    }
}
