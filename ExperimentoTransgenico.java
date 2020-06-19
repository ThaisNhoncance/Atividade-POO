package classes;
import classes.Angiospermas;
import interfaces.GeneVagalume;

public class ExperimentoTransgenico extends Angiospermas implements GeneVagalume {

	public ExperimentoTransgenico(String no, int ta, String cl, String es, boolean flo) {
		super(no, ta, cl, es, flo);
	}

	@Override
	public void fosforecer() {
		System.out.println("\nO experimento foi um sucesso! O(a) " + this.getNome() + " transg�nico adquiriu\nfosforec�ncia!\nAgora ele(a) brilha no escuro!"+
		"\n=======================================================================");
		
	}
	
	@Override
	public void corpoPlantae(){
		System.out.println("Defini��o:\nCorpo do(a) "+this.getNome()+
		" transg�nico possui: caule, flor, raiz, folha, fruto\ne semente.\n"+
		"=======================================================================");
	}
	
	@Override
	public String toString() {
		return "=======================================================================" +
		"\n"+this.getNome() +" transg�nico � da divis�o das Angiospermas!\n" +
		"\nPlantinha Info\n" + "Nome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm" +
		"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n"+ this.getNome() + 
		" transg�nico floresceu? " + this.getFloresceu() +
		"\n=======================================================================";
	}

}
