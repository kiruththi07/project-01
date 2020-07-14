public class SumOfAnArray8 {
    public static void main(String[] args){
        int [] Array = {10,30,40,20,20};
        int sum =0;

        for(int num:Array){
            sum = sum+num;
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
