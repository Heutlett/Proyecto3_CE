	package cr.ac.tec.graph.api.dto;

public class Node {
	private String id;
	private int inDegree;
	private int outDegree;
	private String entity;
		
	public Node(String id, int inDegree, int outDegree, String entity) {
		super();
		this.id = id;
		this.inDegree = inDegree;
		this.outDegree = outDegree;
		this.entity = entity;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getInDegree() {
		return inDegree;
	}
	public void setInDegree(int inDegree) {
		this.inDegree = inDegree;
	}
	public int getOutDegree() {
		return outDegree;
	}
	public void setOutDegree(int outDegree) {
		this.outDegree = outDegree;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	
}
