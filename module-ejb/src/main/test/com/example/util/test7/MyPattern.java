package com.example.util.test7;

public class MyPattern {

    public static void main(String[] args) {

        System.out.println( StringUtil.displayPanOrToken("1234567890123456") );

        String text = "{\"UserId\":\"test111\",\"Password\":\"12345678\"}";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) );

        text = "{\"UserId\":\"test\",\"pan\":\"125342572285956945\",\"blabla\":\"zzzzzzzzzzzzzzzzzzzzzz\"}";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) ); //todo   "pan":"125342******6945"
        text = "{\"UserId\":\"test\",\"PAN\":\"125342572285956945\",\"blabla\":\"cccccccccccccccccccccc\"}";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) ); //todo   "PAN":"125342******6945"

        text = "<sab:confirmProvisioningResponse><sab:panInternalId some=\"value\"/><sab:pan>258</sab:pan><PAN>258</PAN></sab:confirmProvisioningResponse>";
        System.out.println( StringUtil.sensitiveFieldsFromXmlHiding(text) ); //todo   <sab:pan>******</sab:pan>

        text = "<sab:confirmProvisioningResponse><sab:panInternalId some=\"value\"/><sab:pan>125342572285956945</sab:pan><PAN>125342572285956945</PAN></sab:confirmProvisioningResponse>";
        System.out.println( StringUtil.sensitiveFieldsFromXmlHiding(text) ); //todo


        text = "\"lastFourOfPAN\":\"1234567890123456\"";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) ); //todo   необходимо отменить маскирование для полей lastFourOfPAN

        text = "\"tokenExpiryMonth\":\"12\"";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) ); //todo   необходимо отменить маскирование для полей tokenExpiryMonth

        text = "\"tokenExpiryYear\":\"18\"";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) ); //todo   необходимо отменить маскирование для полей tokenExpiryYear

        text = "\"expiryMonth\":\"12\"";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) );

        text = "\"expiryYear\":\"18\"";
        System.out.println( StringUtil.sensitiveFieldsHiding(text) );

        // //////////////////////////////////////
        String[] maskPan = StringUtil.displayPanOrToken("1234567890123456").split("_");

    }

    public static String FIRST_PAN_SYMBOLS;
    public static String LAST_PAN_SYMBOLS;

    class DisplayPan {

        public DisplayPan() {}

        public DisplayPan(String displayPanOrToken) {
            String[] panSymbols = displayPanOrToken.split("_");
            if (panSymbols.length==2) {
                firstPanSymbols = panSymbols[0];
                lastPanSymbols = panSymbols[1];
            }
        }

        private String firstPanSymbols;
        private String lastPanSymbols;

        public String getFirstPanSymbols() {
            return firstPanSymbols;
        }

        public void setFirstPanSymbols(String firstPanSymbols) {
            this.firstPanSymbols = firstPanSymbols;
        }

        public String getLastPanSymbols() {
            return lastPanSymbols;
        }

        public void setLastPanSymbols(String lastPanSymbols) {
            this.lastPanSymbols = lastPanSymbols;
        }
    }

}
