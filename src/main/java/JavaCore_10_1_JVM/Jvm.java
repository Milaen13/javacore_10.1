package JavaCore_10_1_JVM;

class JvmComprehension {

    public static void main(String[] args) {

        int i = 1;                      //во фрейм main в стек сохраняеться переменная int i со значением 1.
        Object o = new Object();        //создается объект Object во фрейм main создается переменная o, присваивается ссылка
        Integer ii = 2;                 //в стек создается объект Integer со значением 2
        printAll(o, i, ii);             //в стек создается фрейм printAll передаем ссылки на o, i, ii
        System.out.println("finished"); //в стек создается фрейм println со значением "finished"
    }

    private static void printAll(Object o, int i, Integer ii) {
        Integer uselessVar = 700;                   //в стек создается объект Integer со значением 700 во фрейм printAll создается переменная Integer
        System.out.println(o.toString() + i + ii);  //в стек создается фрейм println передаем ссылку на o, i, ii
    }
}