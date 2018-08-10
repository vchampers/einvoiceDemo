package com.example.demo.entity;

import java.io.Serializable;

public class InvoiceDetail implements Serializable {

    //项目名称
    private String xmmc;
    //项目价税合计
    private double xmjshj;
    //税率
    private double sl;
    //商品编码
    private String spbm;
    //发票请求流水号
    private String fpqqlsh;

    public InvoiceDetail(String xmmc, double xmjshj, double sl, String spbm, String fpqqlsh) {
        this.xmmc = xmmc;
        this.xmjshj = xmjshj;
        this.sl = sl;
        this.spbm = spbm;
        this.fpqqlsh = fpqqlsh;
    }
    public InvoiceDetail(){}

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public double getXmjshj() {
        return xmjshj;
    }

    public void setXmjshj(double xmjshj) {
        this.xmjshj = xmjshj;
    }

    public double getSl() {
        return sl;
    }

    public void setSl(double sl) {
        this.sl = sl;
    }

    public String getSpbm() {
        return spbm;
    }

    public void setSpbm(String spbm) {
        this.spbm = spbm;
    }

    public String getFpqqlsh() {
        return fpqqlsh;
    }

    public void setFpqqlsh(String fpqqlsh) {
        this.fpqqlsh = fpqqlsh;
    }
}

