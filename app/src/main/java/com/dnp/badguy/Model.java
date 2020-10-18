package com.dnp.badguy;

class Model {
    private int  img;
    private String title;
    private String deskri;

    public Model(int img, String title, String deskri) {
        this.img = img;
        this.title = title;
        this.deskri = deskri;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeskri() {
        return deskri;
    }

    public void setDeskri(String deskri) {
        this.deskri = deskri;
    }
}
