package pomiary;

import java.util.HashMap;
import java.util.LinkedList;

public class CheckTimes {
    public static void countOperatinTimesHashMap(){
        HashMap<String, Book> map = new HashMap();
        for(int i = 0; i <= 900000; i++) {
            String key = "title" + i;
            Book value = new Book("title" + i,"author" + i);
            map.put(key,value);
        }
        System.out.println("Mapa posiada " + map.size() + " elementów");

        long start = System.nanoTime();
        map.put("Ogniem i mieczem",new Book("Ogniem i mieczem","Sienkiewicz"));
        long end = System.nanoTime();
        long result = end - start;
        System.out.println("Operacja dodawania do HashMap zawierajacej " + map.size() + " elementów, zajmuje " + result + " ns");

        start = System.nanoTime();
        map.remove("Ogniem i mieczem");
        end = System.nanoTime();
        result = end - start;
        System.out.println("Operacja usuwania na podstawie klucza z HashMapy zawierajacej " + map.size() + " elementów, zajmuje " + result + " ns");

        start = System.nanoTime();
        map.get("title600000");
        end = System.nanoTime();
        result = end - start;
        System.out.println("Operacja pobierania na podstawie klucza z HashMapy zawierajacej " + map.size() + " elementów, zajmuje " + result + " ns");

        start = System.nanoTime();
        boolean contains = map.containsKey("title600000");
        end = System.nanoTime();
        result = end - start;
        System.out.println("Operacja wyszukiwania na podstawie klucza z HashMapy zawierajacej " + map.size() + " elementów, zajmuje " + result + " ns. Czy znaleziono element? " + contains);

        start = System.nanoTime();
        contains = map.containsValue(new Book("title600000","author600000"));
        end = System.nanoTime();
        result = end - start;
        System.out.println("Operacja pobierania na podstawie wartości z HashMapy zawierajacej " + map.size() + " elementów, zajmuje " + result + " ns. Czy znaleziono element? " + contains);
    }
    public static void countOperationTimesLinkedList(){
        LinkedList<Book> list = new LinkedList<>();
        for(int i = 0; i <= 900000; i++) {
            list.add(new Book("title" + i,"author" + i));
        }
        System.out.println("Lista posiada " + list.size() + " elementów");

        long start = System.nanoTime();
        boolean contains = list.contains(new Book("title900000", "author900000"));
        long end = System.nanoTime();
        long find = end - start;
        System.out.println("przeszukanie całej listy " + find + "ns. Czy znaleziono element? " + contains);

        start = System.nanoTime();
        contains = list.contains(new Book("title0", "author0"));
        end = System.nanoTime();
        find = end - start;
        System.out.println("przeszukanie listy (element na 1 miejscu) " + find + "ns. Czy znaleziono element? " + contains );

        start = System.nanoTime();
        list.remove(0);
        end = System.nanoTime();
        long removeTime = end - start;
        System.out.println("Operacja usuwania na poczatku linked listy posiadajacej " + list.size() + " elementów zajmuje " + removeTime + " ns");

        start = System.nanoTime();
        list.remove(list.size()-1);
        end = System.nanoTime();
        long removeTime2 = end - start;
        System.out.println("Operacja usuwania z końca linked listy posiadajacej " + list.size() + " elementów zajmuje " + removeTime2 + " ns");

        start = System.nanoTime();
        list.add(0,new Book("new","book"));
        end = System.nanoTime();
        long addTime = end - start;
        System.out.println("Czas potrzebny do dodania elementu na początek linked listy posiadającej " + list.size() + " elementów to " + addTime + " ns");

        start = System.nanoTime();
        list.add(list.size()-1,new Book("new1","book1"));
        end = System.nanoTime();
        long addTime2 = end - start;
        System.out.println("Czas potrzebny do dodania elementu na koniec linked listy posiadającej " + list.size() + " elementów to " + addTime2 + " ns");

        start = System.nanoTime();
        Book book = list.get(list.size() - 1);
        end = System.nanoTime();
        long getTime = end - start;
        System.out.println("Czac potrzebny do pobrania ostatniego elementu " + getTime + "ns. Jest to: " + book);

        start = System.nanoTime();
        book = list.get(0);
        end = System.nanoTime();
        long getTime2 = end - start;
        System.out.println("Czac potrzebny do pobrania pierwszego elementu " + getTime2 + "ns. Jest to: " + book);

    }
}
