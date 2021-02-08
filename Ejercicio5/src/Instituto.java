
public class Instituto {

	String localidad;
	int numClases;
	boolean publico;
	String nombreDirector;
	String [] jefeEstudios;
	
	Instituto(){
		this.localidad=null;
		this.numClases=0;
		this.publico=true;
		this.nombreDirector=null;
		this.jefeEstudios=null;
	}
	
	Instituto(String loc, int numClas, boolean pub, String nomDir, String []jef){
		this.localidad=loc;
		this.numClases=numClas;
		this.publico=pub;
		this.nombreDirector=nomDir;
		this.jefeEstudios=jef;
		}
	
		
	public String toString(){
		return ("El instituto de "+this.localidad+" con "+this.numClases+" publico "+this.publico+" cuyo director es "+this.nombreDirector);
	}
	
	public String getLocalidad() {
		return this.localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public int getNumClases() {
		return this.numClases;
	}
	public void setNumClases(int numClases) {
		this.numClases = numClases;
	}
	public boolean isPublico() {
		return this.publico;
	}
	public void setPublico(boolean publico) {
		this.publico = publico;
	}
	public String getNombreDirector() {
		return this.nombreDirector;
	}
	public void setNombreDirector(String nombreDirector) {
		this.nombreDirector = nombreDirector;
	}

	public String[] getJefeEstudios() {
		return this.jefeEstudios;
	}

	public void setJefeEstudios(String[] jefeEstudios) {
		this.jefeEstudios = jefeEstudios;
	}
	
	
	
	
}
