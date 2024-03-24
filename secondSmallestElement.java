public class secondSmallestElement {
    public static void main(String[] args) {
        int[] arr={8,4,6,3,5};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        int secondSmallest=min;
        int countr=arr.length;
        boolean foundSecondSmallest=false;
        while(countr>0&&!foundSecondSmallest){
            secondSmallest+=1;
            for (int i=0;i<arr.length;i++){
                if(secondSmallest==arr[i]){
                    System.out.println(secondSmallest);
                    foundSecondSmallest=true;
                    break;
                }
            }
        }

    }
}
