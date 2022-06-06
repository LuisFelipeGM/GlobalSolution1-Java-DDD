// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes

package fiap;

import java.time.LocalDate;

public class Cadastrado extends Usuario {

	private String nome;
	private String email;

	public Cadastrado() {}

	public Cadastrado(LocalDate dataAcesso, LocalDate dataNasc, String nome, String email) {
		super(dataAcesso, dataNasc);
		this.nome = nome;
		setEmail(email);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;  
	}

}
