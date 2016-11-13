/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wadeowen
 */


import java.io.File;
import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;
import org.neo4j.driver.v1.*;
import org.neo4j.graphdb.RelationshipType;



public class Main {
    
    public static void main(String[] args){

      //GraphDatabaseService graphDb = new GraphDatabaseFactory().newEmbeddedDatabase(new File("/var/lib/neo4j/data/databases/graph.db"));
        GraphDatabaseService graphDb;
        graphDb = (GraphDatabaseService) new GraphDatabaseFactory().newEmbeddedDatabaseBuilder(new File("/var/lib/neo4j/data/databases/graph.db")).loadPropertiesFromFile("/etc/neo4j/neo4j.conf" ).newGraphDatabase();
      
        /*ExecutionEngine execEngine = new ExecutionEngine(graphDb);
        ExecutionResult execResult = execEngine.execute("MATCH (java:JAVA) RETURN java");
        String results = execResult.dumpToString();
        System.out.println(results);
        graphDb.execute(results);*/
        Node firstNode;
        Node secondNode;
        Relationship relation;
        
        
      
        firstNode = graphDb.createNode();
        firstNode.setProperty(string, args);
      
        try ( Transaction tx = (Transaction) graphDb.beginTx() )
        {
            // Database operations go here
            tx.success();
        }
      
        GUIWindow gui = new GUIWindow();
        gui.run();
    }
    
    private static enum RelTypes implements RelationshipType{
        KNOWS
    }
    
}
