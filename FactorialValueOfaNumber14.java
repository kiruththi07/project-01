public class FactorialValueOfaNumber14 {
    public static void main(String args[]){
        int i;
        int fact=1;
        int number=10;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}