package com.fasterxml.jackson.compat11.test.df;

import java.util.*;

import com.fasterxml.jackson.compat11.test.BaseTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.smile.SmileFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmileTest extends BaseTest
{
    @SuppressWarnings("serial")
    @Test
    public void testSimple() throws Exception
    {
        ObjectMapper mapper = newMapper(new SmileFactory());
        byte[] smile = mapper.writeValueAsBytes(new HashMap<String,String>() { });

        Map<?,?> output = mapper.readValue(smile, Map.class);
        assertEquals(0, output.size());
    }
}
