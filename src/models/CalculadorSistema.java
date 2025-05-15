package models;

public class CalculadorSistema {
	ConfiguracaoSistema sistema;
	
	public CalculadorSistema(ConfiguracaoSistema system) {
		this.sistema = system;
	}
	
	//Métodos para cálculo 
	public float larguraBandaTeorica() {
		int largura = sistema.getLarguraBarramento();
		float frequencia = sistema.getFrequenciaBarramento();
		
		//cálculo realizado convertendo diretamente bits para byte e Mhz para Ghz
		return ((largura / 8.0f) * (frequencia / 1000.0f)); 
	}
	
	public float latenciaTotal() {
		int ciclos = sistema.getCiclosTransferencia();
		float frequencia = sistema.getFrequenciaBarramento();
		frequencia *= 1_000_000f; //Transforma para Hz
		
		return ciclos / (frequencia) * 1_000_000_000f; //retorna em ns
	}
	
	public double larguraBandaEfetiva() {
		int numeroDispositivos = sistema.getNumeroDispositivos();
		float eficiencia = 1.0f / (1 + 0.1f * (numeroDispositivos - 1));
		
		return larguraBandaTeorica() * eficiencia;
	}
	
	public int calcularCiclosTransferencia() {
	    int numDispositivos = sistema.getNumeroDispositivos();
	    return 2 + Math.max(0, numDispositivos - 1); // evita resultado menor que 2
	}
}
