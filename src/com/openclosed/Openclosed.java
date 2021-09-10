package com.openclosed;



import java.util.Comparator;

interface ValueComparator{
    /**
     * @return +ve if v1>v2, -ve if v1<v2, and zero if v1=v2;
     */
    int compare(int v1, int v2);

}


class ArrayUtil { // this is closed for modification but open for extension.
    public static final void sort(int a[], ValueComparator comparator){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(comparator.compare(a[i], a[j])>0) {
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
}




public class Openclosed {
    public static void main(String[] args) {
        int arr[] = {5,7,9,8,1,2,3,6,4,7};
        ArrayUtil.sort(arr, new DesComparator());
        System.out.println("Values in the array are: ");
        for(int i: arr){
            System.out.println(i);
        }
    }
}


class AscComparator implements ValueComparator{
    @Override
    public int compare(int v1, int v2){
        return v1-v2;
    }
}

class DesComparator implements ValueComparator{
    @Override
    public int compare(int v1, int v2){
        return v2-v1;
    }
}