package ClasseAbstrata;

public class Cachorro extends Animal {
	
	public Cachorro (String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}

	@Override
	public void emitirSom() {
		System.out.println("O Cachorro está latindo");
	}
	@Override
	public void dormir() {
		System.out.println("O Cachorro está dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("O Cachorro está caminhando");
	}
	@Override
	public void correr () {
		System.out.println("O Cachorro está correndo");
	}
}



