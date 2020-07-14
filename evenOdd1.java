public class evenOdd1 {
    public static void main(String[] args){
        int EnterNumber = 500;
        int Mod;

        Mod = EnterNumber%2;

        if (Mod == 0){
            System.out.println("This is EvenNumber");
        }
        else{
            System.out.println("This is OddNumber");
        }
    }
}
