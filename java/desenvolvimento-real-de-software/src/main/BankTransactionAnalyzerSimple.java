package src.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BankTransactionAnalyzerSimple {
    private static final String RESOURCES="src/main/resources/";

    //Extrato de todos os meses
    public static void main(final String[] args) throws IOException{
        final Path path = Paths.get(RESOURCES + "bank-data-simple.csv");
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        for(final String line : lines){
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;
        }
        System.out.println("The total for all transactions is " + total);
    //Extrato de janeiro
        double totalJaneiro = 0d;
        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        for(final String line: lines){
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            if(date.getMonth() == Month.JANUARY){
                final double amountJaneiro = Double.parseDouble(columns[1]);
                totalJaneiro += amountJaneiro;
            }
        }
        System.out.println("The total for all transactions in january is  " + totalJaneiro);
    //Extrato de fevereiro
        double totalFevereiro = 0d;
        for(final String line: lines){
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0],DATE_PATTERN);
            if(date.getMonth() == Month.FEBRUARY){
                final double amountFevereiro = Double.parseDouble(columns[1]);
                totalFevereiro += amountFevereiro;
            }
        }
        System.out.println("The total for all transactions in february is  " + totalFevereiro);
    //Extrato de março
    //Extrato de abril
    //Extrato de maio
    //Extrato de junho
    //Extrato de julho
    //Extrato de agosto
    //Extrato de setembro
    //Extrato de outubro
    //Extrato de novembro
    //Extrato de decembro
    }
}
