import java.awt.List;
import java.util.ArrayList;


public class Main {

	public static int[] array={7,11,6,3,5,9,0};
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int[] temp=new int[7];
		merge(array,temp, 0, 6);

		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
   
	}

	private static void merge(int[] list,int[]temp, int j, int k) {
		int mid=(j+k)/2;
		if(j<k){
		merge(list,temp, j, mid);
		merge(list, temp,mid+1, k);
		mergesort(list,temp,j,k);
		}
	}

	private static void mergesort(int[] list, int []temp ,int j, int k) {
		// TODO Auto-generated method stub
       
		int b=j;
		int mid=(j+k)/2;
		int m=j;
		int n=mid+1;
		while(m<=mid&&n<=k){
		if(list[m]<list[n]){
			temp[b++]=list[m++];
		}else{
			temp[b++]=list[n++];
		}
		}
		while(m<=mid){
			temp[b++]=list[m++];
		}
		while(n<=k){
			temp[b++]=list[n++];
		}
		
		for( b=j;b<=k;b++){
			array[b]=temp[b];
		}
	}
	
   

}
