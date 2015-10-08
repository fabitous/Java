
public class Lista {

	int Conteudo;

	Lista next = null;
	
	Lista(int Conteudo) {
		
		this.Conteudo = Conteudo;
	}
	
	Lista(Lista l, int Conteudo) {
		
		this.Conteudo = Conteudo;
	}
	
	void push(int Conteudo, Lista p) {
		
		if(p.next == null) {
			
			p.next = new Lista(Conteudo);
		
		} else push(Conteudo, p.next);
	}
}
