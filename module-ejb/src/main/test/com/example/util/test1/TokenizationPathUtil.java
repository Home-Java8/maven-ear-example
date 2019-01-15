package com.example.util.test1;

import java.util.Arrays;
import java.util.Optional;

public class TokenizationPathUtil {

    public static void main(String[] args) {

//        String[] vals = {"APPROVED"};  // GREEN
//        String[] vals = {"DECLINED"};  // RED
//        String[] vals = {"APPROVED","DECLINED"};

//        String[] vals = null;                                  // YELLOW
//        String[] vals = {};                                    // YELLOW
//        String[] vals = {"REQUIRE_ADDITIONAL_AUTHENTICATION"}; // YELLOW

//        String[] vals = {"HIGH_RISK"};                       // ORANGE
//        String[] vals = {"0G"};                              // ORANGE
//        String[] vals = {"HIGH_RISK","0G"};                  // ORANGE
        String[] vals = {"ACCOUNT_TOO_NEW_SINCE_LAUNCH", "ACCOUNT_TOO_NEW", "ACCOUNT_CARD_TOO_NEW", "ACCOUNT_RECENTLY_CHANGED", "SUSPICIOUS_ACTIVITY", "INACTIVE_ACCOUNT", "HAS_SUSPENDED_TOKENS", "DEVICE_RECENTLY_LOST", "TOO_MANY_RECENT_ATTEMPTS", "TOO_MANY_RECENT_TOKENS", "TOO_MANY_DIFFERENT_CARDHOLDERS", "LOW_DEVICE_SCORE", "LOW_ACCOUNT_SCORE", "OUTSIDE_HOME_TERRITORY", "UNABLE_TO_ASSESS", "HIGH_RISK", "LOW_PHONE_NUMBER_SCORE"};                  // ORANGE


//        String val = "APPROVED";  // GREEN
//        String val = "DECLINED";  // RED
//        String val = "APPROVED","DECLINED";

//        String val = null;                                // YELLOW
//        String val = "REQUIRE_ADDITIONAL_AUTHENTICATION"; // YELLOW

//        String val = "HIGH_RISK";                       // ORANGE
        String val = "0G";                              // ORANGE


//        vals = Optional.ofNullable(vals).orElse(new String[]{});
//
//        boolean isGreen = Arrays.asList(vals).containsAll(Arrays.asList("APPROVED"));
//        boolean isRed = Arrays.asList(vals).containsAll(Arrays.asList("DECLINED"));
//
//        boolean isYellow = (!Arrays.asList(vals).containsAll(Arrays.asList("HIGH_RISK")) && !Arrays.asList(vals).containsAll(Arrays.asList("0G")))
//                            && (!Arrays.asList(vals).containsAll(Arrays.asList("DECLINED")) && !Arrays.asList(vals).containsAll(Arrays.asList("APPROVED")));
//
//        boolean isOrange = Arrays.asList(vals).containsAll(Arrays.asList("HIGH_RISK")) || Arrays.asList(vals).containsAll(Arrays.asList("0G"));
//
//        System.out.println("isGreen = " + isGreen);
//        System.out.println("isRed = " + isRed);
//        System.out.println("isYellow = " + isYellow);
//        System.out.println("isOrange = " + isOrange);

        System.out.println("TokenizationPath = " + toTokenizationPath(vals).getValues());
        System.out.println("TokenizationPath = " + toTokenizationPath(val).getValues());
    }

    public static TokenizationPath toTokenizationPath(String[] args) {
        args = Optional.ofNullable(args).orElse(new String[]{});

        boolean isGreen = Arrays.asList(args).containsAll(Arrays.asList("APPROVED"));
        boolean isRed = Arrays.asList(args).containsAll(Arrays.asList("DECLINED"));
        boolean isOrange = Arrays.asList(args).containsAll(Arrays.asList("HIGH_RISK")) || Arrays.asList(args).containsAll(Arrays.asList("0G"));

        if (isOrange) return TokenizationPath.ORANGE;
        else if (isGreen) return TokenizationPath.GREEN;
        else if (isRed) return TokenizationPath.RED;
        return TokenizationPath.YELLOW;
    }

    public static TokenizationPath toTokenizationPath(String arg) {
        arg = Optional.ofNullable(arg).orElse("");

        TokenizationPath tokenizationPath = TokenizationPath.YELLOW;

        switch (arg) {
            case "HIGH_RISK" : {
                tokenizationPath = TokenizationPath.ORANGE;
                break;
            }
            case "0G" : {
                tokenizationPath = TokenizationPath.ORANGE;
                break;
            }
            case "APPROVED" : {
                tokenizationPath = TokenizationPath.GREEN;
                break;
            }
            case "DECLINED" : {
                tokenizationPath = TokenizationPath.RED;
                break;
            }
        }
        return tokenizationPath;
    }
}
