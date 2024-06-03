package lesson2;

public class HomeWork1 {
    public static void main(String[] args) {
        String text = " Пробел В Начале, одна запятая = всего40";
        String text2 = " /";

        boolean result1 = text2.isEmpty();  //проверяет и пустая ли строка
        System.out.println("result1 = " + result1);

        boolean result2 = text2.isBlank();  //проверяет на пустоту и пробелы
        System.out.println("result2 = " + result2);

        String result3 = text.substring(1,40);   //достает символы в интервале между указанными числами
        System.out.println("result3 = " + result3);

        int result4 = text.indexOf("е");  //возвращает индекс первого значения в строке
        System.out.println("result4 = " +result4);

        int result5 = text.lastIndexOf("щ");  //возвращает индекс последнего значения в строке, если нет то, -1
        System.out.println("result5 = " +result5);

        String result6 = text.toLowerCase();  //переводит текст в нижний регистр
        System.out.println("result6 = " +result6);

        String result7 = text.toUpperCase();   //переводит текст в вверхний регистр
        System.out.println("result7 = " +result7);

        String result8 = text.replace('а', 'о');   //замена символа №1 на №2 в тескте
        System.out.println("result8 = " +result8);

        boolean result9 = text.startsWith("");  //не ясно, как и следующий
        System.out.println("result9 = " +result9);

        boolean result10 = text.endsWith("");
        System.out.println("result10 = " +result10);

        String result11 = text2.repeat(5);   //повторяет значение указанное кол-во раз
        System.out.println("result11 = " +result11);

        boolean result12 = text2.contains(" / /");   //проверка встречается ли символ или комбинация символов в строке
        System.out.println("result12 = " +result12);

        String result13 = text.concat(" прибавить");  //добавляет к концу строки указанное узначение
        System.out.println("result13 = " +result13);

        String result14 = text2.trim();  //удается лидируюшие и конечные пробелы
        System.out.println("result14 = " +result14);

        boolean result15 = text.equals(" Пробел В Начале, одна запятая = всего40");
        System.out.println("result15 = " +result15);



    }
}
