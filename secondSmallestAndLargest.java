public class secondSmallestAndLargest {
    public static void main(String[] args) {
    int arr[]={3,9,3,4,2,4,7,1,7,8};
    int n=arr.length;
   int[] result=getSecondOrderElements(n,arr);
        System.out.println("{"+result[0]+","+result[1]+"}");
    }
    public static int[] getSecondOrderElements(int n, int []a) {
    int max=a[0];
    int min=a[0];
        for(int i=0;i<a.length;i++){
        if(a[i]>max){
            max=a[i];
        }
    }
             for(int i=0;i<a.length;i++){
        if(a[i]<min){
            min=a[i];
        }

    }

    int secondLarget=max;
    boolean secondLargestFound=false;
    int secondSmallest=min;
    boolean secondSmallestFound=false;
    int countr1=a.length;
    int countr2=a.length;
        int ans1 = -1; // Initialize to -1 as all array elements =+ve
        int ans2 = -1; // Initialize to a value that won't be present in the array
while(countr1>0&&!secondLargestFound){
        secondLarget-=1;
        for(int i=0;i<a.length;i++){
            if(secondLarget==a[i]){
                ans1=a[i];
                secondLargestFound = true;
                break;
            }
        }
        countr1--;
    }
while(countr2>0&&!secondSmallestFound){
        secondSmallest+=1;
        for(int i=0;i<a.length;i++){
            if(secondSmallest==a[i]){
                 ans2=a[i];
                secondSmallestFound = true;
                break;
            }
        }
        countr2--;
    }

    int[] ans={ans1,ans2};
return ans;
}
}

