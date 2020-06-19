package classes;
import classes.Angiospermas;
import interfaces.GeneVagalume;

public class ExperimentoTransgenico extends Angiospermas implements GeneVagalume {

	public ExperimentoTransgenico(String no, int ta, String cl, String es, boolean flo) {
		super(no, ta, cl, es, flo);
	}

	@Override
	public void fosforecer() {
		System.out.println("\nO experimento foi um sucesso! O(a) " + this.getNome() + " transgênico adquiriu\nfosforecência!\nAgora ele(a) brilha no escuro!"+
		"\n=======================================================================");
		
	}
	
	@Override
	public void corpoPlantae(){
		System.out.println("Definição:\nCorpo do(a) "+this.getNome()+
		" transgênico possui: caule, flor, raiz, folha, fruto\ne semente.\n"+
		"=======================================================================");
	}
	
	@Override
	public String toString() {
		return "=======================================================================" +
		"\n"+this.getNome() +" transgênico é da divisão das Angiospermas!\n" +
		"\nPlantinha Info\n" + "Nome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm" +
		"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n"+ this.getNome() + 
		" transgênico floresceu? " + this.getFloresceu() +
		"\n=======================================================================";
	}

}
