package com.example.furniture.model;

import java.io.Serializable;

public class Funiture implements Serializable {
    private int imgfu;
    private String usefu;

    public Funiture(int imgfu, String usefu) {
        this.imgfu = imgfu;
        this.usefu = usefu;
    }

    public int getImgfu() {
        return imgfu;
    }

    public void setImgfu(int imgfu) {
        this.imgfu = imgfu;
    }

    public String getUsefu() {
        return usefu;
    }

    public void setUsefu(String usefu) {
        this.usefu = usefu;
    }
}
