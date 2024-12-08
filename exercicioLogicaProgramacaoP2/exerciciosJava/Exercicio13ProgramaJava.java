//nome da classe
class Exercicio13ProgramaJava
{
	//modulo principal com a entrada pela linha de comando
	public static void main (String inp[])
	{
		//declaração de variaveis
		int idade = 39;
		char genero = 'F';
		double peso = 52.4;
		String nome = "Ana Laura";
		String adj = inp[0];
		String curso = "Engenharia de Software";
				
		
		System.out.println("Eu sou a " + nome + ", " + adj + ", " + "tenho " + idade + " anos e peso " + peso + "kg." + " No momento, estou estudando " + curso + ".");
			
		System.exit(0);
	}
}