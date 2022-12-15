package se.advent.code.elves.services;

import se.advent.code.elves.exception.FileReadException;
import se.advent.code.elves.model.Elves;
import se.advent.code.elves.utils.FileUtils;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ElvesManagementService {

    /***
     * Creates list of elves (with their calories).
     * @param fileName          File containing each elv calory information
     * @return                  List of elves.
     */
    public List<Elves> createElves(String fileName){

        List<Elves> elvesList = new ArrayList<>();

        String calory; int totalCalories = 0;
        List<Integer> caloryList = new ArrayList<>();

        BufferedReader br = FileUtils.fileReader(fileName);

        try {

            while((calory = br.readLine()) != null) {

                // Each elv calory details are separated by a new/empty line.
                if ("".equals(calory.trim())) {

                    elvesList.add(new Elves(caloryList, totalCalories));

                    totalCalories = 0;
                    caloryList = new ArrayList<>();

                } else {

                    caloryList.add(Integer.parseInt(calory));
                    totalCalories += Integer.parseInt(calory);
                }
            }
            // Add last elv details.
            elvesList.add(new Elves(caloryList, totalCalories));

            return elvesList;

        } catch (IOException e) {

            System.out.println("Failed to read file data. Exception: " + e);
            throw new FileReadException("Failed to read file data.", e);
        }
    }
}
