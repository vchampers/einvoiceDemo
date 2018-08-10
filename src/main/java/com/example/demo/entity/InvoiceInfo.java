package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

public class InvoiceInfo implements Serializable {

    //发票请求流水号
    private String fpqqlsh;
    //销售方纳税人识别号
    private String xsfNSRSBH;
    //销售方名称
    private String xsfMC;
    //购买方名称
    private String gmfMC;
    //价税合计
    private double jshj;
    //发票明细
    private List<InvoiceDetail> detailList;

    public InvoiceInfo(String fpqqlsh, String xsfNSRSBH, String xsfMC, String gmfMC, double jshj,
                       List<InvoiceDetail> detail) {
        this.fpqqlsh = fpqqlsh;
        this.xsfNSRSBH = xsfNSRSBH;
        this.xsfMC = xsfMC;
        this.gmfMC = gmfMC;
        this.jshj = jshj;
        this.detailList = detail;
    }
    public InvoiceInfo(){}

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh;
    }

    public String getXsfNSRSBH() {
        return xsfNSRSBH;
    }

    public void setXsfNSRSBH(String xsfNSRSBH) {
        this.xsfNSRSBH = xsfNSRSBH;
    }

    public String getXsfMC() {
        return xsfMC;
    }

    public void setXsfMC(String xsfMC) {
        this.xsfMC = xsfMC;
    }

    public String getGmfMC() {
        return gmfMC;
    }

    public void setGmfMC(String gmfMC) {
        this.gmfMC = gmfMC;
    }

    public double getJshj() {
        return jshj;
    }

    public void setJshj(double jshj) {
        this.jshj = jshj;
    }


    public List<InvoiceDetail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<InvoiceDetail> detailList) {
        this.detailList = detailList;
    }
}
