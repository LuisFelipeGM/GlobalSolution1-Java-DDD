// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes

package fiap;

import java.time.LocalDate;

public class Anonimo extends Usuario {
	
	private String apelido;
	
	public Anonimo() {}

	public Anonimo(LocalDate dataAcesso, LocalDate dataNasc, String apelido) {
		super(dataAcesso, dataNasc);
		this.apelido = apelido;
	}

	public Anonimo(String apelido) {
		this.apelido = apelido;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	
}
