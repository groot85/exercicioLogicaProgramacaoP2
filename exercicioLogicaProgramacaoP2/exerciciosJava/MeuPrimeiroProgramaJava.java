//nome da classe
class MeuPrimeiroProgramaJava
{
	//modulo principal com a entrada pela linha de comando
	public static void main (String inp[])
	{
		//declaração de variaveis
		int inteiro = 39     ;
		char caracter = 'F';
		double real = 1.67;
		String nome = "Ana Laura";
		String adj = inp[0];
		boolean VF=true;
		
		if (VF == true)
		{
			System.out.println("Eu sou a " + nome + ", " + adj + " tenho " + inteiro + " anos e tenho " + real + "m de altura");
		}
		
		System.exit(0);
	}
}