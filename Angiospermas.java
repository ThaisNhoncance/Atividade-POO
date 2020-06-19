package classes;
import classes.Plantae;

public class Angiospermas extends Plantae {
	
	private boolean floresceu;
	
	public Angiospermas(String no, int ta, String cl, String es, boolean flo) {
		super(no, ta, cl, es);
		this.floresceu = flo;
	}
	
	public boolean getFloresceu() {
		return floresceu;
	}

	public void setFloresceu(boolean flo) {
		this.floresceu = flo;
	}
	
	@Override
	public void corpoPlantae(){
		System.out.println("\nDefinição:\nCorpo do(a) "+this.getNome() +
		" possui: caule, flor, raiz, folha, fruto e semente.\n" +
		"=======================================================================");
	}
	
	@Override
	public String toString() {
		return "=======================================================================\n"+ this.getNome() +
		" é da divisão das Angiospermas!\n" +
		"\nPlantinha Info\n" + "Nome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm" +
		"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n"+ this.getNome() + 
		" floresceu? " + this.getFloresceu() +
		"\n=======================================================================";
	}
}