package se.advent.code.elves.services;

import se.advent.code.elves.model.Elves;
import java.util.Comparator;
import java.util.List;

public class FilterService implements Comparator<Elves> {

    public Elves fetchHighestCaloryElv(List<Elves> elves) {

        elves.sort(this);
        return elves.get(0);

    }

    @Override
    public int compare(Elves o1, Elves o2) {
        return Integer.compare(o2.getTotalCalories(), o1.getTotalCalories());
    }
}
