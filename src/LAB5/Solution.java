package LAB5;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<>();

    public static void main(String[] args) {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

        Contact contact = new FirstContact();
        Customer customer = new FirstCustomer();
        IncomeData incomeData = new MyIncomeData();

        Contact contactIncomeData = new IncomeDataAdapter(incomeData);
        Customer customerIncomeData = new IncomeDataAdapter((incomeData));

        System.out.println("\u001B[0m"+"-----------------------------------------------");
        System.out.println("\u001B[32m" + "Contact");
        contactTest(contact);
        System.out.println("\u001B[0m"+"-----------------------------------------------");
        System.out.println("\u001B[32m" + "Customer");
        customerTest(customer);
        System.out.println("\u001B[0m"+"-----------------------------------------------");
        System.out.println("\u001B[32m" + "IncomeData");
        incomeDataTest(incomeData);
        System.out.println("\u001B[0m"+"-----------------------------------------------");
        System.out.println("\u001B[32m" + "IncomeDataAdapter(Contact)");
        contactTest(contactIncomeData);
        System.out.println("\u001B[0m"+"-----------------------------------------------");
        System.out.println("\u001B[32m" + "IncomeDataAdapter(Customer)");
        customerTest(customerIncomeData);
    }

    public static void contactTest(Contact contact) {
        System.out.println("\u001B[0m"+"Name: " + contact.getName());
        System.out.println("\u001B[0m"+"Phone number: " + contact.getPhoneNumber());
    }

    public static void customerTest(Customer customer) {
        System.out.println("\u001B[0m"+"Company name: " + customer.getCompanyName());
        System.out.println("\u001B[0m"+"CountryName: " + customer.getCountryName());
    }

    public static void incomeDataTest(IncomeData incomeData){
        System.out.println("\u001B[0m"+"Country code: "+incomeData.getCountryCode());
        System.out.println("\u001B[0m"+"Company: "+incomeData.getCompany());
        System.out.println("\u001B[0m"+"ContactFirst name: "+incomeData.getContactFirstName());
        System.out.println("\u001B[0m"+"Contact last name: "+incomeData.getContactLastName());
        System.out.println("\u001B[0m"+"Country phone code: "+incomeData.getCountryPhoneCode());
        System.out.println("\u001B[0m"+"Phone number: "+incomeData.getPhoneNumber());
    }
}
