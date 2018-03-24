package sorterClasses;

public class CombSorter<E> extends AbstractSorter<E>{

	public CombSorter() {
		super("     Comb Sort");
		// TODO Auto-generated constructor stub
	}


	@Override
	protected void auxSort() {
		// TODO Auto-generated method stub
		
		int end =arr.length-1;
		
	
			for(int k=end;k>=0;k--) {
			for (int j=1; j <= k; j++) {
				
				if (cmp.compare(arr[j-1], arr[(j)]) > 0) {
					super.swapArrayElements(j-1, j);
					
				}
			}
			}
		
		
	}

}
