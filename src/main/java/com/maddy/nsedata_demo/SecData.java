package com.maddy.nsedata_demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sec_bhavdata")
public class SecData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String symbol;
    private String SERIES;
    private String DATE1;
    private String PREV_CLOSE;
    private String OPEN_PRICE;
    private String HIGH_PRICE;
    private String LOW_PRICE;
    private String LAST_PRICE;
    private String CLOSE_PRICE;
    private String AVG_PRICE;
    private String TTL_TRD_QNTY;
    private String TURNOVER_LACS;
    private String NO_OF_TRADES;
    private String DELIV_QTY;
    private String DELIV_PER;

    public void setSYMBOL(String sYMBOL) {
        symbol = sYMBOL;
    }

    public void setSERIES(String sERIES) {
        SERIES = sERIES;
    }

    public void setDATE1(String dATE1) {
        DATE1 = dATE1;
    }

    public void setPREV_CLOSE(String pREV_CLOSE) {
        PREV_CLOSE = pREV_CLOSE;
    }

    public void setOPEN_PRICE(String oPEN_PRICE) {
        OPEN_PRICE = oPEN_PRICE;
    }

    public void setHIGH_PRICE(String hIGH_PRICE) {
        HIGH_PRICE = hIGH_PRICE;
    }

    public void setLOW_PRICE(String lOW_PRICE) {
        LOW_PRICE = lOW_PRICE;
    }

    public void setLAST_PRICE(String lAST_PRICE) {
        LAST_PRICE = lAST_PRICE;
    }

    public void setCLOSE_PRICE(String cLOSE_PRICE) {
        CLOSE_PRICE = cLOSE_PRICE;
    }

    public void setAVG_PRICE(String aVG_PRICE) {
        AVG_PRICE = aVG_PRICE;
    }

    public void setTTL_TRD_QNTY(String tTL_TRD_QNTY) {
        TTL_TRD_QNTY = tTL_TRD_QNTY;
    }

    public void setTURNOVER_LACS(String tURNOVER_LACS) {
        TURNOVER_LACS = tURNOVER_LACS;
    }

    public void setNO_OF_TRADES(String nO_OF_TRADES) {
        NO_OF_TRADES = nO_OF_TRADES;
    }

    public void setDELIV_QTY(String dELIV_QTY) {
        DELIV_QTY = dELIV_QTY;
    }

    public void setDELIV_PER(String dELIV_PER) {
        DELIV_PER = dELIV_PER;
    }

    @Override
    public String toString() {
        return "SecData [SYMBOL=" + symbol + ", SERIES=" + SERIES + ", DATE1=" + DATE1 + ", PREV_CLOSE=" + PREV_CLOSE
                + ", OPEN_PRICE=" + OPEN_PRICE + ", HIGH_PRICE=" + HIGH_PRICE + ", LOW_PRICE=" + LOW_PRICE
                + ", LAST_PRICE=" + LAST_PRICE + ", CLOSE_PRICE=" + CLOSE_PRICE + ", AVG_PRICE=" + AVG_PRICE
                + ", TTL_TRD_QNTY=" + TTL_TRD_QNTY + ", TURNOVER_LACS=" + TURNOVER_LACS + ", NO_OF_TRADES="
                + NO_OF_TRADES + ", DELIV_QTY=" + DELIV_QTY + ", DELIV_PER=" + DELIV_PER + "]";
    }

    public String getDELIV_PER() {
        return DELIV_PER;
    }

    public String getDELIV_QTY() {
        return DELIV_QTY;
    }

    public String getNO_OF_TRADES() {
        return NO_OF_TRADES;
    }

    public String getTURNOVER_LACS() {
        return TURNOVER_LACS;
    }

    public String getTTL_TRD_QNTY() {
        return TTL_TRD_QNTY;
    }

    public String getAVG_PRICE() {
        return AVG_PRICE;
    }

    public String getCLOSE_PRICE() {
        return CLOSE_PRICE;
    }

    public String getLAST_PRICE() {
        return LAST_PRICE;
    }

    public String getLOW_PRICE() {
        return LOW_PRICE;
    }

    public String getHIGH_PRICE() {
        return HIGH_PRICE;
    }

    public String getOPEN_PRICE() {
        return OPEN_PRICE;
    }

    public String getPREV_CLOSE() {
        return PREV_CLOSE;
    }

    public String getDATE1() {
        return DATE1;
    }

    public String getSERIES() {
        return SERIES;
    }

    public String getSYMBOL() {
        return symbol;
    }

}
