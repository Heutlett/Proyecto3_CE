package cr.ac.tec.graph.api.graph;

public class edge {


	//_________________ Atributos
	private String firstPerson;
	private String lastPerson;

	private edge nextCall;

			private int timeCall;



	//_________________ Método contructor
	public edge() {

	}

	public edge(int timeCall, String firstPerson, String lastPerson) {

		this.firstPerson = firstPerson;
		this.lastPerson = lastPerson;
		this.timeCall = timeCall;

	}


	//_________________ Getters and Setters
	public int getTimeCall() {
		return timeCall;
	}

	public void setNextCall(edge nextCall) {
		this.nextCall = nextCall;
	}
}
