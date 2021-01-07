package com.zking.ssm.model;

import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
@ToString
public class Medicina implements Serializable {
    private Integer mediNo;

    private String mediName;

    private Integer mediTypeNo;

    private String mediUnit;

    private Integer mediNum;

    private Float mediPrice;

    private Date mediData;

    private String mediBzq;

    public Medicina(Integer mediNo, String mediName, Integer mediTypeNo, String mediUnit, Integer mediNum, Float mediPrice, Date mediData, String mediBzq) {
        this.mediNo = mediNo;
        this.mediName = mediName;
        this.mediTypeNo = mediTypeNo;
        this.mediUnit = mediUnit;
        this.mediNum = mediNum;
        this.mediPrice = mediPrice;
        this.mediData = mediData;
        this.mediBzq = mediBzq;
    }

    public Medicina() {
        super();
    }

    public Integer getMediNo() {
        return mediNo;
    }

    public void setMediNo(Integer mediNo) {
        this.mediNo = mediNo;
    }

    public String getMediName() {
        return mediName;
    }

    public void setMediName(String mediName) {
        this.mediName = mediName;
    }

    public Integer getMediTypeNo() {
        return mediTypeNo;
    }

    public void setMediTypeNo(Integer mediTypeNo) {
        this.mediTypeNo = mediTypeNo;
    }

    public String getMediUnit() {
        return mediUnit;
    }

    public void setMediUnit(String mediUnit) {
        this.mediUnit = mediUnit;
    }

    public Integer getMediNum() {
        return mediNum;
    }

    public void setMediNum(Integer mediNum) {
        this.mediNum = mediNum;
    }

    public Float getMediPrice() {
        return mediPrice;
    }

    public void setMediPrice(Float mediPrice) {
        this.mediPrice = mediPrice;
    }

    public Date getMediData() {
        return mediData;
    }

    public void setMediData(Date mediData) {
        this.mediData = mediData;
    }

    public String getMediBzq() {
        return mediBzq;
    }

    public void setMediBzq(String mediBzq) {
        this.mediBzq = mediBzq;
    }
}