package LAB5;

public class FirstCustomer implements Customer {
    private String companyName;
    private String countryName;

    public FirstCustomer() {
        this.companyName = "JavaRush Ltd.";
        this.countryName = "Ukraine";
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }

    @Override
    public String getCountryName() {

        return countryName;
    }
}
