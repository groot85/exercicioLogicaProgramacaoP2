// Disciplina : Lógica de Programação | Introdução à Linguagem Java
// Professor : Lucy Mari
// Descrição : divisao e potencia com Procedimento (Parâmetro)e Swing
// Orientação: Com os conhecimentos adquiridos até agora, desenvolva um programa em Java que 
// declara variáveis inteiras, reais e String, 
// recebe dois números inteiros usando interface com usuário, 
// calcula o quociente da divisão dos dois números, a potência do primeiro número pelo segundo número e mostra essas informações usando interface com usuário.
// Objetivos: Praticar lógica de programação e desenvolvimento de programa.
// Materiais, Métodos e Ferramentas: Para realizar este exercício, vamos utilizar Bloco de Notas e Prompt de Comando 
// para criar e testar o programa proposto no desenvolvimento da prática em questão.
// Autor(a) : Ana Laura Avila Queiroz
// Data atual : 07/12/2024


//importando a biblioteca swing - interface de usuario
//quando coloco .* quer dizer que estou trazendo tudo dessa biblioteca para cá
import javax.swing.*;
class ativPratica14JavaAnaQueiroz
{
	public static void main (String entrada[])
	{
		//declara variáveis
		int n1, n2, divisao;
		double potencia;
		String msg="";
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro", "Escreva aqui!"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro", "Escreva aqui"));
		//processamentocm
		divisao = (int)n1 / (int)n2;
		potencia = Math.pow(n1,n2);
		
		//saida de resultados
		msg = msg + "quociente da divisão de " + n1 + " por " + n2 + " = " + divisao + "\n";
		msg = msg + "potência de " + n1 + " por " + n2 + " = " + potencia + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		System.exit(0);
	}
}
