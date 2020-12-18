package LAB5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FirstContact implements Contact {
    private String name;
    private String phoneNumber;

    public FirstContact() {

        this.name = "Ivanov, Ivan";
        this.phoneNumber = "+38(050)123-45-67";

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

}
