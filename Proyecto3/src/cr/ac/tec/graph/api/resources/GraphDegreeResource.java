package cr.ac.tec.graph.api.resources;

import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.QueryStringDegree;

public class GraphDegreeResource {
	
	private Graph g;
	
	public GraphDegreeResource(Graph g) {
		this.g = g;
	}
	
	/**
	 * Devuelve la lista de grafos
	 * @return
	 */
	@GET
	@Consumes("application/json")
	@Produces("application/json")
	public Response getGraphs(QueryStringDegree string) {
		
		if(string.getSort().equals("DESC")) {
			
			return Response.status(200)
					.entity("Ordenando descendente")
					.build();
			
		}else if(string.getSort().equals("ASC")) {
			
			return Response.status(200)
					.entity("Ordenando ascendente")
					.build();
			
		}
		return Response.status(500)
				.build();

	}

}
