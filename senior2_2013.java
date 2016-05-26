public class senior2_2013{
	//CCC senior problem #2 2013 Bridge Transport: url = http://cemc.uwaterloo.ca/contests/computing/2013/stage1/seniorEn.pdf
	public static void main (String[] args){
		int[] cars = new int[]{1,1,5000,10,40,50};
		System.out.println(bridge(100, 6, cars));
	}
	public static int bridge(int max, int n, int[]cars){
		int t = 0;
		int z = n;
		for (int i = 0; i<n; i++){
			t += cars[i];
			if (i>4){
				t -= cars[i-4];
			}
			if (t > max){
				z=i;
				break;	
			}
		}
		return z;

	}
}
