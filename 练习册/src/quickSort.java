
public class quickSort {
	static void quickSort(int[] arr,int left,int right)			//���������㷨
	{
	    int f,t;
		int rtemp,ltemp;

	    ltemp=left;
	    rtemp=right;
	    f=arr[(left+right)/2];						//�ֽ�ֵ
		while(ltemp<=rtemp)
		{
	        while(arr[ltemp]<f)
			{
				++ltemp;
			}
	        while(arr[rtemp]>f) 
			{
				--rtemp;
			}
	        if(ltemp<=rtemp)
	        {
				t=arr[ltemp];
		        arr[ltemp]=arr[rtemp];
	    	    arr[rtemp]=t;
				--rtemp;
	        	++ltemp;
			}
	    }
	    if(ltemp==rtemp) 
		{
			ltemp++;
		}

	    if(left<rtemp) 
		{
			quickSort(arr,left,ltemp-1);			//�ݹ����
		}
	    if(ltemp<right) 
		{
			quickSort(arr,rtemp+1,right);			//�ݹ����
		}
	}
	
	public static void main(String[] args){
		int a[] ={8,5,9,5,7,1,3,7,5} ;
		
		quickSort(a, 0, a.length-1);
		for(int i = 0;i<a.length;i++)
		System.out.print(a[i]);
	}

}
