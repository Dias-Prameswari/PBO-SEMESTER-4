public class MainMerge {
    public static void main(String[] args) {
        int[] inputArr = {7,1,3,5,2};
        merge mms = new merge(inputArr);
        mms.tampil();
        mms.mergeSort(0,inputArr.length-1);
        mms.tampil();
    }
}