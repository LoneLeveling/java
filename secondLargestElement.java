public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr={3,6,2,8,5,4};
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        int countr=arr.length;
        int secondMax=max;
        boolean secondMaxFound=false;
        while (countr>0&&!secondMaxFound){
            secondMax-=1;
            for (int i=0;i<arr.length;i++){
                if (secondMax==arr[i]){
                    System.out.println(secondMax);
                    secondMaxFound=true;
                    break;
                }
        }
            countr--;
        }
    }
}
