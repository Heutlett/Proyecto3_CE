package cr.ac.tec.graph.api.resources;

import javax.ws.rs.Path;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Graph;

public class GraphFinalResource {

	private Graph g;
	
	public GraphFinalResource(String graphId) {
		this.g = DB.grafos.get(graphId);
	}
	
	@Path("/degree")
	public GraphDegreeResource handleSigleGraphDegree() {
	return new GraphDegreeResource(g);
	}
	
	@Path("/dijkstra")
	public GraphDijkstraResource handleSigleGraphDijkstra() {
	return new GraphDijkstraResource(g);
}
	
	
}
