package ch.juventus.se.problemstofix.bird;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Linda Krüger
 * @since: 21.09.17
 */
public class BirdController {

     private List<Bird> birds;

    public BirdController () {
        birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public int getBirdsCount () {
        return birds.size();
    }

}
