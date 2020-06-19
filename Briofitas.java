package classes;
import classes.Plantae;

public class Briofitas extends Plantae{

	public Briofitas(String no, int ta, String cl, String es){
		super(no,ta,cl,es);
	} 
	
	public void soltarEsporos() {
		System.out.println(this.getNome()+" est� soltando esporos!\n" +
		"=======================================================================");
	}
	
	@Override
	public void corpoPlantae(){
		System.out.println("Defini��o:\nCorpo do(a) "+this.getNome() +
		" possui: cauloide, rizoides e filoides.\n" +
		"=======================================================================");
	}
	
	@Override
	public String toString() {
		return "=======================================================================\n" + this.getNome() +
		" � da divis�o das Bri�fitas!\n" +
		"\nPlantinha Info" + "\nNome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm" +
		"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n" +
		"=======================================================================";
	}
}