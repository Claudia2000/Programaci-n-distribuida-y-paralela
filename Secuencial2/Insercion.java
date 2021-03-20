package Secuencial2;

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
            int key = nuevo_array[i];
            int j = i - 1;
            
            while (j >= 0 && nuevo_array[j] > key) {
            	nuevo_array[j + 1] = nuevo_array[j];
                j = j - 1;
            }
            nuevo_array[j + 1] = key;
        }
	}
}
