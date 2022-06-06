// RM: 94615  Nome: Daniel Henrique Alcantara Oliveira Martins
// RM: 94051  Nome: Luís Felipe Garcia Menezes

package fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class UsaSuper {
	public static void main(String[] args) {
		LocalDate dataAtual = LocalDate.now(), dataNasc;
		String aux, apelido, escolha = "sim", dataFormatada1, dataFormatada2, dataAcesso1, dataAcesso2;
		int menu;
		DateTimeFormatter dft;
		
		
		try {
			// CADASTRO
			Cadastrado cad = new Cadastrado();
			cad.setNome("Daniel Henrique");
			cad.setEmail("daniel@gmail.com");
			aux = "2004-05-17";
			dataNasc = LocalDate.parse(aux);
			cad.setDataNasc(dataNasc);
			cad.setDataAcesso(dataAtual);
			
			// ANONIMO
			apelido = "Luis Felipe";
			aux = "2003-09-01";
			dataNasc = LocalDate.parse(aux);
			Anonimo nimo = new Anonimo(dataAtual, dataNasc, apelido);
			
			dft= DateTimeFormatter.ofPattern("dd-MM-yyyy");
			
			dataFormatada1 = cad.getDataNasc().format(dft);
			dataAcesso1 = cad.getDataAcesso().format(dft);
			dataFormatada2 = nimo.getDataNasc().format(dft);
			dataAcesso2 = nimo.getDataAcesso().format(dft);
			
			
			//VIDEO 1
			Video video1 = new Video();
			video1.setNomeProduto("Celular Xiaomi");
			video1.setPersonalidade("Neymar Jr.");
			video1.setView(1000);
			
			//VIDEO 2
			Video video2 = new Video();
			video2.setNomeProduto("Microondas Brastemp");
			video2.setPersonalidade("Percy Spencer (criador)");
			video2.setView(0);
			
			while (escolha.equalsIgnoreCase("sim")) {
				
				aux = JOptionPane.showInputDialog("Deseja Visualizar um vídeo apresentado por: "
						+ "\n(1) um(a) famoso(a) \n(2) um(a) técnico(a)");
				menu = Integer.parseInt(aux);
				
				switch (menu) {
				
				case 1:
					video1.addView();
					JOptionPane.showMessageDialog(null, "Exibindo Vídeo \nNome do produto: " + video1.getNomeProduto() 
					+ "\nApresentado por: " + video1.getPersonalidade());
					break;
					
				case 2:
					video2.addView();
					JOptionPane.showMessageDialog(null, "Exibindo Vídeo \nNome do produto: " + video2.getNomeProduto() 
					+ "\nApresentado por: " + video2.getPersonalidade());
					break;

				default:
					break;
				}
				
				escolha = JOptionPane.showInputDialog("Deseja continuar o Programa?");
			}
			
			JOptionPane.showMessageDialog(null, "Exibindo Informações finais"
					+ "\nUsuário Cadastrado: \nData de Acesso: " + dataAcesso1 + "\nNome: " + cad.getNome()
					+ "\nE-mail: " + cad.getEmail() + "\nData de Nascimento: " + dataFormatada1 + "\nIdade: " + cad.calculaIdade()
					+ "\n \nUsuário Anônimo: \nData de Acesso: " + dataAcesso2 + "\nApelido: " + nimo.getApelido()
					+ "\nData de Nascimento: " + dataFormatada2 + "\nIdade: " + nimo.calculaIdade() + "\n \nVideo de Famoso(a): "
					+ "\nNome do Produto: " + video1.getNomeProduto() + "\nApresentado por: " + video1.getPersonalidade() + "\nTotal de visualizações: "
					+ video1.getView() + "\n \nVideo Técnico(a): \nNome do Produto: " + video2.getNomeProduto() + "\nApresentado por: "
					+ video2.getPersonalidade() + "\nTotal de visualizações: " + video2.getView() );
			
			
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

}
