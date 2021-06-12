package com.intuit.karate.core.tags;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutlineTagsTest {

    @Test
    public void testFeatureTag() {
        Results results = Runner.path("classpath:com/intuit/karate/core/tags/outline-tags.feature")
                .tags("@featuretag")
                .parallel(1);
        assertEquals(4, results.getScenariosPassed());
    }
    
    @Test
    public void testOutlineTag() {
        Results results = Runner.path("classpath:com/intuit/karate/core/tags/outline-tags.feature")
                .tags("@outlinetag")
                .parallel(1);
        assertEquals(4, results.getScenariosPassed());
    }    
    
    @Test
    public void testOneTag() {
        Results results = Runner.path("classpath:com/intuit/karate/core/tags/outline-tags.feature")
                .tags("@one")
                .parallel(1);
        assertEquals(2, results.getScenariosPassed());
    }     

}