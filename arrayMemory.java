public class arrayMemory {
    public static void main(String[] args) {
        int[] a=new int[4];
        a[0]=50;
        a[1]=65;
        a[2]=20;
        a[3]=80;

        int[] b=a;
        //when we write this above line then a new variable called 'b' is created in te stack
        // memory, but there will be nothing in the heap memory.
        // IMP NOTE: Memory allocation for a variable happens in heap iff 'new' word is
        // used for that variable.
//Above we have just written b[]=a; have not used 'new' keyword for b,
// so 'b' will simply be the shallow copy of a and not the deep copy (deep copy means
// when you would have used 'new' keyword with b then a different array would have been created
// in stack memory of b and then we would have gotten its address into the b[] in stack memory.
//But here as we have not used 'new' keyword with b[] hence b is also referring to address of a[] in
// the heap. hence we call shallow copy.
// address of a copied into b (shallow copy).
// In Shallow copy, a copy of the original object is stored and only the reference address is
// finally copied. In Deep copy, the copy of the original object and the repetitive copies both
// are stored

//So above when you do : int  b[]=a;
//        then both are pointing to the same array in the heap
        //So when you did b[2]=100;
//        then value of a[2] also changed.
        b[2]=100;

        //So as a[] and b[] both looking "at the same address", If you change any index via any one,
//        i.e., a[] or b[], the changes will be reflected in both.

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for (int i=0;i<a.length;i++){
            System.out.print(b[i]+" ");
        }

        //Post running the code you will find both a[] and b[] = same, any change made at any
        // index will reflect in both the arrays.
    }
}
//Imp Note; Address stored in stack and objects in heap.
//New objects are always created in heap space, and the
// references to these objects are stored in stack memory.