package se.advent.code.elves.services;

import lombok.extern.slf4j.Slf4j;
import se.advent.code.elves.constants.Constants;
import se.advent.code.elves.model.Elves;
import java.util.List;

@Slf4j
public class ElvesPickerService {


    private final FilterService filterService;
    private final ElvesManagementService elvesManagementService;

    public ElvesPickerService(FilterService filterService, ElvesManagementService elvesManagementService) {
        this.filterService = filterService;
        this.elvesManagementService = elvesManagementService;
    }

    /**
     * Fetches elv with highest calories
     * @return          Elv object
     */
    public Elves fetchMaxCaloryElv(){

        // Create list of elves from the file
        List<Elves> elvesList = elvesManagementService.createElves(Constants.FILE_NAME);
        if (null == elvesList || elvesList.isEmpty()) {

            System.out.println("Unable to fetch Elves list");
            return null;
        }

        return filterService.fetchHighestCaloryElv(elvesList);
    }
}
