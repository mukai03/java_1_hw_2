import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(canWeGoWalk(30, 10));
        System.out.println(canWeGoWalk(20, 30));
        System.out.println(canWeGoWalk(20, 45));
        System.out.println(canWeGoWalk(10, 10));
        System.out.println(canWeGoWalk(20, -30));
        System.out.println(canWeGoWalk(generateRandomAge(), 25));
    }

    public static String canWeGoWalk(int age, int temperature){
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
            return "Можно идти гулять";
        }else if (age <= 20 && temperature >= 0 && temperature <= 28){
            return "Можно идти гулять";
        }else if (age >= 45 && temperature >= -10 && temperature <= 25){
            return "Можно идти гулять";
        }else {
            return "Оставайтесь дома";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int randomAge = random.nextInt(100);
        System.out.println(randomAge);
        return randomAge;
    }
}

