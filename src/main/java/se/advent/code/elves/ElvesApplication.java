package se.advent.code.elves;

import se.advent.code.elves.model.Elves;
import se.advent.code.elves.services.ElvesManagementService;
import se.advent.code.elves.services.ElvesPickerService;
import se.advent.code.elves.services.FilterService;

public class ElvesApplication {

    public static void main(String[] args) {

        ElvesPickerService es = new ElvesPickerService(new FilterService(), new ElvesManagementService());

        // Fetch Elv with maximum calories available.
        Elves elv = es.fetchMaxCaloryElv();

        if (null != elv) {
            System.out.println("Elv with highest Calory found. Available Calories: " + elv.getTotalCalories());
        } else {
            System.out.println("All elves are empty");
        }
    }
}
