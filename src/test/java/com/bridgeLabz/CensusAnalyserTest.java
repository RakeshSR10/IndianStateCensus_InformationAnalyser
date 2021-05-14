package com.bridgeLabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class CensusAnalyserTest {
    private static final String INDIA_CENSUS_CSV_FILE_PATH = "./src/test/resources/IndiaStateCensusData.csv";
    private static final String WRONG_CSV_FILE_PATH = "./src/main/resources/IndiaStateCensusData.csv";

    //UC1 - TC1 Given the States Census CSV file, Check to ensure the number of Records matches
    @Test
    public void givenIndianCensusCSVFileReturnsCorrectRecords()  throws IOException {
        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
        Assertions.assertEquals(29, numOfRecords);
    }
}
