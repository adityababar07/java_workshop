public class missing_in_array{
    public static void main(String[] args){
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        missing_in_array obj = new missing_in_array();
        System.out.println(obj.missingNum(arr));
    }
    int missingNum(int arr[]) {
        // code here
        long no_of_elements = arr.length +1;
        long expected_sum = (no_of_elements*(no_of_elements+1))/2;
        long real_sum = 0;
        for (int i=0; i<arr.length;i++){
            real_sum += arr[i];
        }
        return (int) (expected_sum-real_sum);
    }
}