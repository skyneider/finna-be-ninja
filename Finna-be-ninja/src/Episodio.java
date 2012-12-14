
public class Episodio {
	
	public String codigo;
	private String nome;
	private String temporada;
	
	
	public Episodio(String codigo, String nome, String temporada )
	{
		this.codigo = codigo;
		this.nome = nome;
		this.temporada = temporada;

	}
	

	public String getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTemporada() {
		return temporada;
	}
	
	public void printDadosBasicos()
	{
		System.out.println("Codigo: "+codigo);
		System.out.println("Nome: "+nome);
		System.out.println("Temporada: "+temporada);						
	}

	public void print()
	{
		System.out.println("Codigo: "+codigo);
		System.out.println("Nome: "+nome);
		System.out.println("Temporada: "+temporada);
	}
	
}
