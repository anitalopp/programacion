package EjemplosBidimensionales;

public class TorresHanoi {

	public static void mueveDisco(int numeroDiscos, char paloOrigen, char paloDestino, char paloAux) {
		if (numeroDiscos == 0) {
			System.out.println("Mover disco 1 desde " + paloOrigen + " a " + paloDestino);
		}
		mueveDisco(numeroDiscos-1, paloOrigen, paloAux, paloDestino);
		System.out.println("Mover disco " + numeroDiscos + " desde " + paloOrigen + " a " + paloDestino);
		mueveDisco(numeroDiscos - 1, paloAux, paloDestino, paloOrigen);
	}

	public static void main(String[] args) {
		
		int numeroDiscos = 3;
		
		mueveDisco(numeroDiscos, 'A', 'B', 'C');
	}
}
