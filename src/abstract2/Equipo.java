package abstract2;

public class Equipo {
	private String nombre;
	static double totalTiempo;
	private String pais;
//contructor
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

//metodos
	public anadirCiclistas(){};



//gett y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}




}
