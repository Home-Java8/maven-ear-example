package com.example.util.test1;

public class RecommendationReasonsUtil {

    public static void main(String[] args) {

//        RecommendationReasons reasons = RecommendationReasons.ACCOUNT_CARD_TOO_NEW;
////        RecommendationReasonsCode reasonsCode = RecommendationReasonsCode.ACCOUNT_TOO_NEW_SINCE_LAUNCH;
////        RecommendationReasonsCode reasonsCode = RecommendationReasonsCode.valueOf("ACCOUNT_TOO_NEW_SINCE_LAUNCH");
//        RecommendationReasonsCode reasonsCode = RecommendationReasonsCode.valueOfCode("01");
//
//        System.out.println("reasons = " + reasons.getValue());
//        System.out.println("reasonsCode = " + reasonsCode.getCode());
//
//        reasonsCode = RecommendationReasonsCode.valueOf(reasons.name());
//
//        System.out.println("reasons = " + reasons.getValue());
//        System.out.println("reasonsCode = " + reasonsCode.getCode());

        RecommendationReasonsConverter converter = new RecommendationReasonsConverter();


        RecommendationReasonsCode reasonsCode = RecommendationReasonsCode.valueOfCode("01");

        System.out.println("reasonsCode = " + reasonsCode + " >>> " + reasonsCode.getCode());


        RecommendationReasons reasons = converter.convert(reasonsCode);

        System.out.println("reasons = " + reasons + " >>> " + reasons.getValue());


        reasons = RecommendationReasons.ACCOUNT_CARD_TOO_NEW;
        reasonsCode = converter.convert(reasons);

        System.out.println("reasons = " + reasons + " >>> " + reasons.getValue());
        System.out.println("reasonsCode = " + reasonsCode + " >>> " + reasonsCode.getCode());
    }

}
