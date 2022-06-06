// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes

package fiap;

import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Usuario {

	private LocalDate dataAcesso;
	private LocalDate dataNasc;

	public Usuario() {}
	
	public Usuario(LocalDate dataAcesso, LocalDate dataNasc) {
		this.dataAcesso = dataAcesso;
		this.dataNasc = dataNasc;
	}

	public LocalDate getDataAcesso() {
		return dataAcesso;
	}

	public void setDataAcesso(LocalDate dataAcesso) {
		this.dataAcesso = dataAcesso;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		LocalDate inicio = LocalDate.parse("1899-12-31");
		LocalDate fim = LocalDate.now();
		try {
			if (dataNasc.isAfter(inicio) && dataNasc.isBefore(fim)) {
				this.dataNasc = dataNasc;
			} else {
				throw new Exception("Data fora do período permitido");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			System.exit(0);
			
		}
	}
	
	public int calculaIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period idade = Period.between(dataNasc, dataAtual);
		return idade.getYears();
	}

}
