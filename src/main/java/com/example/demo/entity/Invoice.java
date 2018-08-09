package com.example.demo.entity;

import java.io.Serializable;

public class Invoice implements Serializable {

    //发票请求流水号
    private String fpqqlsh;
    //销售方纳税人识别号
    private String xsfNSRSBH;
    //销售方名称
    private String xsfMC;
    //购买方名称
    private String gmfMC;
    //价税合计
    private String jshj;
    //项目名称
    private String xmmc;
    //项目价税合计
    private double xmjshj;
    //税率
    private double sl;
    //商品编码
    private String spbm;

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

    public String getJshj() {
        return jshj;
    }

    public void setJshj(String jshj) {
        this.jshj = jshj;
    }

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

//    @Override
//    public String toString(){
//        return "{" +
//                "fpqqlsh: '" + fpqqlsh + "\', " +
//                "xsfNSRSBH: '" + xsfNSRSBH + "\', " +
//                "xsfMC: '" + xsfMC + "\', " +
//                "gmfMC: '" + gmfMC + "\', " +
//                "jshj: '" + jshj + "\', " +
//                "xmmc: '" + xmmc + "\', " +
//                "xmjshj: '" + xmjshj + "\', " +
//                "sl: '" + sl + "\', " +
//                "spbm: '" + spbm + "\' " +
//                '}';
//    }
}
