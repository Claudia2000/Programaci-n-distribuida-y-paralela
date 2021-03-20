package Secuencial2;

public class Prueba {
	public static void main(String[] args) {
		
		int TOPE = 10;
		int arr[];
		for(int n=1;n<=TOPE;n++) {
			//generar un arreglo de tamano "n"
			arr = generar(n);
			System.out.println("Array desordenado");
			imprimir(arr);
			Insercion p1 = new Insercion(arr);			
			p1.ordenar();
			System.out.println("Array ordenado");
			imprimir(arr);	
			System.out.println("\n");
		}		

	}

	//Generar arreglos de peores casos
	//Ejemplo: Si n=5 0> arr={5,4,3,2,1}
	private static int[] generar(int n) {
		// TODO Auto-generated method stub
		int arrnew[]= new int[n];
		int aux1=n;
        for (int i = 0; i < n; ++i) {
        	arrnew[i]=aux1;
        	aux1=aux1-1;
        }
		return arrnew;
	}

	private static void imprimir(int[] arr1) {
		// TODO Auto-generated method stub
		int n = arr1.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr1[i] + " ");
 
        System.out.println();
	}
}
