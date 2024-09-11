package ClasseAbstrata;

public class Carro extends Veículos {
	
	
		public Carro(String placa, String modelo, String cor, int ano) {
			super(placa, modelo, cor, ano);
	}
	
	@Override
	public void acelerar() {
		System.out.println("A moto está acelerando");
	}
	@Override
	public void frear () {
		System.out.println("A moto está freiando");
	}
	@Override
	public void virar() {
		System.out.println("A moto está virando");
	}
	@Override
	public void ligar() {
		System.out.println("A moto está ligado");
	}

}
