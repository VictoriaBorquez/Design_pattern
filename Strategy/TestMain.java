public class TestMain {

	public static void main(String[] args) {

		int arreglo[] = {2,3,4,10,40};
		int numeroBuscado = 10;

		System.out.println("**************************");
		System.out.println("Ejemplo de Patron Strategy");
		System.out.println("**************************");

		SearchContext context = new SearchContext();
		context.setSearchMethod(new BinarySearch());
		context.searchNumbers(arreglo, numeroBuscado);

		System.out.println("**************************");
		context.setSearchMethod(new LinearSearch());
		context.searchNumbers(arreglo, numeroBuscado);

	}
}
