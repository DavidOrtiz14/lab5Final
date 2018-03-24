package experimentalMainClasses;

import java.io.FileNotFoundException;
import java.util.Scanner;

import experimentalClasses.ExperimentController;
import experimentalClasses.StrategiesTimeCollection;
import sorterClasses.BubbleSortSorter;
import sorterClasses.CocktailSort;
import sorterClasses.CombSorter;
import sorterClasses.HeapSort;
import sorterClasses.InsertionSortSorter;
import sorterClasses.SelectionSortSorter;

public class TesterOpcion {
	private static int[] parms = {50, 1000, 50, 200};
	// min size, max size, size increment, number of trials per size/strategy
	private static Integer[] arr;
	public static void main(String[] args) throws CloneNotSupportedException {
		int opcion =0;
		ExperimentController ec = new ExperimentController(parms[0], parms[1], parms[2], parms[3]);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Option 1: a normal test.>>> \n"+"Option 2: a costume test.>>> \n"+"Option 3: a costume test with data input.>>> \n");
		opcion=sc.nextInt();
		
		if(opcion<3) {
			
		
		if(opcion==1) {
		if (args.length > 4) {
			System.out.println("Unexpected number of parameters. Must me <= 4.");
		}
		for (int i=0; i<args.length; i++) {
			parms[i] = Integer.parseInt(args[i]); 
		}
	          ec = new ExperimentController(parms[0], parms[1], parms[2], parms[3]);
		}
		else if(opcion ==2) {
	     System.out.println("(After each input press enter) Introduce: intialsize,final size,incremental,trials.");
			for (int i=0; i<4; i++) {
				parms[i] =sc.nextInt(); 
			}
			 ec = new ExperimentController(parms[0], parms[1], parms[2], parms[3]);
		}
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new BubbleSortSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new SelectionSortSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new InsertionSortSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new CombSorter<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new CocktailSort<Integer>()));
		ec.addStrategy(new StrategiesTimeCollection<Integer>(new HeapSort<Integer>()));
		
		
		/**/

		ec.run();    // run the experiments on all the strategies added to the controller object (ec)
		
		// save the results for each strategy....
		try {
			ec.saveResults();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	
		
		}
		else {
			 if( opcion ==3) {
			System.out.println("(After each input press enter) Introduce: intialsize,final size,incremental,trials.");
			for (int i=0; i<4; i++) {
				parms[i] =sc.nextInt(); 
			}
			System.out.println("Introduce data:\n"+"length of data first:");
			int n=sc.nextInt();
			arr= new Integer[n];
			for (int i=0; i<n; i++) {
				
				arr[i] =sc.nextInt(); 
			}
			ec = new ExperimentController(parms[0], parms[1], parms[2], parms[3],arr);
			ec.addStrategy(new StrategiesTimeCollection<Integer>(new BubbleSortSorter<Integer>()));
			ec.addStrategy(new StrategiesTimeCollection<Integer>(new SelectionSortSorter<Integer>()));
			ec.addStrategy(new StrategiesTimeCollection<Integer>(new InsertionSortSorter<Integer>()));
			ec.addStrategy(new StrategiesTimeCollection<Integer>(new CombSorter<Integer>()));
			ec.addStrategy(new StrategiesTimeCollection<Integer>(new CocktailSort<Integer>()));
			ec.addStrategy(new StrategiesTimeCollection<Integer>(new HeapSort<Integer>()));
			
			
			/**/

			ec.runWithData();    // run the experiments on all the strategies added to the controller object (ec)
			
			// save the results for each strategy....
			try {
				ec.saveResults();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			 }
		}
		// Parm1: initial size
		// Parm2: final size to consider
		// Parm3: incremental steps (size)
		// Parm4: trials per size
		 
		
		/**/	
		
	}
}
