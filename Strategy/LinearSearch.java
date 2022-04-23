import java.util.*;

public class LinearSearch implements SearchStrategy {

	@Override
	public void search(int[] arreglo, int numero) {
		System.out.println("BÚSQUEDA LINEAL!");

		int i;
		int flag = 0;
        for(i = 0; i < arreglo.length; i++){
            if(arreglo[i] == numero){
				System.out.print("El número se encuentra en el índice " + i + "\n");
				flag = 1;
			}
        }
		if(flag == 0){
			System.out.print("El número no se encuentra en el arreglo\n");
		}


	}
}
