public class Telephone {
    private String areaCode;
    private String number;
    private static int numberOfTelephoneObject = 0;

    public Telephone(String areaCode, String number){
        this.number = number;
        this.areaCode = areaCode;
    }
    public String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String makeFullNumber() {
        return areaCode + " - " + number;
    }
    public static int getNumberOfTelephoneObject() {
        return numberOfTelephoneObject;
    }
}
