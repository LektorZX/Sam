package Regex1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main1 {
    public static void main(String[] args) {
       // q1();
        //q2();
        //q3();
        /*4. Написать программу, выполняющую поиск в строке
        мобильных телефонных номеров в формате +375XXYYYYYYY
и заменяющую каждый телефон на тот же, но в формате +375 (XX) YYY-YY-YY
X - код оператора
Y - номер телефона
*/
        String s2="+375 (29) 210-16-85 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375292125873 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 214-48-39 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375292163718 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 216-40-67 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375292179319 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-11-21 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-45-89 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-94-82 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-99-01 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 231-41-18 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 231-78-05 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 231-79-04 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 232-49-48 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-50-99 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-64-86 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-79-36 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-95-94 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 234-02-58 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 234-22-07 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 234-99-89 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 235-19-84 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 235-26-67 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 235-73-86 — Показать информацию по владельцу номера\n" +
                "\n" +
                "80 (29) 235-98-61 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 236-17-47 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 236-44-29 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 237-13-76 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375292374617 — Показать информацию по владельцу номера\n" +
                "\n" +
                "80 (29) 237-59-40 — Показать информацию по владельцу номера\n" +
                "\n" +
                "\n" +
                "Читай";
        Pattern compile1 = Pattern.compile("(\\+375)(25|29|44|33)(\\d{3})(\\d{2})(\\d{2})");//даем регуляр выраж
        Matcher matcher1 = compile1.matcher(s2);//даем строку для поиска
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher1.find()){//пока есть что искать
            matcher1.appendReplacement(stringBuffer,"$1 ($2) $3-$4-$5"+"!!!!");
        }
        matcher1.appendTail(stringBuffer);//добавили все что осталось в строке после номера в конце
        System.out.println(stringBuffer);







    }

    private static void q3() {
        String s2="+375 (29) 210-16-85 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 212-58-73 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 214-48-39 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 216-37-18 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 216-40-67 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 217-93-19 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-11-21 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-45-89 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-94-82 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 230-99-01 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 231-41-18 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 231-78-05 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 231-79-04 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 232-49-48 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-50-99 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-64-86 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-79-36 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 233-95-94 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 234-02-58 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 234-22-07 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 234-99-89 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 235-19-84 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 235-26-67 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 235-73-86 — Показать информацию по владельцу номера\n" +
                "\n" +
                "80 (29) 235-98-61 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 236-17-47 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 236-44-29 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 237-13-76 — Показать информацию по владельцу номера\n" +
                "\n" +
                "+375 (29) 237-46-17 — Показать информацию по владельцу номера\n" +
                "\n" +
                "80 (29) 237-59-40 — Показать информацию по владельцу номера\n" +
                "\n" +
                "\n" +
                "Читай";
//        String s="+375 (29) 1232323";
//        Pattern pattern=Pattern.compile("^(\\+375|8 ?0)\\s?\\((25|29|44|33)\\)\\s?\\d{3}-?\\d{2}-?\\d{2}$");
//        Matcher matcher = pattern.matcher(s);
//        System.out.println(matcher.matches());//true
//УБРАТЬ СИМВОЛЫ НАЧАЛО КОНЕЦ СТРОКИ ЧТО БЫ ИСКАЛО ВО ВСЕЙ СТРОКЕ !!!!!!
        Pattern compile1 = Pattern.compile("(\\+375|8 ?0)(\\s?\\(?(25|29|44|33)\\)?\\s?\\d{3}-?\\d{2}-?\\d{2})");
        Matcher matcher1 = compile1.matcher(s2);


        StringBuffer stringBuffer = new StringBuffer();
        while (matcher1.find()){//пока есть что искать
            String sq="+375"+matcher1.group(2);//заменили 80 на +375 и добавили сам номер из 2 группы регулярки
            matcher1.appendReplacement(stringBuffer, sq);//вставили в стрингбаффер измененный номер---или поставить вместо строки "+375$2" ссылаемся на 2группу
            System.out.println(matcher1.group());//просто показывает все что нашли(номера)
           // System.out.println(matcher1.group(2));//показывает группы что в скобочках,тут код 29
            // что бы группа не считалась после скобки нужно ставить ?:
            // или ?<имя группы>--тогда вместо 2 вписать имя


        }

        matcher1.appendTail(stringBuffer);//добавили все что осталось в строке после номера в конце
        System.out.println(stringBuffer);
    }

    private static void q2() {
        String s = "1234a56";
        Pattern compile = Pattern.compile("^\\d+$");//все цифры
        Matcher matcher = compile.matcher(s);
        System.out.println(matcher.matches());//false
    }

    private static void q1() {
        String s = "asd234we sdf dfgdfg sdfs6df wer sd f8ds sdf fdf ";
        Pattern compile = Pattern.compile("\\d+");
        Matcher matcher = compile.matcher(s);
        while (matcher.find()){//пока есть что искать
            System.out.println(matcher.group());
        }
    }
}