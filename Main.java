
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Ниже представленны массивы строк , которые можно изменить по своему усмотрению
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};


        StringBuffer out = new StringBuffer();
        String outString = new String();
        StringBuffer temp = new StringBuffer();

        for (int i = 0; i < roles.length; i++) {
            out.append(roles[i] + ":" + '\n');
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(roles[i] + ":")) {
                    temp.append(textLines[j]);
                    temp.delete(0, roles[i].length() + 2);
                    out.append((j + 1) + ") " + temp + '\n');
                    temp.setLength(0);
                }
            }
            out.append('\n');
        }
        outString = out.toString();
        System.out.println(outString);
    }
}

