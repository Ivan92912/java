package pokemon;

public class Pokemon00 {
	
	private String nombre, tipo, ataque1, ataque2, ataque3, ataque4, wiki;
	private int level, PS,AT,DF,VEL,ATESP,DFESP;
		
	public Pokemon00(String nombre, String tipo, String ataque1,String ataque2,String ataque3,String ataque4, String wiki,
	int level, int PS, int AT, int DF, int VEL, int ATESP, int DFESP) {
		this.nombre=nombre;
		this.tipo=tipo;
		this.ataque1=ataque1;
		this.ataque2=ataque2;
		this.ataque3=ataque3;
		this.ataque4=ataque4;
		this.wiki=wiki;
		this.level=level;
		this.PS=PS;
		this.AT=AT;
		this.DF=DF;
		this.VEL=VEL;
		this.ATESP=ATESP;
		this.DFESP=DFESP;
	}
	
	public String  getnombre() {
		return nombre;
	}
	public String gettipo() {
		return tipo;
	}
	public String getataque1() {
		return ataque1;
	}
	public String getataque2() {
		return ataque2;
	}
	public String getataque3() {
		return ataque3;
	}
	public String getataque4() {
		return ataque4;
	}
	public String SnivyII() {
		return ataque4;
	}
	public String getwiki() {
		return wiki;
	}
	public int getPS() {
		return PS;
	}
	public void setPS(int PS) {
		this.PS=PS;
	}
	public int getlevel() {
		return level;
	}
	public int getAT() {
		return AT;
	}
	public int getDF() {
		return DF;
	}
	public int getVEL() {
		return VEL;
	}
	public int getATESP() {
		return ATESP;
	}
	public int getDFESP() {
		return DFESP;
	}
	public void getStats() {
		System.out.println(nombre);
		System.out.println("Level:"+level);
		System.out.println("PS:"+PS);
		System.out.println("AT:"+AT);
		System.out.println("DF:"+DF);
		System.out.println("VEL:"+VEL);
		System.out.println("ATESP:"+ATESP);
		System.out.println("DF:"+DFESP);
		
		
	}
	
	
	
}

class pokemonLegendario extends Pokemon00{

	public pokemonLegendario(String nombre, String tipo, String ataque1, String ataque2, String ataque3, String ataque4,
			String wiki, int level, int PS, int AT, int DF, int VEL, int ATESP, int DFESP) {
		super(nombre, tipo, ataque1, ataque2, ataque3, ataque4, wiki, level, PS, AT, DF, VEL, ATESP, DFESP);
		// TODO Auto-generated constructor stub
		
	}
	
}