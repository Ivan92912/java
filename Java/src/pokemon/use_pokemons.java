package pokemon;
import java.util.Scanner;
import java.lang.Math;
public class use_pokemons {
	public static void main(String[] args) {
		Pokemon00 Charizard =new Pokemon00("Charizard", "fuego", "placaje","Lanzallamas","Giro fuego","Arañazo",
		"Tipo fuego. Su gran secreto es la llama que sale de su cola.",50, 185,122,117,136,144,123);
		Pokemon00 Blastoise =new Pokemon00("Blastoise", "agua", "placaje","Hidropulso","surf","giro rapido",
				"Tipo agua. Increible tortugon con cañones.",50, 186,121,136,136,123,141);
		Pokemon00 SnivyII =new Pokemon00("SnivyII", "planta", "placaje","Latigocepa","gigadrenado","Arañazo",
				"Tipo planta. Es el goat;).",50, 187,120,121,118,136,136);
		
		Scanner a = new Scanner(System.in);
		System.out.println("Do you want to start? ");
		System.out.println("Yes/No");
		String b = a.nextLine();
		
		
		if(b.equalsIgnoreCase("yes")) {
			
			Scanner c= new Scanner(System.in);
			String d;
			while(true) {
			System.out.println("Choose your pokemon.");
			System.out.println("1.Charizard    2.Blastoise    3.SnivyII");
			System.out.println("You can choose calling pokemons.(Example: Charizard)");
			d= c.nextLine();
			
			
			if(d.equalsIgnoreCase("Charizard")){
				Scanner e= new Scanner(System.in);
				
				System.out.println(Charizard.getwiki());
				System.out.println("Are you sure?");
				System.out.println("(Yes/No)");
				String yes= e.nextLine();
				
				if(yes.equalsIgnoreCase("yes")) {
						break;
				}
			}
			else if(d.equalsIgnoreCase("Blastoise")) {
				Scanner e= new Scanner(System.in);
				
				System.out.println(Blastoise.getwiki());
				System.out.println("Are you sure?");
				System.out.println("(Yes/No)");
				String yes= e.nextLine();
				
				if(yes.equalsIgnoreCase("yes")) {
					break;	
				}
			}
			else if(d.equalsIgnoreCase("SnivyII")) {
				Scanner e= new Scanner(System.in);
				
				System.out.println(SnivyII.getwiki());
				System.out.println("Are you sure?");
				System.out.println("(Yes/No)");
				String yes= e.nextLine();
				
				if(yes.equalsIgnoreCase("yes")) {
					break;	
				}
			}
			
		}
			String Starter = d;
			System.out.println("Red te ha desafiado.");
			System.out.println("TURURURURURRURR");
			if(Starter.equalsIgnoreCase("charizard")) {
				String StarterRed ="Blastoise";
				
				Scanner f= new Scanner(System.in);
				String num;
				while(true) {
				
				System.out.println("                     1.Fight      2.Backpack");
				System.out.println("                     2.Pokemons   4.Escape");
				num =f.nextLine();
				if(num.equalsIgnoreCase("1")) {
					Scanner g =new Scanner(System.in);
					String ataque;
					while(Blastoise.getPS()>0 ||Charizard.getPS()>0) {
						System.out.println("");
						System.out.println("Menu combate:");
						//ataque 1=placaje ataque2=lanzallamas ataque3= Giro fuego ataque 4=arañazo
						System.out.println("				1."+Charizard.getataque1()+"    2."+Charizard.getataque2());
						System.out.println("				3."+Charizard.getataque3()+"    4."+Charizard.getataque4());
						ataque = g.nextLine();
						
						if(ataque.equalsIgnoreCase("1")) {
							
							if(Blastoise.getPS()>0) {
							System.out.println(Charizard.getnombre()+"ha utilizado "+Charizard.getataque1());
							Blastoise.setPS(Blastoise.getPS()-40);
							if(Blastoise.getPS()>0) {
							System.out.println("La vida de Blastoise se ha reducido a "+Blastoise.getPS()+"PS");
							}
							else if(Blastoise.getPS()<0) {
								Blastoise.setPS(0);
								System.out.println("La vida de Blastoise se ha reducido a "+Blastoise.getPS()+"PS");
								break;
								}
							}
							
							
							if(Blastoise.getPS()>0) {
							int h;
							h=(int) (Math.random()*4+1);
							if(h==1) {
								if(Charizard.getPS()>0) {
									System.out.println(Blastoise.getnombre()+"ha utilizado "+Blastoise.getataque1());
									Charizard.setPS(Charizard.getPS()-40);
									if(Charizard.getPS()>0) {
									System.out.println("La vida de Charizard se ha reducido a "+Charizard.getPS()+"PS");
									}
									else if(Blastoise.getPS()<0) {
										Blastoise.setPS(0);
										System.out.println("La vida de Blastoise se ha reducido a "+Blastoise.getPS()+"PS");
										break;
										}
									}
							}
							else if(h==2) {
								System.out.println(Blastoise.getnombre()+"ha utilizado "+Blastoise.getataque2());
								Charizard.setPS(Charizard.getPS()-80);
								System.out.println("La vida de Charizard se ha reducido a "+Charizard.getPS()+"PS");
							}
							else if(h==3) {
								System.out.println(Blastoise.getnombre()+"ha utilizado "+Blastoise.getataque3());
								Charizard.setPS(Charizard.getPS()-100);
								System.out.println("La vida de Charizard se ha reducido a "+Charizard.getPS()+"PS");
							}
							else if(h==4) {
								System.out.println(Blastoise.getnombre()+"ha utilizado "+Blastoise.getataque4());
								Charizard.setPS(Charizard.getPS()-20);
								System.out.println("La vida de Charizard se ha reducido a "+Charizard.getPS()+"PS");
							}}
						}
					}break;
					
					}
				}
				if(Charizard.getPS()<=0) {
					System.out.println("Charizard se ha debilitado");
					System.out.println("Has perdido.");
				}
				else if(Blastoise.getPS()<=0) {
					System.out.println("Blastoise se ha debilitado");
					System.out.println("Has perdido.");
				}
				
				if(num.equalsIgnoreCase("2")) {
					Scanner h= new Scanner(System.in);
					
				}
				
			}
			else if(Starter.equalsIgnoreCase("blastoise")) {
				String StarterRed ="SnivyII";
				
				Scanner f= new Scanner(System.in);
				String num;
				while(true) {
				System.out.println("                     1.Fight      2.Backpack");
				System.out.println("                     2.Pokemons   4.Escape");
				num =f.nextLine();
				if(num.equalsIgnoreCase("1")) {
					Scanner g =new Scanner(System.in);
					String ataque;
					while(true) {
						System.out.println("1."+Blastoise.getataque1()+"    2."+Blastoise.getataque2());
						System.out.println("3."+Blastoise.getataque3()+"    4."+Blastoise.getataque4());
						break;
					}
				}
				
				}
			}
			else if(Starter.equalsIgnoreCase("snivyii")) {
				String StarterRed ="Charizard";
				Scanner f= new Scanner(System.in);
				String num;
				while(true) {
				System.out.println("                     1.Fight      2.Backpack");
				System.out.println("                     2.Pokemons   4.Escape");
				num =f.nextLine();
				if(num.equalsIgnoreCase("1")) {
					Scanner g =new Scanner(System.in);
					String ataque;
					while(true) {
						System.out.println("1."+SnivyII.getataque1()+"    2."+SnivyII.getataque2());
						System.out.println("3."+SnivyII.getataque3()+"    4."+SnivyII.getataque4());
						
					}
				}
				
				}
				
			}
			
		}
		else {
			System.out.println("We are waiting for you.");
		}
		 
	}
	
		
}