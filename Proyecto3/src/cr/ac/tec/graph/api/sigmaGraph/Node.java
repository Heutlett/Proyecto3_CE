package cr.ac.tec.graph.api.sigmaGraph;

public class Node {
	
	private String id;
	private String label;
	private int x;
	private int y;
	private int size;
	
	public Node(String id, String label, int x, int y, int size) {
		super();
		this.id = id;
		this.label = label;
		this.x = x;
		this.y = y;
		this.size = size;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	

}
