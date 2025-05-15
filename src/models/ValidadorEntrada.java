package models;

public class ValidadorEntrada {
	
	public static TipoProcessador validarTipoProcessador(String entrada) {
		try {
			return TipoProcessador.valueOf(entrada.toUpperCase());
		} catch(IllegalArgumentException e) {
			throw new IllegalArgumentException("Tipo de processador inválido");
		}
	}

	public static void validarFrequencia(double freq) {
		if (freq <= 0) {
			throw new IllegalArgumentException("Frequência deve ser positiva");
		}
	}

	public static void validarLarguraBarramento(int largura) {
		if (largura != 8 && largura != 16 && largura != 32 && largura != 64 && largura != 128) {
			throw new IllegalArgumentException("Largura de barramento inválida");
		}
	}

	public static void validarNumeroDispositivos(int numeroDispositivos) {
		if (numeroDispositivos <= 0) {
			throw new IllegalArgumentException("Número de dispositivos inválido");
		}
	}

	public static void validarCiclos(int ciclos) {
		if (ciclos <= 0) {
			throw new IllegalArgumentException("Ciclos por transfêrencia deve ser maior que zero");
		}
	}
}
