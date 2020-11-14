package com.fh.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Baby {

    private Integer babyId;//娃娃ID
    private String babyName;//娃娃名称(条件)
    private BigDecimal babyPrice;//娃娃价格(条件,最小价格-最大价格)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date babyDate;//生产日期(条件、最早时间-最晚时间)
    private Integer babySize;//娃娃大小(条件、单选按钮,1:小型 2:中型 3:P大型)
    private Integer typeId;//外键，关联类型表(条件、动态下拉)
    private String typeName;//外键，关联类型表(条件、动态下拉)

    public Integer getBabyId() {
        return babyId;
    }

    public void setBabyId(Integer babyId) {
        this.babyId = babyId;
    }

    public String getBabyName() {
        return babyName;
    }

    public void setBabyName(String babyName) {
        this.babyName = babyName;
    }

    public BigDecimal getBabyPrice() {
        return babyPrice;
    }

    public void setBabyPrice(BigDecimal babyPrice) {
        this.babyPrice = babyPrice;
    }

    public Date getBabyDate() {
        return babyDate;
    }

    public void setBabyDate(Date babyDate) {
        this.babyDate = babyDate;
    }

    public Integer getBabySize() {
        return babySize;
    }

    public void setBabySize(Integer babySize) {
        this.babySize = babySize;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
