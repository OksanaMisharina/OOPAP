package LAB5;

public class IncomeDataAdapter implements Customer, Contact {
    IncomeData incomeData;

    public IncomeDataAdapter(IncomeData incomeData) {
        this.incomeData = incomeData;
    }

    @Override
    public String getName() {
        return incomeData.getContactLastName() + ", " + incomeData.getContactFirstName();
    }

    @Override
    public String getPhoneNumber() {
        String phone = String.valueOf(incomeData.getPhoneNumber());
        while (phone.length()!=10)
            phone = "0"+phone;


        return "+" + incomeData.getCountryPhoneCode()+"("+phone.substring(0, 3)+")"+
                phone.substring(3, 6)+"-"+phone.substring(6,8)+"-"+phone.substring(8);
    }

    @Override
    public String getCompanyName() {

        return incomeData.getCompany();
    }

    @Override
    public String getCountryName() {

        return Solution.countries.get(incomeData.getCountryCode());
    }
}
