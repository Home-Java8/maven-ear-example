package com.example.util.test3;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<CardProductDto> cardProductDtos = listAll()
                .stream()
                .collect(Collectors.toList());

//        sortByExtension(cardProductDtos);
//        sortByNarrowing(cardProductDtos);

        for (CardProductDto cardProductDto : cardProductDtos) {
            System.out.println(cardProductDto);
        }


        CardProductDto cardProductDtoDouble = new CardProductDto();
        cardProductDtoDouble.setProductConfigId("4444444444");
        cardProductDtoDouble.setBeginRange(5355571000000222L);
        cardProductDtoDouble.setEndRange(5355571000000666L);

        CardProductDto cardProductDtoOutSide1 = new CardProductDto();
        cardProductDtoOutSide1.setProductConfigId("5555555555");
        cardProductDtoOutSide1.setBeginRange(5355571000000000L);
        cardProductDtoOutSide1.setEndRange(5355572000000000L);

        CardProductDto cardProductDtoOutSide2 = new CardProductDto();
        cardProductDtoOutSide2.setProductConfigId("6666666666");
        cardProductDtoOutSide2.setBeginRange(5355570999999999L);
        cardProductDtoOutSide2.setEndRange(5355572000000000L);

        CardProductDto cardProductDtoOutSide3 = new CardProductDto();
        cardProductDtoOutSide3.setProductConfigId("7777777777");
        cardProductDtoOutSide3.setBeginRange(5355571000000444L);
        cardProductDtoOutSide3.setEndRange(5355571000000555L);

        CardProductDto cardProductDtoCollision1 = new CardProductDto();
        cardProductDtoCollision1.setProductConfigId("8888888888");
        cardProductDtoCollision1.setBeginRange(5355571000000556L);
        cardProductDtoCollision1.setEndRange(5355571999999998L);

        CardProductDto cardProductDtoCollision2 = new CardProductDto();
        cardProductDtoCollision2.setProductConfigId("9999999999");
        cardProductDtoCollision2.setBeginRange(5355571000000555L);
        cardProductDtoCollision2.setEndRange(5355571999999999L);

        CardProductDto cardProductDtoCollision3 = new CardProductDto();
        cardProductDtoCollision3.setProductConfigId("9999999990");
        cardProductDtoCollision3.setBeginRange(5355571000000554L);
        cardProductDtoCollision3.setEndRange(5355571999999999L);

        CardProductDto cardProductDtoCollision4 = new CardProductDto();
        cardProductDtoCollision4.setProductConfigId("9999999900");
        cardProductDtoCollision4.setBeginRange(5355571000000223L);
        cardProductDtoCollision4.setEndRange(5355571999999998L);

        CardProductDto cardProductDtoCollision5 = new CardProductDto();
        cardProductDtoCollision5.setProductConfigId("9999999000");
        cardProductDtoCollision5.setBeginRange(5355571000000111L);
        cardProductDtoCollision5.setEndRange(5355571000000111L);

        CardProductDto cardProductDtoCollision6 = new CardProductDto();
        cardProductDtoCollision6.setProductConfigId("9999990000");
        cardProductDtoCollision6.setBeginRange(5355571000000221L);
        cardProductDtoCollision6.setEndRange(5355571000000666L);

        CardProductDto cardProductDtoCollision7_1 = new CardProductDto();
        cardProductDtoCollision7_1.setProductConfigId("9999900000");
        cardProductDtoCollision7_1.setBeginRange(5355571000000223L);
        cardProductDtoCollision7_1.setEndRange(5355571000000666L);

        CardProductDto cardProductDtoCollision7_2 = new CardProductDto();
        cardProductDtoCollision7_2.setProductConfigId("9999900000");
        cardProductDtoCollision7_2.setBeginRange(5355571000000222L);
        cardProductDtoCollision7_2.setEndRange(5355571000000667L);

        boolean isNotDouble1 = isNotDouble(cardProductDtos, cardProductDtoDouble);
        boolean isNotDouble2 = isNotDouble(cardProductDtos, cardProductDtoOutSide1);
        boolean isNotDouble3 = isNotDouble(cardProductDtos, cardProductDtoOutSide2);
        boolean isOutSide1 = isOutSide(cardProductDtos, cardProductDtoOutSide1);
        boolean isOutSide2 = isOutSide(cardProductDtos, cardProductDtoOutSide2);
        boolean isOutSide3 = isOutSide(cardProductDtos, cardProductDtoOutSide3);
        boolean isInSide1 = isInSide(cardProductDtos, cardProductDtoOutSide3);
        boolean isInSide2 = isInSide(cardProductDtos, cardProductDtoOutSide2);
        boolean isInSide3 = isInSide(cardProductDtos, cardProductDtoDouble);
        boolean isValidationRange1 = isValidationRange(cardProductDtos, cardProductDtoDouble);
        boolean isValidationRange2 = isValidationRange(cardProductDtos, cardProductDtoOutSide3);
        boolean isValidationRange3 = isValidationRange(cardProductDtos, cardProductDtoOutSide1);
        boolean isValidationRange4 = isValidationRange(cardProductDtos, cardProductDtoCollision1);
        boolean isValidationRange5 = isValidationRange(cardProductDtos, cardProductDtoCollision2);
        boolean isValidationRange6 = isValidationRange(cardProductDtos, cardProductDtoCollision3);
        boolean isValidationRange7 = isValidationRange(cardProductDtos, cardProductDtoCollision4);
        boolean isValidationRange8 = isValidationRange(cardProductDtos, cardProductDtoCollision5);
        boolean isValidationRange9 = isValidationRange(cardProductDtos, cardProductDtoCollision6);
        boolean isValidationRange10_1 = isValidationRange(cardProductDtos, cardProductDtoCollision7_1);
        boolean isValidationRange10_2 = isValidationRange(cardProductDtos, cardProductDtoCollision7_2);

        System.out.println("isNotDouble (1) = " + isNotDouble1 + " (false)");
        System.out.println("isNotDouble (2) = " + isNotDouble2 + " (true)");
        System.out.println("isNotDouble (3) = " + isNotDouble3 + " (true)");
        System.out.println("isOutSide (1) = " + isOutSide1 + " (true)");
        System.out.println("isOutSide (2) = " + isOutSide2 + " (true)");
        System.out.println("isOutSide (3) = " + isOutSide3 + " (false)");
        System.out.println("isInSide (1) = " + isInSide1 + " (true)");
        System.out.println("isInSide (2) = " + isInSide2 + " (false)");
        System.out.println("isInSide (3) = " + isInSide3 + " (false)");

        System.out.println("isValidationRange (1) = " + isValidationRange1 + " (false)");
        System.out.println("isValidationRange (2) = " + isValidationRange2 + " (true)");
        System.out.println("isValidationRange (3) = " + isValidationRange3 + " (true)"); // BeginRange(5355571000000000) EndRange(5355572000000000L)
        System.out.println("isValidationRange (4) = " + isValidationRange4 + " (false)"); // BeginRange(5355571000000556) EndRange(5355571999999998)
        System.out.println("isValidationRange (5) = " + isValidationRange5 + " (false)"); // BeginRange(5355571000000555) EndRange(5355571999999999)
        System.out.println("isValidationRange (6) = " + isValidationRange6 + " (false)");
        System.out.println("isValidationRange (7) = " + isValidationRange7 + " (false)");
        System.out.println("isValidationRange (8) = " + isValidationRange8 + " (false)");
        System.out.println("isValidationRange (9) = " + isValidationRange9 + " (true)");  // BeginRange(5355571000000221) EndRange(5355571000000666)
        System.out.println("isValidationRange (10_1) = " + isValidationRange10_1 + " (true)"); // BeginRange(5355571000000223) EndRange(5355571000000666)
        System.out.println("isValidationRange (10_2) = " + isValidationRange10_2 + " (false)"); // BeginRange(5355571000000222) EndRange(5355571000000667)
    }

    static Collection<CardProductDto> listAll() {
        List<CardProductDto> cardProductDtos = new ArrayList<>();

        CardProductDto cardProductDto1 = new CardProductDto();
        cardProductDto1.setProductConfigId("1111111111");
        cardProductDto1.setBeginRange(5355571000000333L);
        cardProductDto1.setEndRange(5355571000000555L);

        CardProductDto cardProductDto2 = new CardProductDto();
        cardProductDto2.setProductConfigId("2222222222");
        cardProductDto2.setBeginRange(5355571000000222L);
        cardProductDto2.setEndRange(5355571000000666L);

        CardProductDto cardProductDto3 = new CardProductDto();
        cardProductDto3.setProductConfigId("2532534511");
        cardProductDto3.setBeginRange(5355571000000000L);
        cardProductDto3.setEndRange(5355571999999999L);

        CardProductDto cardProductDto4 = new CardProductDto();
        cardProductDto4.setProductConfigId("4444444444");
        cardProductDto4.setBeginRange(5355571000000222L);
        cardProductDto4.setEndRange(5355571000000666L);

        cardProductDtos.add(cardProductDto1);
        cardProductDtos.add(cardProductDto2);
        cardProductDtos.add(cardProductDto3);
        cardProductDtos.add(cardProductDto4);
        return cardProductDtos;
    }

    static final boolean isValidationRange(final List<CardProductDto> list, final CardProductDto item) {
        boolean isNotDouble = isNotDouble(list, item);
        boolean isOutSide = isOutSide(list, item);
        boolean isInSide = isInSide(list, item);

        return item.getBeginRange() < item.getEndRange() && isNotDouble && (isOutSide || isInSide);
    }

    private final static void sortByExtension (final List<CardProductDto> list) {
        Collections.sort(list, new Comparator<CardProductDto>() {
            @Override
            public int compare(CardProductDto o1, CardProductDto o2) {
                if (o1.equals(o2)) return 0;
                if (o1.getBeginRange() <= o2.getBeginRange() && o2.getEndRange() <= o1.getEndRange()) return 1;
                if (o2.getBeginRange() <= o1.getBeginRange() && o1.getEndRange() <= o2.getEndRange()) return -1;
                return 0;
            }});
    }

    private final static void sortByNarrowing (final List<CardProductDto> list) {
        Collections.sort(list, new Comparator<CardProductDto>() {
            @Override
            public int compare(CardProductDto o1, CardProductDto o2) {
                if (o1.equals(o2)) return 0;
                if (o2.getBeginRange() <= o1.getBeginRange() && o1.getEndRange() <= o2.getEndRange()) return 1;
                if (o1.getBeginRange() <= o2.getBeginRange() && o2.getEndRange() <= o1.getEndRange()) return -1;
                return 0;
            }});
    }

    private final static boolean isNotDouble(final List<CardProductDto> list, final CardProductDto item) {
        return list!=null && !list.isEmpty() && item!=null
                ? !list.contains(item)
                : false;
    }

    private final static boolean isInSide(final List<CardProductDto> list, final CardProductDto item) {
        boolean notNullAndNotEqual = list!=null && !list.isEmpty() && item!=null
                ? !list.contains(item)
                : false;

        if (!notNullAndNotEqual) return false;

        sortByExtension(list);

        for (CardProductDto cardProductDto: list) {
            if (item.getBeginRange() <= cardProductDto.getEndRange()) {
                if (cardProductDto.getBeginRange() <= item.getBeginRange()) {
                    if (item.getEndRange() <= cardProductDto.getEndRange()) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        }


        CardProductDto lastItem = list.get(list.size()-1);
        if (item.getEndRange() <= lastItem.getEndRange()) {
            return true;
        }

        return false;
    }

    private final static boolean isOutSide(final List<CardProductDto> list, final CardProductDto item) {
        boolean isNotNull = list!=null && !list.isEmpty() && item!=null;
        if (!isNotNull) return false;

        sortByExtension(list);
        CardProductDto lastItem = list.get(list.size()-1);

        boolean  isBothSides = item.getBeginRange() <= lastItem.getBeginRange() && lastItem.getEndRange() <= item.getEndRange();
        boolean   isLeftSide = item.getEndRange() <= lastItem.getBeginRange();
        boolean isRightSides = lastItem.getEndRange() <= item.getBeginRange();
        boolean     notEqual = !lastItem.equals(item);
        boolean    isOutSide = isBothSides || isLeftSide || isRightSides;

        return notEqual && isOutSide;
    }
}
