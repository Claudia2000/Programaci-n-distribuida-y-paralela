package Secuencial;

public class Insercion {
	int nuevo_array[];
	public Insercion(int a[]) {//Recibir el arreglo
		
		/*int taman = a.length;
		for (int i=0;i<taman;i++) {
			nuevo_array[i]=a[i];
		}*/
		this.nuevo_array=a;
	}
	
	public void ordenar() {//Implementar el ordenameinto por inserion
		
		int n = nuevo_array.length;
        for (int i = 1; i < n; ++i) {
            int aux1 = nuevo_array[i];
            int aux2 = i - 1;
            
            while (aux2 >= 0 && nuevo_array[aux2] > aux1) {
            	nuevo_array[aux2 + 1] = nuevo_array[aux2];
                aux2 = aux2 - 1;
            }
            nuevo_array[aux2 + 1] = aux1;
        }
	}
}
