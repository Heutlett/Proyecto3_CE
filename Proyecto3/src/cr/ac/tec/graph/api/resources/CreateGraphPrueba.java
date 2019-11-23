package cr.ac.tec.graph.api.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import cr.ac.tec.graph.api.dto.DB;
import cr.ac.tec.graph.api.dto.Edge;
import cr.ac.tec.graph.api.dto.Entity;
import cr.ac.tec.graph.api.dto.Graph;
import cr.ac.tec.graph.api.dto.Node;

@Path("/create")
public class CreateGraphPrueba {
	
	@GET
	@Produces("application/json")
	public Response getGraphs() {
			
			Graph g = new Graph();
			
			g.agregarNodo(new Entity("telefono0"));
			g.agregarNodo(new Entity("telefono1"));
			g.agregarNodo(new Entity("telefono2"));
			g.agregarNodo(new Entity("telefono3"));
			g.agregarNodo(new Entity("telefono4"));
			g.agregarNodo(new Entity("telefono5"));
			g.agregarNodo(new Entity("telefono6"));
			g.agregarNodo(new Entity("telefono7"));
			
			
			g.agregarEdge(new Edge("n0", "n0", 0));
			g.agregarEdge(new Edge("n0", "n1", 16));
			g.agregarEdge(new Edge("n0", "n2", 10));
			g.agregarEdge(new Edge("n0", "n3", 5));
			g.agregarEdge(new Edge("n0", "n4", 999999999));
			g.agregarEdge(new Edge("n0", "n5", 999999999));
			g.agregarEdge(new Edge("n0", "n6", 999999999));
			g.agregarEdge(new Edge("n0", "n7", 999999999));
			
			g.agregarEdge(new Edge("n1", "n0", 16));
			g.agregarEdge(new Edge("n1", "n1", 0));
			g.agregarEdge(new Edge("n1", "n2", 2));
			g.agregarEdge(new Edge("n1", "n3", 999999999));
			g.agregarEdge(new Edge("n1", "n4", 999999999));
			g.agregarEdge(new Edge("n1", "n5", 4));
			g.agregarEdge(new Edge("n1", "n6", 6));
			g.agregarEdge(new Edge("n1", "n7", 999999999));
			
			g.agregarEdge(new Edge("n2", "n0", 10));
			g.agregarEdge(new Edge("n2", "n1", 2));
			g.agregarEdge(new Edge("n2", "n2", 0));
			g.agregarEdge(new Edge("n2", "n3", 4));
			g.agregarEdge(new Edge("n2", "n4", 10));
			g.agregarEdge(new Edge("n2", "n5", 12));
			g.agregarEdge(new Edge("n2", "n6", 999999999));
			g.agregarEdge(new Edge("n2", "n7", 999999999));
			

			g.agregarEdge(new Edge("n3", "n0", 5));
			g.agregarEdge(new Edge("n3", "n1", 999999999));
			g.agregarEdge(new Edge("n3", "n2", 4));
			g.agregarEdge(new Edge("n3", "n3", 0));
			g.agregarEdge(new Edge("n3", "n4", 15));
			g.agregarEdge(new Edge("n3", "n5", 999999999));
			g.agregarEdge(new Edge("n3", "n6", 999999999));
			g.agregarEdge(new Edge("n3", "n7", 999999999));
			
			
			g.agregarEdge(new Edge("n4", "n0", 999999999));
			g.agregarEdge(new Edge("n4", "n1", 999999999));
			g.agregarEdge(new Edge("n4", "n2", 10));
			g.agregarEdge(new Edge("n4", "n3", 15));
			g.agregarEdge(new Edge("n4", "n4", 0));
			g.agregarEdge(new Edge("n4", "n5", 3));
			g.agregarEdge(new Edge("n4", "n6", 999999999));
			g.agregarEdge(new Edge("n4", "n7", 5));
			

			g.agregarEdge(new Edge("n5", "n0", 999999999));
			g.agregarEdge(new Edge("n5", "n1", 4));
			g.agregarEdge(new Edge("n5", "n2", 12));
			g.agregarEdge(new Edge("n5", "n3", 999999999));
			g.agregarEdge(new Edge("n5", "n4", 3));
			g.agregarEdge(new Edge("n5", "n5", 0));
			g.agregarEdge(new Edge("n5", "n6", 8));
			g.agregarEdge(new Edge("n5", "n7", 16));
			
			
			g.agregarEdge(new Edge("n6", "n0", 999999999));
			g.agregarEdge(new Edge("n6", "n1", 6));
			g.agregarEdge(new Edge("n6", "n2", 999999999));
			g.agregarEdge(new Edge("n6", "n3", 999999999));
			g.agregarEdge(new Edge("n6", "n4", 999999999));
			g.agregarEdge(new Edge("n6", "n5", 8));
			g.agregarEdge(new Edge("n6", "n6", 0));
			g.agregarEdge(new Edge("n6", "n7", 7));
			
			long matriz[][] = { {0, 16, 10, 5, 999999999, 999999999, 999999999, 999999999},
					{16, 0, 2, 999999999, 999999999, 4, 6, 999999999},
					{10, 2, 0, 4, 10, 12, 999999999,999999999},
					{5, 999999999, 4, 0, 15, 999999999, 999999999, 999999999},
					{999999999, 999999999, 10, 15, 0, 3, 999999999, 5},
					{999999999, 4, 12, 999999999, 3, 0, 8, 16},
					{999999999, 6, 999999999, 999999999, 999999999, 8, 0, 7},
					{999999999, 999999999, 999999999, 999999999, 5, 16, 17, 0} };
			
			g.agregarEdge(new Edge("n7", "n0", 999999999));
			g.agregarEdge(new Edge("n7", "n1", 999999999));
			g.agregarEdge(new Edge("n7", "n2", 999999999));
			g.agregarEdge(new Edge("n7", "n3", 999999999));
			g.agregarEdge(new Edge("n7", "n4", 5));
			g.agregarEdge(new Edge("n7", "n5", 16));
			g.agregarEdge(new Edge("n7", "n6", 17));
			g.agregarEdge(new Edge("n7", "n7", 0));
			
			DB.grafos.put(g.getId(), g);
			
			return Response.status(200).entity(g).build();
			
		}
	
	

}
