package arrayprograms;

public class ArrayExample3 {

	public static void main(String[] args) {
		int[] number = {1,2,3,4,5,6};
		for(int i=0; i<number.length; i++) {    //0,0<6,1<6
			
			if(number[i]%2 ==0)     //false,true
			{
				System.out.println(number[i]);
			}
		}
	}

}
