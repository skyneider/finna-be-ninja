
public class Personagem {

	
		public String codigo;
		private String nome;
		private String nascimento;
		
		
		public Personagem(String codigo, String nome, String nascimento )
		{
			this.codigo = codigo;
			this.nome = nome;
			this.nascimento = nascimento;

		}
		

		public String getCodigo() {
			return codigo;
		}

		public String getNome() {
			return nome;
		}

		public String getNascimento() {
			return nascimento;
		}
		
		public void printDadosBasicos()
		{
			System.out.println("Codigo: "+codigo);
			System.out.println("Nome: "+nome);
			System.out.println("Nascimento: "+nascimento);						
		}

		public void print()
		{
			System.out.println("Codigo: "+codigo);
			System.out.println("Nome: "+nome);
			System.out.println("Nascimento: "+nascimento);
		}
		
	}


