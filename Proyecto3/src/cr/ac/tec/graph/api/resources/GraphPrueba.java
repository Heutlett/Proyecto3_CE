package cr.ac.tec.graph.api.resources;

import java.util.UUID;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import cr.ac.tec.graph.api.sigmaGraph.*;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Persona;


@Path("/prueba")
public class GraphPrueba {
	
	@GET
	@Produces("application/json")
	public Response getGraphs() {
		
		SigmaGraph grafo = new SigmaGraph();
		grafo.getNodes().add(new Node("n0", "kevin", 0,0,3));
		grafo.getNodes().add(new Node("n1", "kennet", 3,1,2));
		grafo.getNodes().add(new Node("n2", "melvin", 1,3,1));
		grafo.getEdges().add(new Edge("e0","n0","n1"));
		grafo.getEdges().add(new Edge("e1","n1","n2"));
		grafo.getEdges().add(new Edge("e2","n2","n0"));
		
		
		
		
		return Response.status(200)
				.entity(grafo)
				.build();
	}
	
}