package abstract2;

public class Escalador extends Ciclistas {

	private double aceleracionPromedio;
	private double gradoRampa;
//constructor

	public Escalador(double aceleracionPromedio, double gradoRampa, int identificador, String nombre) {
		super(identificador, nombre);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}

//get y set
	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}

	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}

	public double getGradoRampa() {
		return gradoRampa;
	}

	public void setGradoRampa(double gradoRampa) {
		this.gradoRampa = gradoRampa;
	}

//metodos sobre escritos
	@Override
	public String impimirTipo() {

		return null;
	}

	@Override
	public String tipo() {
		return null;
	}

}
