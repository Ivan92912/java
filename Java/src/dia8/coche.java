package dia8;
import java.util.Scanner;
public class coche {
	private String chasis, suspension, faros, motor, carroceria;
	private int ruedas=4;
	private int largo=2000; 
	private int peso=500;
	private int ancho=1500;
	
	public coche() {
		Scanner a = new Scanner(System.in);
		System.out.println("Dime el tamaño del chasis:");
		chasis = a.nextLine();
		
		System.out.println("Dime el modelo de la suspension:");
		suspension= a.nextLine();
		
		System.out.println("Dime el modelo de los faros:");
		faros= a.nextLine();
		
		System.out.println("Dime el modelo del motor:");
		motor= a.nextLine();
	
		System.out.println("Dime el modelo de la carroceria:");
		carroceria= a.nextLine();
		a.close();
		
		
	}
	public String getChasis() {
		return chasis; 
	}
	public void setChasis(String chasis) {
		this.chasis=chasis; 
	}
	public String getSuspension() {
		return suspension;
	}
	public void setSuspension(String suspension) {
		this.suspension=suspension;
	}
	public String getFaros() {
		return faros;
	}
	public void setFaros(String faros) {
		this.faros=faros;
	}
	public String getMotor() {
		return motor;
	}
	public void setMotor(String motor) {
		this.motor=motor;
	}
	public String getCarroceria() {
		return carroceria;
	}
	public void setCarroceria(String carroceria) {
		this.carroceria=carroceria;
	}
	public int getRuedas() {
		return ruedas;
	}
	public int getLargo() {
		return largo;
	}
	public int getPeso() {
		calcularPeso(this); 
		return peso;
	}
	public int getAncho() {
		return ancho;
	}
	public int calcularPeso(coche coche) {
		if(coche.chasis.equalsIgnoreCase("mediaNo")==true) {
			peso+=70; 
		}
		else if(coche.chasis.equalsIgnoreCase("grande")==true) {
			peso+=115; 
		}
		if(coche.motor.equalsIgnoreCase("diesel")==true) {
			peso+=20;
		}
		if(coche.carroceria.equalsIgnoreCase("deportiva")==true) {
			peso+=500;
		}
		else if(coche.carroceria.equalsIgnoreCase("estandar")==true) {
			peso+=600;
		}
		return peso; 
	}
}
