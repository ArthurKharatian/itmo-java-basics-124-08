package itmo.java.basics.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String java = "Java";

//        String java2 = new String("JaVa");
//
//        System.out.println(java == java2);
//        System.out.println(java.equals(java2));
//        System.out.println(java.equalsIgnoreCase(java2));

        java = java.concat(" Developer");

//        System.out.println(java);


//        java = java + 123;

//        java = 80 + 120 + java + (150 + 250);

//        System.out.println(java);

//        String empty = null;
//
//        if (java != null && !java.isEmpty()) {
//
//        }

//        System.out.println(java.contains("velo"));

//        int length = java.length();

//        char[] chars = java.toCharArray();
//        for (char aChar : chars) {
//            if (Character.isDigit(aChar)) {
//                System.out.println(aChar);
//            }
//        }

//        String substring = java.substring(3);
//
//        String substring2 = java.substring(3, 7);
//
//        System.out.println(java);
//        System.out.println(substring);
//        System.out.println(substring2);

//        String str = "\n Hello world7921-dfsf555  66-77 \n";
//
////        System.out.println(str);
////
////        str = str.trim();
////
////        System.out.println(str);
//
//
////        str = str.replace("5", "?");
////        str = str.replaceAll("[^0-9]", "");
//        str = str.replaceAll("[0-9]", "*");
//        System.out.println(str);


        String text = "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для текстов на латинице с начала XVI века. В то время некий безымянный печатник создал большую коллекцию размеров и форм шрифтов, используя Lorem Ipsum для распечатки образцов. Lorem Ipsum не только успешно пережил без заметных изменений пять веков, но и перешагнул в электронный дизайн. Его популяризации в новое время послужили публикация листов Letraset с образцами Lorem Ipsum в 60-х годах и, в более недавнее время, программы электронной вёрстки типа Aldus PageMaker, в шаблонах которых используется Lorem Ipsum.";

//        String[] strings = text.split(" ");
//        for (String string : strings) {
//            System.out.println(string);
//        }
//
//        Integer number = null;
//        System.out.println(number);
//
//
////        String s = number.toString();
//        String num = String.valueOf(number);
////        System.out.println(s);
//        System.out.println(num);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        System.out.println(s);
//        System.out.println(Integer.parseInt(s));

//        StringBuilder builder = new StringBuilder();

//        String[] strings = text.split(" ");
//        for (String string : strings) {
//            builder.append(string).append(", ").append("!!!");
//        }
//
//        System.out.println(builder);


//        StringBuilder builder = new StringBuilder(java);
//        StringBuilder builder2 = new StringBuilder(java);

//        System.out.println(java == builder2.toString());
//        System.out.println(builder == builder2);
//        System.out.println(builder.equals(builder2));
//        System.out.println(java.equals(builder2.toString()));
//        System.out.println(java.equals(builder));

        StringBuilder builder = new StringBuilder("ITMO");
        builder.insert(3, "St.-Petersburg");
        System.out.println(builder);

        builder.delete(3, builder.length() - 1);
        System.out.println(builder);

        System.out.println(builder.reverse());


        StringBuffer buffer = new StringBuffer();


    }
}
