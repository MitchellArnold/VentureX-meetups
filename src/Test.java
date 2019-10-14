public class Test {


    public static void doIt(){
        float x = 0;
        do{
            x++;
            String result = String.format("This is print #%.2f", x);
            System.out.println(result);
        }while(x < 5);
    }

    public static void doItMore(){
        double floatedNumber = 9.39393;
        String result = String.format("This number is %.2f and is two decimal places away from the integer.", floatedNumber);
        System.out.println(result);
    }



    public static void main(String [] args){
        System.out.println("\n\nWelcome to Testeroo:\n");
//        doIt();
        doItMore();
    }
}
