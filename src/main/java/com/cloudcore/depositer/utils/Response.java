/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cloudcore.depositer.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author neeraj
 */

@SuppressWarnings({"ALL", "unused"})
public class Response {

    @SerializedName("cloudcore")
    @Expose
    private List<Cloudcoin> cloudcoin = null;

    public List<Cloudcoin> getCloudcoin() {
        return cloudcoin;
    }

    public void setCloudcoin(List<Cloudcoin> cloudcoin) {
        this.cloudcoin = cloudcoin;
    }
}

