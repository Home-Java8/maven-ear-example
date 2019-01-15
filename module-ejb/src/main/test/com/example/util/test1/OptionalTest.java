package com.example.util.test1;

import org.apache.commons.lang3.ObjectUtils;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
////        String val = "a";
//        String val = null;
//
//        String optionalVal = Optional.ofNullable(val)
//                .orElse("X");
//
//        System.out.println("optionalVal >>> " + optionalVal);

//        String maskedPan = "410232_0006";
//        String maskedPan = "";
        String maskedPan = null;

        System.out.println("lastFourOfPAN >>> " + getLastFourOfPAN(maskedPan));
    }

    private static String getLastFourOfPAN(String maskedPan) {
        maskedPan = Optional.ofNullable(maskedPan).orElse(MASKED_PAN_DELIMITER);

        String[] lastFourOfPANs = maskedPan.split(MASKED_PAN_DELIMITER);

        return 1<lastFourOfPANs.length
                ? lastFourOfPANs[1]
                : LAST_FOUR_OF_PAN_DEFAULT;
    }

    private static final String LAST_FOUR_OF_PAN_DEFAULT = "";
    private static final String MASKED_PAN_DELIMITER = "_";
}
