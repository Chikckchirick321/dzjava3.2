public class Main {
    public static void main(String[] args) {



        BmiService service = new BmiService();

        // int weight = 98;
        // float height = 1.87F;


        int bmi = service.calculate(1.87F,98);
        System.out.println(bmi);


    }
}