package practice;

public class PeakArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,3,2,1};
        System.out.println("peak value in array is: " +peak(arr1));
    }

    public static int peak(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //do 2 checks for finding out peak element
            //compare mid i.e current with mid+1
            if(arr[mid]<arr[mid+1]){//if mid+1 is greater than ur in ascending part of array
                start=mid+1;//so check from mid+1, coz u kn mid is lesser than mid+1
                //so no need of checking from mid . that's why mid+1
            }
            else{//arr[mid]>arr[mid+1] or
                end=mid;
            }
        }
        //loop breaks when mid is start==end, peak will be found.
        return arr[end];
    }


}
