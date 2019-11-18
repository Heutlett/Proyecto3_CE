package cr.ac.tec.graph.api.dto;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	private String id;
	private List<Node> nodes;
	private List<Edge> edges;
	
	public Graph(String id, List<Node> nodes, List<Edge> edges) {
		super();
		this.id = id;
		this.nodes = nodes;
		this.edges = edges;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Node> getNodes() {
		return nodes;
	}
	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	public List<Edge> getEdges() {
		return edges;
	}
	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}
	
}
