package com.maddy.nsedata_demo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity

@Table(name="SYMBOL_DTL")
public class SymbolData implements Serializable{

    @Id
  @GeneratedValue(strategy=GenerationType.TABLE)
  private Integer id;
private String  symbol;

private String  NameOfCompany;
private String  Series;
private String  DateOfListing;
private String  paidUpValue;
private String  MarketLot;

private String  IsinNumber;
private String  FaceValue;


public SymbolData() {
}
public Integer getId() {
    return id;
}
public void setId(Integer id) {
    this.id = id;
}
public String getSYMBOL() {
    return symbol;
}
public void setSYMBOL(String sYMBOL) {
    symbol = sYMBOL;
}
@Transient
public String getNameOfCompany() {
    return NameOfCompany;
}
public void setNameOfCompany(String nameOfCompany) {
    NameOfCompany = nameOfCompany;
}
public String getSeries() {
    return Series;
}
public void setSeries(String series) {
    Series = series;
}
public String getDateOfListing() {
    return DateOfListing;
}
public void setDateOfListing(String dateOfListing) {
    DateOfListing = dateOfListing;
}
public String getPaidUpValue() {
    return paidUpValue;
}
public void setPaidUpValue(String paidUpValue) {
    this.paidUpValue = paidUpValue;
}
public String getMarketLot() {
    return MarketLot;
}
public void setMarketLot(String marketLot) {
    MarketLot = marketLot;
}
public String getIsinNumber() {
    return IsinNumber;
}
public void setIsinNumber(String isinNumber) {
    IsinNumber = isinNumber;
}
public String getFaceValue() {
    return FaceValue;
}
public void setFaceValue(String faceValue) {
    FaceValue = faceValue;
}
    
}
