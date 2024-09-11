package ClasseAbstrata;

public class NovoCarro extends Veículos {

	public NovoCarro(String placa, String modelo, String cor, int ano) {
		super(placa, modelo, cor, ano);
	}

	@Override
	public void acelerar() {
		System.out.println("O novo carro está acelerando");
	}
	@Override
	public void frear () {
		System.out.println("O novo carro está freiando");
	}
	@Override
	public void virar() {
		System.out.println("O novo carro está virando");
	}
	@Override
	public void ligar() {
		System.out.println("O novo carro está ligado");
	}

}
