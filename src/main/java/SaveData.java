import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SaveData {
    public static void writeData(String filePath) {
        SampleData data = new SampleData();
        File file = new File(filePath);
        try {
            // create FileWriter object with file as parameter
            Scanner sc  = new Scanner(System.in);
            FileWriter outputfile = new FileWriter(file);

            // create CSVWriter object filewriter object as parameter
            CSVWriter writer = new CSVWriter(outputfile);

            // adding header to csv
            String[] header = { "transactionType","productType","programType","occupanctType","equityTakeOutAmount","varianceExceptionReceived","cityName",
                    "provinceCode","postalCode","fsa","dwellingType","approvedLendingAreas","loanAmount","policyExceptionPpolicyExceptionPolicyExceptionReceivedolicy",
                    "ltv","downPaymentSource","creditScore","primaryApplicantInd","gds","tds","qualifiedIncomeInd","totalIncome","residencyType","areaName","purchasePrice",
                    "amortazationTermsInYears","previouslyInsure","propertyOwnershipType","baseAmount" };
            writer.writeNext(header);

            // Adding values to csv file

            //int recordsNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of records"));
            System.out.print("Enter number of records: ");
            int recordsNumber = sc.nextInt();


            String[] transactionType = data.transactionType(recordsNumber);
            String[] productType = data.productType(recordsNumber);
            String[] programType = data.programType(recordsNumber);
            String[] occupanctType = data.occupanctType(recordsNumber);
            String[] equityTakeOutAmount = data.equityTakeOutAmount(recordsNumber,transactionType);
            String[] varianceExceptionReceived = data.varianceExceptionReceived(recordsNumber,equityTakeOutAmount);
            String[] cityName = data.cityName(recordsNumber);
            String[] provinceCode = data.provinceCode(recordsNumber);
            String[] postalCode = data.postalCode(recordsNumber);
            String[] fsa = data.fsa(recordsNumber);
            String[] dwellingType = data.dwellingType(recordsNumber);
            String[] approvedLendingAreas = data.approvedLendingAreas(recordsNumber);
            String[] loanAmount = data.loanAmount(recordsNumber);
            String[] policyException = data.policyException(recordsNumber,loanAmount);
            String[] ltv = data.ltv(recordsNumber);
            String[] downPaymentSource = data.downPaymentSource(recordsNumber);
            String[] creditScore = data.creditScore(recordsNumber);
            String[] primaryApplicantInd = data.primaryApplicantInd(recordsNumber);
            String[] grossDebtService = data.grossDebtService(recordsNumber);
            String[] totalDebtService = data.totalDebtService(recordsNumber);
            String[] qualifiedIncomeInd = data.qualifiedIncomeInd(recordsNumber);
            String[] totalIncome = data.totalIncome(recordsNumber);
            String[] residencyType = data.residencyType(recordsNumber);
            String[] areaName = data.areaName(recordsNumber);
            String[] purchasePrice = data.purchasePrice(recordsNumber);
            String[] amortazationTermsInYears = data.amortazationTermsInYears(recordsNumber);
            String[] previouslyInsure = data.previouslyInsure(recordsNumber,transactionType,productType);
            String[] propertyOwnershipType = data.propertyOwnershipType(recordsNumber);
            String[] baseAmount = data.baseAmount(recordsNumber);


            String[][] records = {transactionType,productType,programType,occupanctType,equityTakeOutAmount,varianceExceptionReceived,cityName,provinceCode,postalCode,fsa,dwellingType,
                    approvedLendingAreas,loanAmount,policyException,ltv,downPaymentSource,creditScore,primaryApplicantInd,grossDebtService,totalDebtService,qualifiedIncomeInd,
                    totalIncome,residencyType,areaName,purchasePrice,amortazationTermsInYears,previouslyInsure,propertyOwnershipType,baseAmount};
            int row = 29, column = recordsNumber;

            String[][] transpose = new String[column][row];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    transpose[j][i] = records[i][j];
                }
            }
            for(int i = 0; i < recordsNumber; i++){
                writer.writeNext(transpose[i]);
            }

            // closing writer connection
            writer.close();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        writeData("src/main/resources/data.csv");
    }
}
