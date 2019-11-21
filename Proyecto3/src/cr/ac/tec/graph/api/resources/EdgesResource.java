package cr.ac.tec.graph.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Edge;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Node;

public class EdgesResource {

	private Graph currentGraph;
	
	public EdgesResource(Graph graph) {
		this.currentGraph = graph;
	}
	
	/**
	 * Inserta una arista al grafo
	 * @param g 
	 * @return
	 */
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addEdge(Edge edge) {
		if(currentGraph != null) {
			currentGraph.getEdges().add(edge);
			return Response.status(200)
					.entity(currentGraph)
					.build();
		}else {
			return Response.status(400)
					.build();
		}
	}
	
	/**
	 * Devuelve la lista de aristas de un grafo
	 * @return
	 */
	@GET
	@Produces("application/json")
	public Response getGraphEdges() {

		if (currentGraph != null) {
			return Response.status(200)
					.entity(currentGraph.getEdges())
					.build();
		}else {
			return Response.status(404)
					.entity("NO ESTA")
					.build();
		}

		
	}
	
	/**
	 * Borra todos las aristas del grafo 
	 * @return
	 */
	@DELETE
	@Produces("application/json")
	public Response deleteGraphEdges() {
		currentGraph.getEdges().clear();
			return Response.status(200)
					.entity(DB.grafos)
					.build();
	}
	
	
	
}
