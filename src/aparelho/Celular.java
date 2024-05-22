package aparelho;

import aplicativos.NavegadorInternet;
import aplicativos.ReprodutorMusical;
import aplicativos.Telefone;

public class Celular implements NavegadorInternet, ReprodutorMusical, Telefone{

	@Override
	public void tocar() {
		System.out.println("Tocar música");
	}

	@Override
	public void pausar() {
		System.out.println("Pausar música");
	}

	@Override
	public void selecionaMusica() {
		System.out.println("Selecionar música");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibir página");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizar página");
		
	}

	@Override
	public void ligar() {
		System.out.println("Ligando chamada");
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

	
}
