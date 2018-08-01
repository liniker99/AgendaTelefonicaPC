package AgendaTelefonica;

public class TestaAgenda {

	public static void main(String[] args) {
		agendaTelefonica a = new agendaTelefonica();
		a.inserir("Liniker","99920-7058");
		a.inserir("Tio Sam","99912-9333");
		a.inserir("Chico Toin","3422-6969");
		a.inserir("Barbudo", "98801-0099");
		
		a.exibir();
		a.tamanho();
		System.out.println("Tem " +a.ta()+ " contatos na sua lista telefonica ");
		a.remover("Barbudo");
		System.out.println("Tem " +a.ta()+ " contatos na sua lista telefonica ");

	}

}
