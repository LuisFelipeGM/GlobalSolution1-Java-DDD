// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes

package fiap;

public class Video {

	private String nomeProduto;
	private String personalidade;
	private int view;

	public Video() {}

	public Video(String nomeProduto, String personalidade, int view) {
		this.nomeProduto = nomeProduto;
		this.personalidade = personalidade;
		this.view = view;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public String getPersonalidade() {
		return personalidade;
	}

	public void setPersonalidade(String personalidade) {
		this.personalidade = personalidade;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}
	
	public void addView() {
		view++;
	}

}
