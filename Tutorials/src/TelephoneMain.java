public class TelephoneMain {
    public static void main(String[] args) {
        Telephone[] tele = new Telephone[5];

        for (int i = 0; i < tele.length; i++) {
            String areaCode = "03";
            String number = "7967630" + i;
            tele[i] = new Telephone(areaCode, number);
        }
        for (Telephone telephone : tele) {
            System.out.println(telephone.makeFullNumber());
        }
    }
}
