package models;

public class ValidadorEntrada {

	// Validação para o tipo de Processador (ARM ou x86)
	public static TipoProcessador validarTipoProcessador(String entrada) {
		try {
			return TipoProcessador.valueOf(entrada.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException("Tipo de processador inválido");
		}
	}

	// Validação da Frequência do barramento
	public static void validarFrequencia(double freq) {
		if (freq <= 0) {
			throw new IllegalArgumentException("Frequência deve ser positiva");
		}
	}

	// Validação da largura de Barramento
	public static void validarLarguraBarramento(int largura) {
		if (largura != 8 && largura != 16 && largura != 32 && largura != 64 && largura != 128) {
			throw new IllegalArgumentException("Largura de barramento inválida");
		}
	}

	// Validação do número de dispositivos conectados ao dispositivo
	public static void validarNumeroDispositivos(int numeroDispositivos) {
		if (numeroDispositivos <= 0) {
			throw new IllegalArgumentException("Número de dispositivos inválido");
		}
	}

	// Validação do número de ciclos por transferência
	public static void validarCiclos(int ciclos) {
		if (ciclos <= 0) {
			throw new IllegalArgumentException("Ciclos por transferência deve ser maior que zero");
		}
	}
}
