package phone.agenda;

public class PhoneNumber {
    private int CountryCode;
    private String phoneNumber;

    public PhoneNumber(String phoneNumber, int countryCode) {
        this.phoneNumber = phoneNumber;
        this.CountryCode = countryCode;
    }

    public PhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10) {
            this.CountryCode = Integer.parseInt(phoneNumber.substring(0, phoneNumber.length() - 10));
            this.phoneNumber = phoneNumber.substring(phoneNumber.length() - 10);
        } else {
            this.CountryCode = 1; // Default country code
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "CountryCode=" + CountryCode +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
