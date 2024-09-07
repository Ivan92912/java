package dia9;
import java.util.Scanner;
import java.util.Date;

public class militar {
		private String Nombre, Apellido1, Apellido2, DatosFisicos, Rango;
		private Date FechaIngreso, FechaNacimiento;
		private int Misiones, Medallas;

		public militar(String Nombre, String Apellido1, String Apellido2, String DatosFisicos, String Rango, int Medallas, Date FechaIngreso, Date FechaNacimiento, int Misiones ) {
			this.Nombre=Nombre; 
			this.Apellido1=Apellido1;
			this.Apellido2=Apellido2;
			this.DatosFisicos=DatosFisicos;
			this.Rango=Rango;
			this.Medallas=Medallas;
			this.FechaIngreso=FechaIngreso;
			this.FechaNacimiento=FechaNacimiento;
			this.Misiones=Misiones; 
		}
		public String getNombre() {
			return Nombre;
		}
		public String getApellido1() {
			return Apellido1;
		}
		public String getApellido2() {
			return Apellido2;
		}
		public String getDatosFisicos() {
			return DatosFisicos;
		}
		public void setDatosFisicos(String DatosFisicos) {
			this.DatosFisicos=DatosFisicos;
		}
		public String getRango() {
			return Rango;
		}
		public void setRango(String Rango) {
			this.Rango=Rango;
		}
		public int getMedallas() {
			return Medallas;
		}
		public Date getIngreso() { 
			return FechaIngreso;
		}
		
		public void setMisiones(int Misiones) {
			this.Misiones=Misiones;
		}
		
		public int getEdad() {
			Date now = new Date();
			
			int dia= now.getDate();
			int mes= now.getMonth();
			int año=now.getYear()+1900;
			
			
			int edad= año-(FechaNacimiento.getYear());
			
			if(edad!=0) {
				
				if(mes<= FechaNacimiento.getMonth()-1) {
					if(mes==FechaNacimiento.getMonth()-1) {
						if(dia<FechaNacimiento.getDate()) {
							edad--;
						}
					
					}
					else {
						edad--; 
					}
				}
			}
			return edad;
			
			
		}
		public int getantiguedad() {
			Date now = new Date();
			
			int dia= now.getDate();
			int mes= now.getMonth()+1;
			int año=now.getYear()+1900;
			
			int edad= año-(FechaIngreso.getYear());
				if(edad!=0) {
				
					if(mes<= FechaIngreso.getMonth()-1) {
						if(mes==FechaIngreso.getMonth()-1) {
							
							if(dia<FechaIngreso.getDate()) {
								edad--;
						}	
					
					}
					else {
						edad--; 
					}
			
					}
				}int meses=edad*12+ (FechaIngreso.getMonth());;
				
				
				return meses;

}		public float getSueldo() {
			float sueldo=1100;
			if(Rango.equalsIgnoreCase("Soldado primero")) {
				sueldo+=25;
			}else if(Rango.equalsIgnoreCase("Cabo")) {
				sueldo+=98;
			}else if(Rango.equalsIgnoreCase("Cabo primero")) {
				sueldo+=112;
			}else if(Rango.equalsIgnoreCase("Cabo permanente")) {
				sueldo+=189;
			}
			int antiguo=getantiguedad()/12;
			int trienios= antiguo/3;
			int sexenios= antiguo/6;
			for(int i=1;i<=trienios;i++) {
				sueldo+=sueldo*2.17/100; 
			}for(int i=1;i<=sexenios;i++) {
				sueldo+=sueldo*3.04/100;
			}
			return sueldo;	
			}
		public float Baremo() {
			float Baremo=0;
			int edad=getEdad();
			int mesesServicio=getantiguedad();
			float mesMisiones=this.Misiones/30;
			String rango=Rango.toLowerCase();
			if(edad==18) {
				Baremo+=5;
			}else if(edad==19) {
				Baremo+=3;
			}else if(edad==20) {
				Baremo+=1;
			}else if(edad>=21 && edad<=25) {
				Baremo+=0.5;
			}
			Baremo+=mesesServicio*0.15;
			
			Baremo+=mesMisiones*0.75;
			Baremo+=Medallas*0.4;
			if(Rango.equalsIgnoreCase("Soldado primero")) {
				Baremo+=1;
			}if(rango.contentEquals("cabo")) {
				Baremo+=1.75;
			}
			
			return Baremo;
			}
		}
			

			
		