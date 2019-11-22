package cr.ac.tec.graph.api.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
	
	private String id;
    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;
    public static int idCount = -1;
    
    public Graph() {
    	this.id = "g"+(idCount+1);
    	this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
        idCount++;
    }
    
    public Graph(String id) {
    	super();
    	this.id = id;
    	this.nodes = new ArrayList<>();
        this.edges = new ArrayList<>();
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public void setNodes(ArrayList<Node> nodes) {
		this.nodes = nodes;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void setEdges(ArrayList<Edge> edges) {
		this.edges = edges;
	}
    
}
