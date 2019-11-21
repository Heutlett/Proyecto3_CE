package cr.ac.tec.graph.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Node;

public class NodesResource {

	private Graph currentGraph;
	
	public NodesResource(Graph graph) {
		this.currentGraph = graph;
	}
	
	/**
	 * Inserta un nodo al grafo
	 * @param g 
	 * @return
	 */
	
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response addNode(Node node) {
		if(currentGraph != null) {
			currentGraph.getNodes().add(node);
			return Response.status(200)
					.entity(currentGraph)
					.build();
		}else {
			return Response.status(400)
					.build();
		}

	}
	/**
	 * Devuelve la lista de nodos de un grafo
	 * @return
	 */
	@GET
	@Produces("application/json")
	public Response getGraphData() {

		if (currentGraph != null) {
			return Response.status(200)
					.entity(currentGraph.getNodes())
					.build();
		}else {
			return Response.status(404)
					.entity("NO ESTA")
					.build();
		}

	}
	
}
