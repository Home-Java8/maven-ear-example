package com.example.util.test3;

import java.util.Objects;

public class CardProductDto {

    private String productConfigId;

    private Long beginRange;

    private Long endRange;

    public String getProductConfigId() {
        return productConfigId;
    }

    public void setProductConfigId(String productConfigId) {
        this.productConfigId = productConfigId;
    }

    public Long getBeginRange() {
        return beginRange;
    }

    public void setBeginRange(Long beginRange) {
        this.beginRange = beginRange;
    }

    public Long getEndRange() {
        return endRange;
    }

    public void setEndRange(Long endRange) {
        this.endRange = endRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardProductDto that = (CardProductDto) o;
        return Objects.equals(beginRange, that.beginRange) &&
                Objects.equals(endRange, that.endRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginRange, endRange);
    }

    @Override
    public String toString() {
        return "CardProductDto{" +
                "productConfigId='" + productConfigId + '\'' +
                ", beginRange=" + beginRange +
                ", endRange=" + endRange +
                '}';
    }
}
