
package ru.appline.tatiana.hw_6;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class MyCollection {

     public static void main(String[] args) {

         String file = usingBufferedReader("C:/Users/zhuky/Documents/Collections/HW_6.txt");
         List<String> words = Arrays.stream(file.split("[\\s;.,?!]")).filter(e -> !e.isBlank()).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
         words.forEach(System.out::println);
         System.out.println("-----------------------");
         Map<String,Integer> num = new HashMap<>();
         for(String s: words) {
            if(num.containsKey(s))
                num.put(s, num.get(s) +1);
            else
                num.put(s,1);
         }
         System.out.println("==========");
         num.entrySet().forEach(System.out::println);

         Integer maxI = num.values().stream().max(Integer::compareTo).get();
         for(Map.Entry<String,Integer> entry : num.entrySet()) {
             if(entry.getValue().equals(maxI))
                 System.out.println(entry.getKey() + " => " + entry.getValue());
         }
     }

    /**
     * Метод, считывающий файл по абсолютному пути
     * @param path - путь к файлу
     * @return - файл считывается в строку
     */
     private static String usingBufferedReader(String path)
        {
            StringBuilder contentBuilder = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(path)))
            {

                String sCurrentLine;// строка, считанная из файла
                while ((sCurrentLine = br.readLine()) != null)
                {
                    contentBuilder.append(sCurrentLine).append("\n"); //собираем содержимое файла в строку
                }
            } catch (IOException e)
            {
                System.out.println("Unable to open file " + path + ": "+ e.getMessage());// выдаем сообщение при исключении
            }
            return contentBuilder.toString(); // результат: строка, считанная из файла
        }
}
