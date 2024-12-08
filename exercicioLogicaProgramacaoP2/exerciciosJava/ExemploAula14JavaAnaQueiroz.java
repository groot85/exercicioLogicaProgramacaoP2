// Programa03
// Disciplina : Lógica de Programação | Introdução à Linguagem Java
// Professor : Lucy Mari
// Descrição : Mostrando como usar Swing
// Orientação: Com os conhecimentos adquiridos até agora, desenvolva um programa em Java que 
// declara variáveis inteiras, reais e String, 
// recebe dois números inteiros usando interface com usuário, 
// calcula o resto da divisão dos dois números, 
// a raiz quadrada do primeiro número e do segundo número
// mostra essas informações usando interface com usuário - SWING.
// Objetivos: Praticar lógica de programação e desenvolvimento de programa.
// Materiais, Métodos e Ferramentas: Para realizar este exercício, vamos utilizar Bloco de Notas e Prompt de Comando 
// para criar e testar o programa proposto no desenvolvimento da prática em questão.
// Autor(a) : Ana Laura Avila Queiroz
// Data atual : 07/12/2024

//importando a biblioteca swing - interface de usuario
//quando coloco .* quer dizer que estou trazendo tudo dessa biblioteca para cá
import javax.swing.*;

class ExemploAula14JavaAnaQueiroz
{
	public static void main (String entrada[])
	{
		//declara variáveis
		int n1, n2, mod;
		double raiz1, raiz2;
		String msg="";
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro"));
		//processamento
		mod = n1 % n2;
		raiz1 = Math.sqrt(n1);
		raiz2 = Math.sqrt(n2);
		
		//saida de resultados
		msg = msg + "resto da divisão de " + n1 + " por " + n2 + " = " + mod + "\n";
		msg = msg + "raiz quadrada de " + n1 + " = " + raiz1 + "\n";
		msg = msg + "raiz quadrada de " + n2 + " = " + raiz2 + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}
