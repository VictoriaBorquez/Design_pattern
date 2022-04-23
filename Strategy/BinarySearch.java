import java.util.*;

public class BinarySearch implements SearchStrategy {

	@Override
	public void search(int[] arreglo, int numero) {
		System.out.println("BÚSQUEDA BINARIA!");
			int m;
        	int l = 0;
			int r = arreglo.length - 1;
			int flag = 0;
        	while(l <= r){
            	m = l + (r - l) / 2;
            	if(arreglo[m] == numero){
					System.out.println("El número se encuentra en el índice " + m + "\n");
					flag = 1;
				}
            	if (arreglo[m] < numero){
					l = m + 1;
				}
            	else{
					r = m - 1;
				}
        	}
			if(flag == 0){
				System.out.print("El número no se encuentra en el arreglo\n");
			}

	}
}
