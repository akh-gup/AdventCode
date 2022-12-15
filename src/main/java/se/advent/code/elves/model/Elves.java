package se.advent.code.elves.model;

import lombok.Data;
import lombok.ToString;
import java.util.List;

@Data
@ToString
public class Elves {

    private List<Integer> calories;
    private int totalCalories;


    public Elves() {}

    public Elves(List<Integer> calories, int totalCalories) {
        this.calories = calories;
        this.totalCalories = totalCalories;
    }


    public List<Integer> getCalories() {
        return calories;
    }

    public void setCalories(List<Integer> calories) {
        this.calories = calories;
    }


    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }
}
