package se.advent.code.elves.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class FileUtils {


    public static BufferedReader fileReader(String fileName) {

        InputStreamReader streamReader =
                new InputStreamReader(
                        Objects.requireNonNull(
                                Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName)), StandardCharsets.UTF_8);

        return new BufferedReader(streamReader);


    }
}