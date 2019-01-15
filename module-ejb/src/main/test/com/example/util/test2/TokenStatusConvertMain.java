package com.example.util.test2;

public class TokenStatusConvertMain {

    public static void main(String[] args) {
        TokenStatusConvertMain tokenStatusConvertMain = new TokenStatusConvertMain();
//        tokenStatusConvertMain.test();
//
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        tokenStatusConvertMain.test2();
//
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        tokenStatusConvertMain.test3();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        boolean isMdes = true;
        System.out.println("isMdes = " + isMdes);

        JmsTokenResponseDto jmsTokenResponseDto = new JmsTokenResponseDto();
        jmsTokenResponseDto.setCurrentStatusCode("A");

        TokenInfoDto responseJmsToken = new TokenInfoDto();
        System.out.println(jmsTokenResponseDto);

        TokenStatus tokenStatus = TokenStatus.I;

        boolean equalsTokenStatus = tokenStatusConvertMain.equalsTokenStatus(isMdes, tokenStatus, responseJmsToken, jmsTokenResponseDto);
        System.out.println(responseJmsToken);
        System.out.println("TokenStatus = " + tokenStatus);
        System.out.println("equalsTokenStatus = " + equalsTokenStatus);
    }

    public void test() {
        TokenStatus tokenStatus = null;

        MdesTokenStatus mdesTokenStatus = MdesTokenStatus.valueOfCode("U");
        tokenStatus = new TokenStatusConvert().convert(mdesTokenStatus);

        System.out.println(tokenStatus);

        VtsTokenStatus vtsTokenStatus = VtsTokenStatus.valueOfCode("I");
        tokenStatus = new TokenStatusConvert().convert(vtsTokenStatus);
        System.out.println(tokenStatus);
    }

    public void test2() {
        TokenStatus tokenStatus = null;

        MdesTokenStatus mdesTokenStatus = MdesTokenStatus.valueOfCode("I");
        tokenStatus = new TokenStatusConvert().convert(mdesTokenStatus);

        System.out.println(tokenStatus);

        VtsTokenStatus vtsTokenStatus = VtsTokenStatus.valueOfCode("U");
        tokenStatus = new TokenStatusConvert().convert(vtsTokenStatus);
        System.out.println(tokenStatus);
    }

    public void test3() {
        boolean isMdes = true;
        TokenStatus currentTokenStatus = isMdes
                ? new TokenStatusConvert().convert(MdesTokenStatus.valueOfCode("U"))
                : new TokenStatusConvert().convert(VtsTokenStatus.valueOfCode("I"));
//                ? new TokenStatusConvert().convert(MdesTokenStatus.valueOfCode("I"))
//                : new TokenStatusConvert().convert(VtsTokenStatus.valueOfCode("U"));
        System.out.println(currentTokenStatus);
    }

    public boolean equalsTokenStatus(boolean isMdes, TokenStatus tokenStatus, TokenInfoDto responseToken, JmsTokenResponseDto jmsTokenResponseDto) {
        responseToken.setTokenStatus(isMdes
                ? new TokenStatusConvert().convert(MdesTokenStatus.valueOfCode(jmsTokenResponseDto.getCurrentStatusCode()))
                : new TokenStatusConvert().convert(VtsTokenStatus.valueOfCode(jmsTokenResponseDto.getCurrentStatusCode())));

        return responseToken.getTokenStatus() != null && tokenStatus == responseToken.getTokenStatus();
    }
}
