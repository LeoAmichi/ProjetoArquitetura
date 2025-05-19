package models;

public class ConfiguracaoSistema {

	// Atributos de entrada do Sistema
	private TipoProcessador tipo;
	private int larguraBarramento;
	private float frequenciaBarramento;
	private int numeroDispositivos;
	private int ciclosTransferencia;

	// Construtor da classe inicializando os atributos
	public ConfiguracaoSistema(TipoProcessador tipo, int larguraBarramento, float frequenciaBarramento,
			int numeroDispositivos, int ciclosTransferencia) {
		this.tipo = tipo;
		this.larguraBarramento = larguraBarramento;
		this.frequenciaBarramento = frequenciaBarramento;
		this.numeroDispositivos = numeroDispositivos;
		this.ciclosTransferencia = ciclosTransferencia;
	}

	// Getters and Setters dos atributos
	public TipoProcessador getTipo() {
		return tipo;
	}

	public void setTipoProcessador(TipoProcessador tipo) {
		this.tipo = tipo;
	}

	public int getLarguraBarramento() {
		return larguraBarramento;
	}

	public void setLarguraBarramento(int larguraBarramento) {
		this.larguraBarramento = larguraBarramento;
	}

	public float getFrequenciaBarramento() {
		return frequenciaBarramento;
	}

	public void setFrequenciaBarramento(float frequenciaBarramento) {
		this.frequenciaBarramento = frequenciaBarramento;
	}

	public int getNumeroDispositivos() {
		return numeroDispositivos;
	}

	public void setNumeroDispositivos(int numeroDispositivos) {
		this.numeroDispositivos = numeroDispositivos;
	}

	public int getCiclosTransferencia() {
		return ciclosTransferencia;
	}

	public void setCiclosTransferencia(int ciclosTransferencia) {
		this.ciclosTransferencia = ciclosTransferencia;
	}

	// Método ToString() para verificar se está tudo correto
	@Override
	public String toString() {
		return "ConfiguracaoSistema [tipoProcessador=" + tipo + ", larguraBarramento=" + larguraBarramento
				+ ", frequenciaBarramento=" + frequenciaBarramento + ", numeroDispositivos=" + numeroDispositivos
				+ ", ciclosTransferencia=" + ciclosTransferencia + "]";
	}

}
