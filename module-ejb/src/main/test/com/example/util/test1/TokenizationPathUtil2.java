package com.example.util.test1;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Optional;

public class TokenizationPathUtil2 {

    public static void main(String[] args) {

//        String[] recommendationReasons = {"ACCOUNT_TOO_NEW_SINCE_LAUNCH", "ACCOUNT_TOO_NEW", "ACCOUNT_CARD_TOO_NEW", "ACCOUNT_RECENTLY_CHANGED", "SUSPICIOUS_ACTIVITY", "INACTIVE_ACCOUNT", "HAS_SUSPENDED_TOKENS", "DEVICE_RECENTLY_LOST", "TOO_MANY_RECENT_ATTEMPTS", "TOO_MANY_RECENT_TOKENS", "TOO_MANY_DIFFERENT_CARDHOLDERS", "LOW_DEVICE_SCORE", "LOW_ACCOUNT_SCORE", "OUTSIDE_HOME_TERRITORY", "UNABLE_TO_ASSESS", "HIGH_RISK", "LOW_PHONE_NUMBER_SCORE"};
//        String[] recommendationReasons = {"DECLINED"};
//        String[] recommendationReasons = {"ACCOUNT_TOO_NEW_SINCE_LAUNCH", "ACCOUNT_TOO_NEW", "ACCOUNT_CARD_TOO_NEW", "ACCOUNT_RECENTLY_CHANGED", "SUSPICIOUS_ACTIVITY", "INACTIVE_ACCOUNT", "HAS_SUSPENDED_TOKENS", "DEVICE_RECENTLY_LOST", "TOO_MANY_RECENT_ATTEMPTS", "TOO_MANY_RECENT_TOKENS", "TOO_MANY_DIFFERENT_CARDHOLDERS", "LOW_DEVICE_SCORE", "LOW_ACCOUNT_SCORE", "OUTSIDE_HOME_TERRITORY", "UNABLE_TO_ASSESS", "LOW_PHONE_NUMBER_SCORE"};
        String[] recommendationReasons = null;
//        String[] recommendationReasons = {};
//        String recommendedDecision = "APPROVED";
        String recommendedDecision = null;
//        String recommendedDecision = "";

        TokenizationPath recommendationReasonsPath = toTokenizationPath(recommendationReasons);
        TokenizationPath recommendedDecisionPath = toTokenizationPath(recommendedDecision);

        System.out.println("recommendationReasonsPath = " + recommendationReasonsPath.getValues());
        System.out.println("recommendedDecisionPath = " + recommendedDecisionPath.getValues());




        TokenizationPath identifyTokenizationPath = identifyTokenizationPath(recommendedDecision, recommendationReasons);
        System.out.println("identifyTokenizationPath = " + identifyTokenizationPath.getValues());
    }

    public static TokenizationPath identifyTokenizationPath(String recommendedDecision, String[] recommendationReasons) {
        TokenizationPath recommendationReasonsPath = toTokenizationPath(recommendationReasons);
        TokenizationPath recommendedDecisionPath = toTokenizationPath(recommendedDecision);

        if (isRecommendationReasons(recommendationReasons)) {
            return recommendationReasonsPath;
        } else if (isRecommendedDecision(recommendedDecision, recommendationReasonsPath)) {
            return recommendedDecisionPath;
        }
        return TokenizationPath.YELLOW;
    }

    private static TokenizationPath toTokenizationPath(String[] args) {
        args = Optional.ofNullable(args).orElse(new String[]{});

        boolean isGreen = Arrays.asList(args).containsAll(Arrays.asList("APPROVED"));
        boolean isRed = Arrays.asList(args).containsAll(Arrays.asList("DECLINED"));
        boolean isOrange = Arrays.asList(args).containsAll(Arrays.asList("HIGH_RISK")) || Arrays.asList(args).containsAll(Arrays.asList("0G"));

        if (isOrange) return TokenizationPath.ORANGE;
        else if (isGreen) return TokenizationPath.GREEN;
        else if (isRed) return TokenizationPath.RED;
        return TokenizationPath.YELLOW;
    }

    private static TokenizationPath toTokenizationPath(String arg) {
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

    private static boolean isRecommendationReasons(String[] recommendationReasons) {
        return recommendationReasons != null && 0 < recommendationReasons.length;
    }

    private static boolean isRecommendedDecision(String recommendedDecision, TokenizationPath recommendationReasonsPath) {
        return StringUtils.isNotBlank(recommendedDecision) && recommendationReasonsPath != TokenizationPath.ORANGE;
    }
}
