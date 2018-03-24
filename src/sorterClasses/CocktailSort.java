package sorterClasses;
public class CocktailSort<E> extends AbstractSorter<E> {



 
 
	public CocktailSort() {
		super(" Cocktail Sort");
		// TODO Auto-generated constructor stub
	}
	/*
public static void main(String args[]) {
	int[] n = {3,5,6,1,2,8,0};
	int[] m = {3,5,6,1,2,8,};
	int[] final1 =relocateMaxValueToLastPositionAmongFirst(m);
	for(int f=0;f<final1.length;f++) {
		System.out.println(final1[f]);
	}

}
*/



	@Override
	protected void auxSort() {
		boolean termina =true;
		int St=0;
		int fi=arr.length;
		
		while(St<fi&&termina) {
			 termina=false;
			 
					for (int j=St; j < fi-1; j++) { 
						if (cmp.compare(arr[j], arr[j+1]) > 0) {
							super.swapArrayElements(j, j+1);
						termina=true;
						}
				}
			 fi--;
			 if(termina) {
				
			 
			 
			 termina = false;
			 
				   for (int  j=fi-1; j > St; j--) { 
					   if (cmp.compare(arr[j], arr[j-1]) < 0) {
							super.swapArrayElements(j, j-1);
						termina=true;
					   }
				}
			 }
				   St++;
			 }
     	  
				
			
		
		
		
		
		
		
		
			}
	

		
	

}