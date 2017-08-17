package clase1_nilsa;

import java.io.IOException;

public class Funcionario {
	private String nroCedula;
	private String nombreCompleto;
	private Integer edad;
	private String cargo;
	private Integer antiguedad;
	private Integer salario;

	public Funcionario() {
		
	}
	
	public Funcionario(String nroCedula, String nombreCompleto, Integer edad, String cargo, Integer antiguedad,
			Integer salario) {
		super();
		this.nroCedula = nroCedula;
		this.nombreCompleto = nombreCompleto;
		this.edad = edad;
		this.cargo = cargo;
		this.antiguedad = antiguedad;
		this.salario = salario;
	}
	
	public String getNroCedula() {
		return nroCedula;
	}

	public void setNroCedula(String nroCedula) {
		this.nroCedula = nroCedula;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public static void main(String[] args) {	
		Operaciones operaciones = new Operaciones();
		try {
			operaciones.menu();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
