package cr.ac.tec.graph.api.dto;

public class QueryStringDegree {

	private String sort;

	public QueryStringDegree() {
		this.sort = "";
	}
	
	public QueryStringDegree(String sort) {
		this.sort = sort;
	}
	
	
	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}
	
	
	
}
