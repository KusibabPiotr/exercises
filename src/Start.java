import literyWężykiem.QueueCreator;
import literyWężykiem.SplitForTwo;

import java.util.*;

public class Start
{
    public static void main (String[] args)
    {
        QueueCreator queueCreator = new QueueCreator();
        SplitForTwo split = new SplitForTwo();

        Queue<String> queue = queueCreator.createAndFillQueue(30);
        split.splitForEvenAndOdd(queue);


    }
}
