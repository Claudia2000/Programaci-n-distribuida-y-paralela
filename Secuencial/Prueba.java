package Secuencial;

public class Prueba {
	public static void main(String[] args) {
		
		
		int arr1[] = {3,5,6,2,1,7,0,11,22,34};
		
		System.out.println("Array desordenado");
		imprimir(arr1);
		
		Insercion p1 = new Insercion(arr1);
		
		p1.ordenar();
		
		System.out.println("\nArray ordenado");
		imprimir(arr1);

	}

	private static void imprimir(int[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr1[i] + " ");
 
        System.out.println();
	}
}
