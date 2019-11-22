	package cr.ac.tec.graph.api.dto;

public class Node {
	private String id;
	private int inDegree;
	private int outDegree;
	private Entity entity;
	public static int idCount = -1;
		
	public Node() {
		this.id = "n"+(idCount+1);;
		this.inDegree = 0;
		this.outDegree = 0;
		this.entity = null;
	}
	
	public Node(Entity entity) {
		super();
		this.id = "n"+(idCount+1);
		this.entity = entity;
		idCount++;
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
	public void aumentarInDegree() {
		this.inDegree++;
	}
	public int getOutDegree() {
		return outDegree;
	}
	public void aumentarOutDegree() {
		this.outDegree++;
	}
	public Entity getEntity() {
		return entity;
	}
	public void setEntity(Entity entity) {
		this.entity = entity;
	}
	
	
}
