package cr.ac.tec.graph.api.dto;

public class Entity {
	
	private String id;
	
	public Entity() {
		this.id = "";
	}
	
	public Entity(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	
}
