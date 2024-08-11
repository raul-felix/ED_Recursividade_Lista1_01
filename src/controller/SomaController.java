package controller;

public class SomaController {
	
	public SomaController() {
		super();
	}
	
	public int somaRecursiva(int n) {
		
		if (n <= 0) {
			// se N for igual ou menor a 0, ele retorna 0, já que o somatório de 0 é zero e números negativos devem retornar zero
			return 0;
		} else {
			// se não ele retorna N + a soma de (N - 1)
			// 5 + somaRecursiva(4)
			// 4 + somaRecursiva(3), etc
			return n + somaRecursiva(n - 1);			
		}
	}

}
