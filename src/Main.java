public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

     //task 1
byte box = 45;
short bananas = 445;
int oranges = 4444445;
long fruits = 4444444444444444445L;

float fruitWeight = 4.5f;
double vegetablesWeight = 4.5555555;

char c = 45;
boolean f = 30<45;


// task 2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес бойцов " + totalWeight + " кг");
        float weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе бойцов " + weightDifference + " кг");

// task 3

        int BananaWeight = 80 * 5;
        int milkWeight = 105 * 2;
        int iceCream = 100 * 2;
        int egg = 70 * 4;
        int productsWeight = BananaWeight + milkWeight + iceCream + egg;
        System.out.println("Вес спорт-завтрака " + productsWeight + " гр");
        int grPerKg = 1000;
        float presentImKg = productsWeight / (float) grPerKg;
        System.out.println(presentImKg + "кг");



        // task 4
        int loseWeight = 7;
        int presentInGr = 1000 * loseWeight;
        int weightLoss = 250;
        int day = presentInGr / weightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм потребуется " + day + "дней");
        int WeightLoss = 500;
        int Day = presentInGr / WeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм потребуется " + Day + "дней");
        int mean = (day + Day) / 2;
        System.out.println("Потребуется в среднем " + mean + " дней");










    }
}