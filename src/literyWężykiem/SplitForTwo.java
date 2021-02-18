package literyWężykiem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

public class SplitForTwo {

    private List <String> even = new ArrayList<>();
    private List <String> odd = new ArrayList<>();

    public void splitForEvenAndOdd(Queue<String> queue){
        Iterator<String> iterator = queue.iterator();
        String testedObj;

        while (iterator.hasNext()){
            testedObj = iterator.next();
            test(testedObj);

        }
        printLists();
    }

    private void test(String string){
        if (string.length() % 2 == 0){
            even.add(string);
        }else {
            odd.add(string);
        }
    }

    private void printLists(){
        System.out.println("Lista napisów nieparzystych: " +
                odd + " długość: " + odd.size());
        System.out.println("Lista napisów parzystych: " +
                even + " długość: " + even.size());
    }
}
