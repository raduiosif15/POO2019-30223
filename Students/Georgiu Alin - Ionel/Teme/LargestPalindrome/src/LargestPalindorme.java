
public class LargestPalindorme {
	
	static int palindromFunction(int n) {
		int nrOglindit=0;
		while(n!=0) {
			nrOglindit=nrOglindit*10+n%10;
			n/=10;
		}
		return nrOglindit;
	}

	public static void main(String[] args) {
		
		int upLimit = 9999;
		int lowLimit = 1000;
		
		int maxProduct = 0;
		
		for(int i=upLimit;i>=lowLimit;i--) {
		
			for(int j=i;j>=lowLimit;j--) {
				
				int product=i*j;
				if(product < maxProduct)
					break;
	
				int nrOglindit=palindromFunction(product);
				
				if(product == nrOglindit && product >maxProduct)
					maxProduct=product;
			}
		}
		System.out.println(maxProduct); 

	}

}

/*
MaxProduct of 2 numbers each of 3 digits is 906609
MaxProduct of 2 numbers each of 4 digits is 99000099
*/