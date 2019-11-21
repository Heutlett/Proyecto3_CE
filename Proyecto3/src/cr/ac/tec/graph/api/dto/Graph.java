package cr.ac.tec.graph.api.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {
	
	private String id;
    private HashMap<String, Node> nodes;
    private HashMap<Integer, Edge> edges;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public HashMap<String, Node> getNodes() {
		return nodes;
	}
	public void setNodes(HashMap<String, Node> nodes) {
		this.nodes = nodes;
	}
	public HashMap<Integer, Edge> getEdges() {
		return edges;
	}
	public void setEdges(HashMap<Integer, Edge> edges) {
		this.edges = edges;
	}

    
    
}
