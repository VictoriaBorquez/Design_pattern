public class SearchContext {

	private SearchStrategy strategy;

	public void setSearchMethod(SearchStrategy strategy) {
		this.strategy = strategy;
	}

	public SearchStrategy getStrategy() {
		return this.strategy;
	}

	public void searchNumbers(int[] arreglo, int numero){
		this.strategy.search(arreglo,numero);
	}
}
