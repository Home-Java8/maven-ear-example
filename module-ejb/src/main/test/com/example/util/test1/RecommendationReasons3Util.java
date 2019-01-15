package com.example.util.test1;

import java.util.Arrays;

public class RecommendationReasons3Util {

    private static RecommendationReasonsConverter recommendationReasonsConverter = new RecommendationReasonsConverter();

    public static void main(String[] args) {


        String reasonCodes = "[01,02,0G,0F]";

        String[] recommendationReasons = recommendationReasonsConverter.convert(reasonCodes);
        TokenizationPath recommendationReasonsPath = TokenizationPathUtil.toTokenizationPath(recommendationReasons);

        System.out.println("reasonCodes >>> " + reasonCodes);
        System.out.println("reasonCodes.length >>> " + reasonCodes.length());
        System.out.println("recommendationReasons >>> " + Arrays.toString(recommendationReasons));
        System.out.println("recommendationReasons.length >>> " + recommendationReasons.length);
        System.out.println("recommendationReasonsPath >>> " + recommendationReasonsPath);
    }

}
