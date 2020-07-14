public class LeapYear2 {
    public static void main(String[] args){
        int year = 2000;

        if (year%4 ==0){
            if(year%100 ==0) {
                if(year% 400==0){
                    System.out.println("This is a Leap Year");

                    }
                else{
                    System.out.println("This is not a Leap Year");
                }
            }

        }

    }
}
