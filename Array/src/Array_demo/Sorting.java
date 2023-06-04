package Array_demo;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sorting s = new Sorting();
		
//		s.BubbleSorting();
//		s.LinearSearch();
		s.BinarySearch();
		
		
		
	}

	private void BinarySearch() {
		// TODO Auto-generated method stub
		int[] ar = {26,24,8,4,1};
		  //      0  1  2 3 4
		int key = 18; 
		int min = 0, max = ar.length-1;
		//min = 0    max = 4    mid = 2
		//min = 0    max = 1    mid = 0
		//min = 1   max = 1    mid = 1
		while(min<=max)
		{
		  int mid = (min+max)/2;
		  if(key==ar[mid])
		  {
		    System.out.println("Yes key is Present at "+ mid+" Index.");
		    break;
		  }
		  else if(key>ar[mid]) //24>26
		  {
		    max = mid-1; //max = 1
		  }
		  else
		  {
		    min = mid+1; //min = 1
		  }

		}
		if(min>max)
		{
		  System.out.println("Key is not present");
		}
	}

	private void LinearSearch() {
		// TODO Auto-generated method stub
		
	}

	private void BubbleSorting() {
		// TODO Auto-generated method stub
		
		int[] ar={10,7,3,1};
        System.out.println("Before Swap");

        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        for (int j=1;j<=ar.length-1;j++)
        {
            for (int i=0;i<ar.length-j;i++)
            {
                if (ar[i]>ar[i+1])
                {
                    int temp= ar[i];
                    ar[i]=ar[i+1];
                    ar[i+1]=temp;

                }
            }
        }

        System.out.println("After Swap");
        for (int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }	
		
	}

}
