package com.example.util.test1;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecommendationReasonsConverter {

    public RecommendationReasonsCode convert(RecommendationReasons recommendationReasons) {
        return RecommendationReasonsCode.valueOf(recommendationReasons.name());
    }

    public RecommendationReasons convert(RecommendationReasonsCode recommendationReasonsCode) {
        return RecommendationReasons.valueOf(recommendationReasonsCode.name());
    }

    public String[] convert(String reasonCodes) {
        reasonCodes = reasonCodes.replace("[","").replace("]","").replace(" ","");
        String[] codes = reasonCodes.split(",");

        List<String> list = Arrays.asList(codes).stream()
                .filter(code -> StringUtils.isNoneBlank(code) && RecommendationReasonsCode.valueOfCode(code)!=null)
                .map(code -> convert(RecommendationReasonsCode.valueOfCode(code)).getValue())
                .collect(Collectors.toList());
        return list.toArray(new String[list.size()]);
    }
}
