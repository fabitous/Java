
public class Main {

	static int[] vetorNaoOrdenado = {3,5,7,9,13,361,2,25,1,756,-2};
	static int[] vetorOrdenado;
	
	static void ordenarDoMenorProMaior(int item, Lista naoOrdenada) {
		
			if(item < naoOrdenada.Conteudo) {
				
				Lista deslocada = new Lista(naoOrdenada.Conteudo);
				naoOrdenada.Conteudo = item;
				deslocada.next = naoOrdenada.next;
				naoOrdenada.next = deslocada;
			
			} else {
			
				if(naoOrdenada.next == null) {
					
					naoOrdenada.push(item, naoOrdenada);
				
				} else	ordenarDoMenorProMaior(item, naoOrdenada.next);
			}
	}
	
	public static void main(String[] args) {

		Lista naoOrdenada = new Lista(vetorNaoOrdenado[0]);
		Lista Ordenada = new Lista(vetorNaoOrdenado[0]);
		
		for(int i = 1; i < vetorNaoOrdenado.length; i++) {

			naoOrdenada.push(vetorNaoOrdenado[i], naoOrdenada);
		}
		
		for(int i = 0; i < vetorNaoOrdenado.length; i++) {

			System.out.println(vetorNaoOrdenado[i]);
		}
		
		for(int i = 0; i < vetorNaoOrdenado.length; i++) {

			ordenarDoMenorProMaior(vetorNaoOrdenado[i], Ordenada);
		}
		
		for(int i = 0; i < vetorNaoOrdenado.length; i++) {

			System.out.println(Ordenada.Conteudo);
			Ordenada = Ordenada.next;
		}

	}

}
