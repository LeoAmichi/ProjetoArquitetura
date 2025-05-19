package program;

import models.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Entrada de dados pelo terminal
		System.out.println("Digite o tipo do processador: ");
		String tipo = scan.nextLine();

		System.out.println("Digite a largura do barramento de dados (bits): ");
		int largura = scan.nextInt();

		System.out.println("Digite a frequência do barramento (Mhz):");
		float frequencia = scan.nextInt();

		System.out.println("Digite o número de dispositivos conectados: ");
		int dispositivos = scan.nextInt();

		System.out.println("Digite a quantidade de ciclos por transferência: ");
		int ciclos = scan.nextInt();

		// Validações dos atributos
		TipoProcessador tipoProcessador = ValidadorEntrada.validarTipoProcessador(tipo);
		ValidadorEntrada.validarLarguraBarramento(largura);
		ValidadorEntrada.validarFrequencia(frequencia);
		ValidadorEntrada.validarNumeroDispositivos(dispositivos);
		ValidadorEntrada.validarCiclos(ciclos);

		// Instância do Objeto ConfiguraçãoSistema e CalculadorSistema
		ConfiguracaoSistema sistema = new ConfiguracaoSistema(tipoProcessador, largura, frequencia, dispositivos, ciclos);
		CalculadorSistema calculador = new CalculadorSistema(sistema);

		// Saída de dados pelo terminal
		System.out.println("==========CÁLCULOS DO SISTEMA==========");
		System.out.println("Bandwidth do sistema: " + calculador.larguraBandaTeorica() + "GB/s");
		System.out.println("Latência máxima do sistema: " + calculador.latenciaTotal() + "ns");
		System.out.printf("Largura de banda efetiva: %.2fGB/s%n", calculador.larguraBandaEfetiva());
		System.out.println("Número de ciclos por transferência: " + calculador.calcularCiclosTransferencia());

		scan.close();
	}
}
