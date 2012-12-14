
public class Main {
     public static void main(String[] args) {
		
		Personagem personagens[] = new Personagem[20];
		int ctPersonagens = 0;
		Episodio episodios[] = new Episodio[20];
		int ctEpisodios = 0;
			
		int op=0;
		do{
			op = Tela.scanInt("Digite a opção: \n" +
					"1- Cadastrar Personagens\n" +
					"2- Cadastrar Episódios\n" +
					"3- Consultar Personagens\n" +
					"4- Consultar Episódios\n" +
					"5- Sair");
			if(op==1){
				String codigo = Tela.scanString("Código:");
				String nome = Tela.scanString("Nome:");
				String nascimento = Tela.scanString("Data de Nascimento:");
				personagens[ctPersonagens++] = new Personagem(codigo, nome, nascimento);
			}
			if(op==2){
				String codigo = Tela.scanString("Código:");
				String nome = Tela.scanString("Nome:");
				String temporada = Tela.scanString("Temporada:");
				episodios[ctEpisodios++] = new Episodio(codigo, nome, temporada);
			}
			if (op==3){
					for (int i=0; i<ctPersonagens ; i++){
						personagens[i].print();
						}
					System.out.println("Personagens cadastrados:"+ctPersonagens);
				}
				else if (op==4){
					for (int i=0; i<ctEpisodios ; i++){
						episodios[i].print();
					}
					System.out.println("Episódios cadastrados:"+ctEpisodios);
				}
			
		}while (op>0 && op<4);		
     }		




     
     }
