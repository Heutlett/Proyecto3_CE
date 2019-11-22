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
    
    public boolean agregarEdge(Edge e) {
    	
    	agregarVecindad(e.getStart(), e.getEnd(), e.getWeight());
    	
    	for(int i = 0; i < edges.size(); i++) {
    		
    		if(edges.get(i).getStart().equals(e.getStart()) && edges.get(i).getEnd().equals(e.getEnd())) {
    			edges.get(i).aumentarPeso(e.getWeight());
    			return true;
    		}
    		
    	}
    	edges.add(e);
    	return false;
    	
    }
    
	public void agregarVecindad(String idStart, String idEnd, int peso) {
		
		for(int i = 0; i < nodes.size(); i++) {
			
			System.out.println("Comprando: " + idStart +" con: " + nodes.get(i).getId());
			
			if(nodes.get(i).getId().equals(idStart) && peso < 999 && peso != 0) {
				System.out.println("Coincidimos");
				nodes.get(i).aumentarInDegree();
				
			}
			if(nodes.get(i).getId().equals(idEnd) && peso < 999 && peso != 0) {
				
				nodes.get(i).aumentarOutDegree();
				
			}
		}
		
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
