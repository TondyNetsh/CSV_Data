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

    int[] provinceName;
    public String[] cityName(int number) {
        provinceName = new int[number];
        String[][] cities = {{"Airdrie","Grande Prairie","Red Deer","Beaumont","Hanna","St. Albert","Bonnyville","Hinton","Spruce Grove","Brazeau","Irricana","Strathcona County","Breton"
                ,"Lacombe","Strathmore","Calgary","Leduc","Sylvan Lake","Camrose","Lethbridge","Swan Hills","Canmore","McLennan","Taber","Didzbury","Medicine Hat","Turner Valley","Drayton Valley"
                ,"Olds","Vermillion","Edmonton","Onoway","Wood Buffalo","Ft. Saskatchewan","Provost"},
                {"Burnaby","Lumby","City of Port Moody","Cache Creek","Maple Ridge","Prince George","Castlegar","Merritt","Prince Rupert","Chemainus"
                ,"Mission","Richmond","Chilliwack","Nanaimo","Saanich","Clearwater","Nelson","Sooke","Colwood","New Westminster","Sparwood","Coquitlam","North Cowichan"
                ,"Surrey","Cranbrook","North Vancouver","Terrace","Dawson Creek","North Vancouver","Tumbler","Delta","Osoyoos","Vancouver","Fernie","Parksville"
                ,"Vancouver","Invermere","Peace River","Vernon","Kamloops","Penticton","Victoria","Kaslo","Port Alberni","Whistler","Langley","Port Hardy"},
                {"Birtle", "Flin Flon", "Swan River", "Brandon", "Snow Lake", "The Pas", "Cranberry Portage", "Steinbach", "Thompson", "Dauphin", "Stonewall", "Winnipeg"},
                {"Cap-Pele", "Miramichi", "Saint John", "Fredericton", "Moncton", "Saint Stephen", "Grand Bay-Westfield", "Oromocto", "Shippagan", "Grand Falls", "Port Elgin", "Sussex", "Memramcook",
                        "Sackville", "Tracadie-Sheila"},
                {"Argentia", "Corner Brook", "Paradise", "Bishop's Falls", "Labrador City", "Portaux Basques", "Botwood", "Mount Pearl", "St. John's", "Brigus"},
                {"Town of Hay River", "Town of Inuvik", "Yellowknife"},
                {"Amherst", "Hants County", "Pictou", "Annapolis", "Inverness County", "Pictou County", "Argyle", "Kentville", "Queens", "Baddeck", "County of Kings", "Richmond", "Bridgewater", "Lunenburg",
                 "Shelburne", "Cape Breton", "Lunenburg County", "Stellarton", "Chester", "Mahone Bay", "Truro", "Cumberland County", "New Glasgow", "Windsor", "East Hants", "New Minas", "Yarmouth", "Halifax", "Parrsboro"},
                {"Ajax", "Halton", "Peterborough", "Atikokan", "Halton Hills", "Pickering", "Barrie", "Hamilton", "Port Bruce", "Belleville", "Hamilton-Wentworth", "Port Burwell", "Blandford-Blenheim", "Hearst",
                    "Port Colborne", "Blind River", "Huntsville", "Port Hope", "Brampton", "Ingersoll", "Prince Edward", "Brant", "James", "Quinte West", "Brantford", "Kanata", "Renfrew", "Brock", "Kincardine",
                    "Richmond Hill", "Brockville", "King", "Sarnia", "Burlington", "Kingston", "Sault Ste. Marie", "Caledon", "Kirkland Lake", "Scarborough", "Cambridge", "Kitchener", "Scugog", "Chatham-Kent", "Larder Lake",
                    "Souix Lookout CoC Sioux Lookout", "Chesterville", "Leamington", "Smiths Falls", "Clarington", "Lennox-Addington", "South-West Oxford", "Cobourg", "Lincoln", "St. Catharines", "Cochrane", "Lindsay",
                    "St. Thomas", "Collingwood", "London", "Stoney Creek", "Cornwall", "Loyalist Township", "Stratford", "Cumberland", "Markham", "Sudbury", "Deep River", "Metro Toronto", "Temagami", "Dundas",
                    "Merrickville", "Thorold", "Durham", "Milton", "Thunder Bay", "Dymond", "Nepean", "Tillsonburg", "Ear Falls", "Newmarket", "Timmins", "East Gwillimbury", "Niagara", "Toronto", "East Zorra-Tavistock",
                    "Niagara Falls", "Uxbridge", "Elgin", "Niagara-on-the-Lake", "Vaughan", "Elliot Lake", "North Bay", "Wainfleet", "Flamborough", "North Dorchester", "Wasaga Beach", "Fort Erie", "North Dumfries",
                    "Waterloo", "Fort Frances", "North York", "Waterloo", "Gananoque", "Norwich", "Welland", "Georgina", "Oakville", "Wellesley", "Glanbrook", "Orangeville", "West Carleton", "Gloucester", "Orillia",
                    "West Lincoln", "Goulbourn", "Osgoode", "Whitby", "Gravenhurst", "Oshawa", "Wilmot", "Grimsby", "Ottawa", "Windsor", "Guelph", "Ottawa-Carleton", "Woolwich", "Haldimand-Norfork", "Owen Sound", "York"},
                {"Alberton", "Montague", "Stratford", "Charlottetown", "Souris", "Summerside", "Cornwall"},
                {"Alma", "Fleurimont", "Longueuil", "Amos", "Gaspe", "Marieville", "Anjou", "Gatineau", "Mount Royal", "Aylmer", "Hull", "Montreal", "Beauport", "Joliette", "Montreal Region", "Bromptonville", "Jonquiere",
                    "Montreal-Est", "Brosssard", "Lachine", "Quebec", "Chateauguay", "Lasalle", "Saint-Leonard", "Chicoutimi", "Laurentides", "Sherbrooke", "Coaticook", "LaSalle", "Sorel", "Coaticook", "Laval",
                        "Thetford Mines", "Dorval", "Lennoxville", "Victoriaville", "Drummondville", "Levis"},
                {"Avonlea", "Melfort", "Swift Current", "Colonsay", "Nipawin", "Tisdale", "Craik", "Prince Albert", "Unity", "Creighton", "Regina", "Weyburn", "Eastend", "Saskatoon", "Wynyard", "Esterhazy", "Shell Lake", "Yorkton", "Gravelbourg"},
                {"Carcross","Whitehorse"} };

        String[] cityName = new String[number];

        for (int i = 0; i < number; i++) {
            int province = (int) (Math.random() * 11);
            int city = (int) (Math.random() * cities[province].length);
            provinceName[i] = province;
            cityName[i] = cities[province][city];
        }

        return cityName;
    }

//    public String[] provinceCode(int number) {
//        String[] provinceCode = new String[number];
//
//    }

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
        String[] creditScore = new String[number];

        for (int i=0; i < number; i++){
            index = (int) (Math.random() * 751);
            creditScore[i] = String.valueOf(index);
        }
        return creditScore;
    }

    public String[] primaryApplicantInd(int numbOfRecords) {
        String[] givenValues = {"Qualified","Not Qualified"};

        // The array size is determined by the number of Records requested
        String[] primaryApplicantInd = new String[numbOfRecords];
        for (int i = 0; i < numbOfRecords; i++) {
            int index = (int) (Math.random() * (givenValues.length));
            primaryApplicantInd [i] = givenValues[index];
        }
        return primaryApplicantInd;
    }

    public String[] grossDebtService(int numbOfRecords) {
        //array to be returned
        //the array size is determined by the number of Records requested
        String[] grossDebtService = new String[numbOfRecords];
        for (int i = 0; i < numbOfRecords; i++) {
            grossDebtService[i] = (Math.random() * (60)) + "%";
        }
        return grossDebtService;
    }

    public String[] totalDebtService(int numbOfRecords) {
        //array to be returned
        //the array size is determined by the number of Records requested
        String[] totalDebtService = new String[numbOfRecords];
        for (int i = 0; i < numbOfRecords; i++) {
            totalDebtService[i] = (Math.random() * (60)) + "%";
        }
        return totalDebtService;
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

    public String[] totalIncome(int number) {

        String[] total = new String[number];

        for (int i = 0; i < number; i++) {
            int amount = ((int) (Math.random() * (Integer.MAX_VALUE - 90000))) + 90000;
            total[i] = String.valueOf(amount);
        }
        return total;
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
        String[] insurance= new String[number];

        for (int i = 0; i < number; i++) {
            if(transactionType[i] == "Transfer" && productType[i] == "Prime") {
                insurance[i] = "Previously Insured";
            }
            else {
                insurance[i] = "Not Previously Insured";
            }
        }
        return insurance;
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