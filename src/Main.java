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

        // task 5
        int MSelery = 67_760;
        float MSeleryInc = MSelery * 0.1f;
        float MNewSelery = MSelery + MSeleryInc;
        System.out.println("Маша теперь получает " + MNewSelery + " рублей");
        int month = 12;
        int MSeleryYear = MSelery * month;
        float MNewSelYear = MNewSelery * month;
        float MAnnualIncome = MNewSelYear - MSeleryYear;
        System.out.println("Годовой доход вырос на " + MAnnualIncome + " рублей");

        int DSelery = 83690;
        float DSeleryInc = DSelery * 0.1f;
        float DNewSelery = DSelery + DSeleryInc;
        System.out.println("Денис теперь получает " + DNewSelery + " рублей");
        int DSeleryYear = DSelery * month;
        float DNewSelYear = DNewSelery * month;
        float DAnnualIncome = DNewSelYear - DSeleryYear;
        System.out.println("Годовой доход вырос на " + DAnnualIncome + " рублей");

        int KSelery = 76230;
        float KSeleryInc = KSelery * 0.1f;
        float KNewSelery = KSelery + KSeleryInc;
        System.out.println("Кристина теперь получает " + KNewSelery + " рублей");
        int KSeleryYear = KSelery * month;
        float KNewSelYear = KNewSelery * month;
        float KAnnualIncome = KNewSelYear - KSeleryYear;
        System.out.println("Годовой доход вырос на " + KAnnualIncome + " рублей");














    }
}