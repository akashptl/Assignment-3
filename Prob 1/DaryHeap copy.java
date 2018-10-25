
public class DaryHeap {

	
	private int d; // Number oh children allowed
	private int [] a;
	private int isize = 10;
	private int size;
	
		DaryHeap(int d){
			
			this.d = d;
			a = new int[isize];
			size = 0;
			
		}
	
		
		public void insert(int k) {
			  
			if(size == isize) {
				
			isize = isize*2;
			int[] ND = new int[isize];
			
			for(int i = 0; i < size; i++) {
				ND[i] = a[i];
			}
				a = ND;
				
			}
			a[size++] = k;
			swim(size - 1);
		
		}
		
		private void swim(int k) {
			  
			while (k > 0 && a[k] > a[k-1/d]) {
			      
				swap(a[k], a[k-1/d]);
			    k = k-1/d;  
			}
			
		}
		
		private void swap(int m, int n) {
			
			int temp = a[m];
			a[m] = a[n];
			a[n] = temp;
		}
		

		public int delMax() {
			
			int maxv = a[0];
			swap(0, size-1);
			size --;
			sink(0);
			return maxv;
		}
		
		private void sink(int k) {
			
			while ((k*d+1) < size) {
				
				int i = max(k);
				if(a[i] > a[k]) {
					swap(k,i);
					k = i;
				}
				else {
					break;
				}
			}
		}
		
		public int[] dryHeapsort() {
			
			int[] sortedArray = new int[size];
			
			for(int i = 0; i < size; i ++) {
				
				sortedArray[i] = delMax();
			}
				return sortedArray;
		}
	
		
	private int max(int k) {
		
		int maxv = a[k];
		int maxi = k;
		
		for(int n = (k*d+1); n < size && n < (k*d+1)+d; n++) {
			
			if(a[n] > maxv) {
				maxi = n;
				maxv = a[n];
			}
		}
		return maxi;
				
	}	
		
	
}
