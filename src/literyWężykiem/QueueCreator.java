package literyWężykiem;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class QueueCreator {

    private ArrayDeque <String> createQueue(){

        return new ArrayDeque<>();
    }

    private ArrayDeque<String> fillUpQueue(ArrayDeque<String> stringQueue, int numberOfObjects){
        Random random = new Random();

        for (int i = 0; i < numberOfObjects; i++){

            int aLiterals = 1 + random.nextInt(50);
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < aLiterals; j++){
                sb.append(getRandomLetter(random));
            }
            stringQueue.add(sb.toString());
        }
        System.out.println("Rozmiar kolejki: " + stringQueue.size());

        return stringQueue;
    }

    private char getRandomLetter(Random random){
        Character[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','R','S','T','U','W','Y','Z'};

        return letters[random.nextInt(23)];
    }

    public Queue <String> createAndFillQueue(int numberOfObjects){

        return fillUpQueue(createQueue(), numberOfObjects);
    }
}

