package LAB5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyIncomeData implements IncomeData {

    private String countryCode;
    private String company;
    private  String contactFirstName;
    private    String contactLastName;
    private   int phoneCode;
    private    int phoneNumber;

    public MyIncomeData() {

            this.countryCode = "UA";
            this.company = "JavaRush Ltd.";
            this.contactFirstName = "Ivan";
            this.contactLastName = "Ivanov";
            this.phoneCode = 38;
            this.phoneNumber = 501234567;
    }


    @Override
    public String getCountryCode() {
        return countryCode;
    }

    @Override
    public String getCompany() {
        return company;
    }

    @Override
    public String getContactFirstName() {
        return contactFirstName;
    }

    @Override
    public String getContactLastName() {
        return contactLastName;
    }

    @Override
    public int getCountryPhoneCode() {
        return phoneCode;
    }

    @Override
    public int getPhoneNumber() {
        return phoneNumber;
    }
}
