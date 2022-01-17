package day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Running {
    List<Run> runnings = new ArrayList<>();

    public void readFile(String fileName) {

        try (BufferedReader bf = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            bf.readLine();

            while ((line = bf.readLine()) != null) {
                String[] tempSplit = line.split(" km;");
                runnings.add(new Run(Double.parseDouble(tempSplit[0]), LocalDate.parse(tempSplit[1])));
            }
        } catch (IOException ioException) {
            throw new IllegalStateException("Cannot read file!");
        }
    }

    public double sumRunningDistance(int year, Month month) {
        Double sum = 0.;
        for (Run actual : runnings) {
            if (actual.getDateOfRun().getYear() == year && actual.getDateOfRun().getMonth() == month) {
                sum += actual.getDistance();
            }
        }
        return sum;
    }

}
