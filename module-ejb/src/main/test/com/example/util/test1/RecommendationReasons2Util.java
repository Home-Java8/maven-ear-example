package com.example.util.test1;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecommendationReasons2Util {

    private static RecommendationReasonsConverter recommendationReasonsConverter = new RecommendationReasonsConverter();

    public static void main(String[] args) {

        String strCodes = "[]";
        strCodes = strCodes.replace("[","").replace("]","").replace(" ","");
        String[] codes = strCodes.split(",");

        System.out.println(codes.length);
        System.out.println(Arrays.toString(codes));

        List<String> list = Arrays.asList(codes).stream()
                .filter(code -> StringUtils.isNoneBlank(code))
                .map(code -> recommendationReasonsConverter.convert(RecommendationReasonsCode.ACCOUNT_CARD_TOO_NEW.valueOfCode(code)).getValue())
                .collect(Collectors.toList());

        String[] codes2 = list.toArray(new String[list.size()]);

        System.out.println(codes2.length);
        System.out.println(Arrays.toString(codes2));

    }

}
