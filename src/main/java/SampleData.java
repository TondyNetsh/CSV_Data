import com.github.javafaker.Faker;

import java.util.Locale;

public class SampleData {
    int index;
    public String[] transactionType(int number) {
        String[] transaction = {"Refinance","Transfer","Purchase"};
        String[] transType = new String[number];
        for(int i = 0; i < number; i++){
            index = (int)(Math.random() * 3);
            transType[i] =  transaction[index];
        }

        return transType;
    }

    public String[] productType(int number) {
        String[] product = {"Prime","Alternative"};
        String[] prodType = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int)(Math.random() * 2);
            prodType[i] =  product[index];
        }

        return prodType;
    }

    public String[] programType(int number) {
        String[] program = {"Standard","NewToCanada","BFSAssist","CreditRestorer","Rental"};
        String[] progType = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 5);
            progType[i] = program[index];
        }

        return progType;
    }

    public String[] occupanctType(int number) {
        String[] occupant = {"OwnerOccupied","OwnerOccupiedPlusRental","Rental","SecondHome"};
        String[] occupy = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 4);
            occupy[i] = occupant[index];
        }

        return occupy;
    }

    public String[] equityTakeOutAmount(int number, String[] transactionType) {
        String[] equity = new String[number];
        int amount = 0;

        for (int i = 0; i < number; i++) {
            if (transactionType[i].equals("Purchase")) {
                amount = (int) (Math.random() * Integer.MAX_VALUE);
                equity[i] = String.valueOf(amount);
            }
            else if (transactionType[i].equals("Refinance")) {
                amount = (int) (Math.random() * 200000);
                equity[i] = String.valueOf(amount);
            }
            else if (transactionType[i].equals("Transfer")) {
                amount = (int) (Math.random() * 1) + 200000;
                equity[i] = String.valueOf(amount);
            }
        }
        return equity;
    }

    public String[] varianceExceptionReceived(int number, String[] equity) {
        String[] variance = {"Received","Not Received"};
        String[] varienceException = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 2);
            int equityAmt = Integer.parseInt(equity[i]);
            if (equityAmt > 200000) {
                varienceException[i] = "Received";
            }
            else {
                varienceException[i] = "Not Received";
            }
        }
        return varienceException;
    }

    public String[] cityName(int number) {
        String[] city = new String[number];

        Locale locale = Locale.CANADA;
        Faker faker = new Faker(locale);
        System.out.println(faker.address().cityName());

        for (int i = 0; i < number; i++) {
            city[i] = faker.address().cityName();
        }

        return city;
    }

    public String[] provinceCode(int number) {
        String[] city = new String[number];
        Faker faker = new Faker();

        for (int i = 0; i < number; i++) {
            city[i] = faker.address().cityName();
        }

        return city;
    }

    public String[] postalCode(int number) {
        Faker faker = new Faker();
        String[] postalCode = {"M2N","T8L","J5R","A1N","K6V"};
        String[] code = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int)(Math.random()) * 5;
            int num = ((int) (Math.random()*(90 - 65))) + 65;
            char randomChars = (char) num;
            code[i] = postalCode[index] + " " + ((int)(Math.random() * 9)) + randomChars + ((int)(Math.random() * 9));
        }
        return code;
    }

    public String[] fsa(int number) {
        String[] fsaValues = {"M2N","T8L","J5R","A1N","K6V"};
        String[] fsa = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 5);
            fsa[i] = fsaValues[index];
        }
        return fsa;
    }

    public String[] dwellingType(int number) {
        String[] dwellingValues = {"Detached","SemiDetached","Townhouse","Appartment","Duplex","Triplex","Fourplex","DuplexDetached","DuplexSemiDetached",
                "RowHousing","ApartmentLowRise","ApartmentHighRise","Mobile","TriPlexDetached","TriPlexSemiDetached","Stacked","ModularHomeDetached",
                "ModularHomeSemiDetached","FourPlexDetached","FourPlexSemiDetached"};
        String[] dwellingType = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 20);
            dwellingType[i] = dwellingValues[index];
        }
        return dwellingType;
    }

    public String[] approvedLendingAreas(int number) {
        String[] ApprovedLendingAreasValues = {"Medium","Major"};
        String[] ApprovedLendingAreas = new String[number];
        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 2);
            ApprovedLendingAreas[i] = ApprovedLendingAreasValues[index];
        }
        return ApprovedLendingAreas;
    }

    public String[] loanAmount(int number) {
        String[] loanAmount = new String[number];
        int amount = ((int) (Math.random()*(2500000 - 100000))) + 100000;
        System.out.println(amount);
        for (int i = 0; i < number; i++) {
            loanAmount[i] = String.valueOf(amount);
        }
        return loanAmount;
    }

    public String[] policyException(int number, String[] loanAmount) {
        String[] policyException = new String[number];
        int loanAmt = 0;

        for (int i = 0; i < number; i++) {
            loanAmt = Integer.parseInt(loanAmount[i]);
            if (loanAmt > 2500000) {
                policyException[i] = "Received";
            }
            else {
                policyException[i] = "Not Received";
            }
        }
        return policyException;
    }

    public String[] ltv(int number) {
        String[] ltv = new String[number];
        double[] ltvValues = {80,65,75,80,65,75,60,90,95,95.0};

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 10);
            ltv[i] = String.valueOf(ltvValues[index] / 100);
        }
        return ltv;
    }

    public String[] downPaymentSource(int number)
    {
        String[] paySource = {"SaleOfExistingProperty", "PersonalCash", "RRSP", "BorrowedAgainstLiquidAssets", "Gift",
                "SweatEquity","Other", "ExistingEquity", "SecondaryFinancing", "Grants", "Borrowed", "Own Resources"};
        String[] downPayment = new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 12);
            downPayment[i] = paySource[index];
        }

        return downPayment;
    }

    public String[] creditScore(int number) {
        String[] creditScr = new String[number];

        for (int i = 0; i < number; i++) {

        }
        return null;
    }
    public String[] qualifiedIncomeInd(int number)
    {
        String[] qualifiedIncome = {"Qualified","Not Qualified"};
        String[] qualifiedIncomes= new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 2);
            qualifiedIncomes[i] = qualifiedIncome[index];
        }

        return qualifiedIncomes;
    }

    public String[] residencyType(int number)
    {
        String[] resident = {"Primary","Not Primary"};
        String[] residency= new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 2);
            residency[i] = resident[index];
        }

        return residency;
    }
    public String[] areaName(int number)
    {
        String[] areas = {"GVA","Victoria","Abbotsford","Mission","Squamish","Whistler","Rest of British Columbia","Calgary",
                "Edmonton","Rest of Alberta","Winnipeg","Rest of Manitoba","Greater Toronto Area","Rest of Ontario","Otherwise"};
        String[] area= new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 14);
            area[i] = areas[index];
        }

        return area;
    }

    public String[] previouslyInsure(int number,String[] transactionType,String[] productType)
    {
        String[] insure = {"Previously Insured","Not Previously Insured"};
        String[] insurers= new String[number];

        for (int i = 0; i < number; i++) {
            if(transactionType[])
        }
        return insurers;
    }

    public String[] propertyOwnershipType(int number)
    {
        String[] OwnershipType = {"Previously Insured","Not Previously Insured"};
        String[] OwnershipTypes= new String[number];

        for (int i = 0; i < number; i++) {
            index = (int) (Math.random() * 2);
            OwnershipTypes[i] = OwnershipType[index];
        }
        return OwnershipTypes;
    }
}