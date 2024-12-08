
// Disciplina : Lógica de Programação | Introdução à Linguagem Java
// Professor : Lucy Mari
// Descrição : MULTIPLICACAO como uso de Procedimento (Parâmetro)
// Orientação: Com os conhecimentos adquiridos até agora, desenvolva um programa em Java que 
// declara variáveis inteiras, reais e String, 
// recebe dois números inteiros usando interface com usuário, 
// calcula o quociente da divisão dos dois números, a potência do primeiro número pelo segundo número e 
// mostra essas informações usando interface com usuário.
// Objetivos: Praticar lógica de programação e desenvolvimento de programa.
// Materiais, Métodos e Ferramentas: Para realizar este exercício, vamos utilizar Bloco de Notas e Prompt de Comando 
// para criar e testar o programa proposto no desenvolvimento da prática em questão.
// Autor(a) : Ana Laura Avila Queiroz
// Data atual : 07/12/2024

class Programa01
{
	public static void main (String entrada[])
	{
		//declaração de variáveis
		int NumInt;
		double NumReal, soma;
		char Caracter;
	
		//entrada de dados 
		NumInt = Integer.parseInt(entrada [0]); //converte em inteiro
		NumReal = Double.parseDouble(entrada[1]); //converte em real
		Caracter = (entrada[2]).charAt(0); // converte em caracter
		//processamento
		soma = (double)NumInt + NumReal;
		//saida de resultados
		System.out.println((double)NumInt + " + " + NumReal + " = " + soma + " sinal " + Caracter);
	
		System.exit(0);
	}
}





