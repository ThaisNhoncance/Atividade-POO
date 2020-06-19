package classes;
import classes.Plantae;

public class Pteridofitas extends Plantae{
    
	public Pteridofitas(String no, int ta, String cl, String es){
		super(no,ta,cl,es);
	} 
    
	@Override
	public void corpoPlantae(){
		System.out.println("Definição:\nCorpo do(a) "+this.getNome() +
		" possui: esporófito, raiz, caule, folhas,\ntrofofilos, esperofilas,"+
        " trofoesporofilos, isosporadas e\nheterosporadas.\n" +
        "=======================================================================");
	}
	
	@Override
	public String toString() {
		return "======================================================================="+
		"\n"+this.getNome() +" é da divisão das Pteridofitas!\n" +
		"\nPlantinha Info\n" + "Nome: " + this.getNome() + "\nTamanho: " + this.getTamanho() + "cm" +
		"\nClasse: " + this.getClasse() + "\nEspecie: " + this.getEspecie() + "\n"+
		"=======================================================================";
	}    
}