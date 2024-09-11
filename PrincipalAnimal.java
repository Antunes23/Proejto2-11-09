package ClasseAbstrata;

public class PrincipalAnimal {

	public static void main(String[] args) {

		Leão Africano = new Leão("Alfredo", "m", "Leão");
		Africano.dormir();
		Africano.caminhar();
		Africano.correr();
		Africano.emitirSom();


		System.out.println("---------------------------------------------------");

		Lobo HuskySiberiano = new Lobo("Carlos", "m", "Lobo");
		HuskySiberiano.dormir();
		HuskySiberiano.caminhar();
		HuskySiberiano.correr();
		HuskySiberiano.emitirSom();


		System.out.println("------------------------------------------------------");



		Tigre Siberiano = new Tigre("José", "m", "Tigre");
		Siberiano.dormir();
		Siberiano.caminhar();
		Siberiano.correr();
		Siberiano.emitirSom();
		
		
		System.out.println("---------------------------------------------------------");



		Cachorro Salsisha = new Cachorro("Abreu", "m", "Cachorro");
		Salsisha.dormir();
		Salsisha.caminhar();
		Salsisha.correr();
		Salsisha.emitirSom();
		
		
		System.out.println("----------------------------------------------------------");
		
	
		Gato Persa = new Gato("Luke", "m", "Gato");
		Persa.dormir();
		Persa.caminhar();
		Persa.correr();
		Persa.emitirSom();

	}
}

