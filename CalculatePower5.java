public class CalculatePower5 {
    public static void main(String[] args){
        int base = 2;
        int exponent = 10;
        long result = 1;

        while(exponent != 0){
            result *= base;
            --exponent;
        }
        System.out.println("Answer:"+result);
    }
}
