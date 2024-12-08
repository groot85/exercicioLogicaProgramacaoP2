// Disciplina : Lógica de Programação | Introdução à Linguagem Java | Aula 13 - pratica | segundo programa Java
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

//nome da classe
class Programa02
{
	//modulo principal com a entrada pela linha de comando
	public static void main (String entrada[])
	{ 
		//declaração de variáveis LOCAIS - se quisesse globais, teria que ser logo abaixo do class
		int n1, n2, soma;
			
		//entrada de dados - o usuario digitara pela linha de comando
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);
		//processamento
		soma = n1 + n2;
		//saida de resultados
		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.exit(0);
	}
}





