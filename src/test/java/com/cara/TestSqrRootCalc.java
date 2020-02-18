package com.cara;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableList;
import com.sun.jersey.api.client.Client;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.Test;

public class TestSqrRootCalc {

    @Test
    public void testSomeNumbers() {
        Assert.assertEquals(2,new SqrRootCalc().doSqrRoot(4));
        Assert.assertEquals(4,new SqrRootCalc().doSqrRoot(16));
    }


    @Test
    public void ba(){
        String itISGoogle = Client.create().resource("http://www.google.com").get(String.class);
        System.out.println(itISGoogle);
    }
}
