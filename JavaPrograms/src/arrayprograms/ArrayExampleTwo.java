package arrayprograms;

public class ArrayExampleTwo {

	public static void main(String[] args) {
		int[] num = {22,44,67,12,100};
		int max =num [0];         //max or largest =22
		
		for(int i=1; i<num.length; i++) {    //i=1,1<5
			
			if(num[i]>max) {     
				max =num[i];      //
			}
		}
		System.out.println("largest :"+max);
	
	}

}
