/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudcoin.depositer.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author neeraj
 */

public class Cloudcoin {

    @SerializedName("nn")
    @Expose
    private String nn;
    @SerializedName("sn")
    @Expose
    private String sn;
    @SerializedName("an")
    @Expose
    private List<String> an = null;
    @SerializedName("ed")
    @Expose
    private String ed;
    @SerializedName("pown")
    @Expose
    private String pown;
    @SerializedName("aoid")
    @Expose
    private List<String> aoid = null;

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public List<String> getAn() {
        return an;
    }

    public void setAn(List<String> an) {
        this.an = an;
    }

    public String getEd() {
        return ed;
    }

    public void setEd(String ed) {
        this.ed = ed;
    }

    public String getPown() {
        return pown;
    }

    public void setPown(String pown) {
        this.pown = pown;
    }

    public List<String> getAoid() {
        return aoid;
    }

    public void setAoid(List<String> aoid) {
        this.aoid = aoid;
    }

    @Override
    public String toString() {
        return "Cloudcoin{" + "nn=" + nn + ", sn=" + sn + ", an=" + an + ", ed=" + ed + ", pown=" + pown + ", aoid=" + aoid + '}';
    }

    
}
