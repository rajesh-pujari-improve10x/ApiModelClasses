package com.improve10x.apimodelclassespractice.model;

import com.google.gson.annotations.SerializedName;
import com.improve10x.apimodelclassespractice.model.CurrentSubtotalPriceSet;

public class TaxLine {

    @SerializedName("channel_liable")
    private boolean channelLiable;

    private String price;

    @SerializedName("price_set")
    private CurrentSubtotalPriceSet priceSet;

    private Float rate;

    private String title;

    public boolean isChannelLiable() {
        return channelLiable;
    }

    public void setChannelLiable(boolean channelLiable) {
        this.channelLiable = channelLiable;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public CurrentSubtotalPriceSet getPriceSet() {
        return priceSet;
    }

    public void setPriceSet(CurrentSubtotalPriceSet priceSet) {
        this.priceSet = priceSet;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
