package cr.ac.tec.graph.api.dto;

public class QueryStringDijkstra {
	
	private String startNode;
	private String endNode;
	
	public QueryStringDijkstra() {
		this.startNode = "";
		this.endNode = "";
	}
	public QueryStringDijkstra(String startNode, String endNode) {
		this.startNode = startNode;
		this.endNode = endNode;
	}
	public String getStartNode() {
		return startNode;
	}
	public void setStartNode(String startNode) {
		this.startNode = startNode;
	}
	public String getEndNode() {
		return endNode;
	}
	public void setEndNode(String endNode) {
		this.endNode = endNode;
	}
	
	
	
}
