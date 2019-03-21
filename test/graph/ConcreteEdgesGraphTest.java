/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package graph;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Tests for ConcreteEdgesGraph.
 * 
 * This class runs the GraphInstanceTest tests against ConcreteEdgesGraph, as
 * well as tests for that particular implementation.
 * 
 * Tests against the Graph spec should be in GraphInstanceTest.
 */
public class ConcreteEdgesGraphTest extends GraphInstanceTest {
    
    /*
     * Provide a ConcreteEdgesGraph for tests in GraphInstanceTest.
     */
    @Override public Graph<String> emptyInstance() {
        return new ConcreteEdgesGraph();
    }
    
    /*
     * Testing ConcreteEdgesGraph...
     */
    
    // Testing strategy for ConcreteEdgesGraph.toString()
    //   TODO
    
    // TODO tests for ConcreteEdgesGraph.toString()
    
    /*
     * Testing Edge...
     */
    
    // Testing strategy for Edge
    //   TODO
    
    // TODO tests for operations of Edge
 // Testing strategy
    //   TODO
    //ConcreteEdgesGraph CEG = new ConcreteEdgesGraph();
    ConcreteVerticesGraph CVG = new ConcreteVerticesGraph();
    String vertex1 = "one";
    String vertex2 = "two";
    String vertex3 = "three";
    String vertex4 = "four";
    int w1 = 1;
    int w2 = 2;
    int w3 = 3;
    
    /**
     * Overridden by implementation-specific test classes.
     * 
     * @return a new empty graph of the particular implementation being tested
     */
   
    
    @Test
    public void testInitialVerticesEmpty() {
        // TODO you may use, change, or remove this test
        assertEquals("expected new graph to have no vertices",
                Collections.emptySet(), emptyInstance().vertices());
    }
    
 // TODO other tests for instance methods of Graph
    
    @Test
    public void testaddvertices() {
        // TODO you may use, change, or remove this test
    	ConcreteEdgesGraph CEG1 = new ConcreteEdgesGraph();
    	CEG1.add(vertex1);
    	CEG1.add(vertex2);
    	CEG1.set(vertex1,vertex2, w1);
    	Set<String> hash_Set = new HashSet<String>();
    	hash_Set.add("one");
    	hash_Set.add("two");
    	assertEquals("expected new graph to have a new vertix",
               hash_Set, CEG1.vertices());
    }
    @Test
    public void testaddDuplicatevertices() {
        // TODO you may use, change, or remove this test
    	ConcreteEdgesGraph CEG3 = new ConcreteEdgesGraph();
    	CEG3.add(vertex1);
    	CEG3.add(vertex2);
    	CEG3.add(vertex1);
    	CEG3.add(vertex2);
    	Set<String> hash_Set = new HashSet<String>();
    	hash_Set.add("one");
    	hash_Set.add("two");
    	assertEquals("expected new graph to have the same number of vertix and no duplicate vertex",
               hash_Set, CEG3.vertices());
    }
    
    @Test
    public void testRemovevertices() {
        // TODO you may use, change, or remove this test
    	ConcreteEdgesGraph CEG2 = new ConcreteEdgesGraph();
    	CEG2.add(vertex1);
    	CEG2.add(vertex2);
    	CEG2.remove(vertex1);
    	Set<String> hash_Set = new HashSet<String>();
    	hash_Set.add("two");
    	assertEquals("expected new graph to have a removed vertix",
               hash_Set, CEG2.vertices());
    }
    
    @Test
    public void testSources() {
        // TODO you may use, change, or remove this test
    	ConcreteEdgesGraph CEG4 = new ConcreteEdgesGraph();
    	CEG4.add(vertex1);
    	CEG4.add(vertex2);
    	CEG4.add(vertex3);
    	CEG4.add(vertex4);
    	CEG4.set(vertex1,vertex2, w1);
    	CEG4.set(vertex3,vertex2, w1);
    	CEG4.set(vertex4,vertex2, w1);
    	CEG4.set(vertex1,vertex3, w1);
    	CEG4.set(vertex2,vertex3, w1);
    	CEG4.set(vertex4,vertex3, w1);
    	Map<String, Integer> expectedMap = new HashMap<String, Integer>();
    	expectedMap.put(vertex1,w1);
    	expectedMap.put(vertex3,w1);
    	expectedMap.put(vertex4,w1);
    	
    	assertEquals("expected map of target vertex",
               expectedMap, CEG4.sources(vertex2));
    	System.out.print(CEG4);
    }
    
    @Test
    public void testTarget() {
        // TODO you may use, change, or remove this test
    	ConcreteEdgesGraph CEG5 = new ConcreteEdgesGraph();
    	CEG5.add(vertex1);
    	CEG5.add(vertex2);
    	CEG5.add(vertex3);
    	CEG5.add(vertex4);
    	CEG5.set(vertex1,vertex2, w1);
    	CEG5.set(vertex3,vertex2, w1);
    	CEG5.set(vertex4,vertex2, w1);
    	CEG5.set(vertex1,vertex3, w1);
    	CEG5.set(vertex2,vertex3, w1);
    	CEG5.set(vertex1,vertex4, w1);
    	Map<String, Integer> expectedMap = new HashMap<String, Integer>();
    	expectedMap.put(vertex2,w1);
    	expectedMap.put(vertex3,w1);
    	expectedMap.put(vertex4,w1);

    	assertEquals("expected map of target vertex",
               expectedMap, CEG5.targets(vertex1));
    }
    
    
    
    
    
}
