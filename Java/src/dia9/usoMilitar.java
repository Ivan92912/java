package dia9;
import java.util.Date;
public class usoMilitar {

	public static void main(String[] args) {
		Date fechaIngreso=new Date(2012, 3, 17); 
		Date fechaNacimiento=new Date(1986, 8, 14);
		militar militar01=new militar("Jose", "Fernandez", "Garcia", "Datos", "CaBo primero",0, fechaIngreso, fechaNacimiento, 45); 
		System.out.println("Nombre: " + militar01.getNombre() + " " + militar01.getApellido1()+ " " + militar01.getApellido2() );
		System.out.println("Rango: "+ militar01.getRango());
		System.out.println("Edad: "+ militar01.getEdad());
		System.out.println("Meses en activo: "+ militar01.getantiguedad());
		System.out.println("Sueldo: "+militar01.getSueldo());
		System.out.println("Baremo: "+militar01.Baremo());
		
	}

}
