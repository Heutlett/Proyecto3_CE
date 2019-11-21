package cr.ac.tec.graph.api.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.QueryStringDegree;
import cr.ac.tec.graph.api.dto.QueryStringDijkstra;
import cr.ac.tec.graph.api.util.MatrizAdyacencia;

public class GraphDijkstraResource {
	
	private Graph g;
	
	public GraphDijkstraResource(Graph g) {
		this.g = g;
	}
	
	/**
	 * Devuelve la lista de grafos
	 * @return
	 */
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Response getGraphs(QueryStringDijkstra string) {
			
		
		
		return Response.status(200)
				.entity(MatrizAdyacencia.generarMatriz(g))
				.build();

	}

}