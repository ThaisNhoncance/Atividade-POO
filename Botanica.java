package classes;

public class Botanica {
   
	public static void main(String[] args) {
		
		System.out.println("______ _             _   _       _             _____ _                \r\n" + 
							"| ___ \\ |           | | (_)     | |           |_   _(_)               \r\n" + 
							"| |_/ / | __ _ _ __ | |_ _ _ __ | |__   __ _    | |  _ _ __ ___   ___ \r\n" + 
							"|  __/| |/ _` | '_ \\| __| | '_ \\| '_ \\ / _` |   | | | | '_ ` _ \\ / _ \\\r\n" + 
							"| |   | | (_| | | | | |_| | | | | | | | (_| |   | | | | | | | | |  __/\r\n" + 
							"\\_|   |_|\\__,_|_| |_|\\__|_|_| |_|_| |_|\\__,_|   \\_/ |_|_| |_| |_|\\___|\r\n" + 
							"                                                                     \n"+
							"=======================================================================\n\n\n");
		
		//Briofitas Time!
		Briofitas b1 = new Briofitas("Musgo", 2, "Bryopsida", "Bryophyta sensu stricto");
		System.out.print(b1.toString());
		//Overload
		b1.setTamanho(2.7);
		System.out.println("\n"+b1.getNome()+" Cresceu!!");
		System.out.print(b1.toString());
		//End
		b1.tomarSol();
		b1.soltarEsporos();
		b1.corpoPlantae();
		System.out.println("\n\n\n\n\n\n");
		//End
		
		//Pteridofitas Time!
		Pteridofitas p1 = new Pteridofitas("Cabelo-de-Vênus", 40, "Pteridopsia", "A. capillus-veneris");
		System.out.println(p1.toString());
		p1.corpoPlantae();
		System.out.println("\n\n\n\n\n\n");
		//End
		
		//Angiospermas Time!
		Angiospermas a1 = new Angiospermas("Tabaco", 60, "Magnoliopsida", "Nicotiana tabacum", false);
		System.out.print(a1.toString());
		a1.corpoPlantae();
		System.out.println("\n\n\n\n\n\n");
		//End
		
		//Experimento Transgenico Time!
		ExperimentoTransgenico et1 = new ExperimentoTransgenico("Tabaco", 7, "", "", true);
		System.out.print(et1.toString());
		et1.fosforecer();
		et1.corpoPlantae();
		//End
		
	}
	
}