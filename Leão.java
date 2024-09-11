package ClasseAbstrata;

public class Leão extends Animal {
	
	public Leão (String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O leão está ruge");
	}
	@Override
	public void dormir() {
		System.out.println("O leão está dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("O leão está caminhando");
	}
	@Override
	public void correr () {
		System.out.println("O leão está correndo");
	}


}



