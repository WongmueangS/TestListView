package com.example.testlistview.model;

/**
 * Created by ADMIN on 29/10/2560.
 */

public class Animal {
    public final String name;//final ดูค่าได้อย่างเดียว แต่่แก้ไขไม่ได้
    public final int picture;
    public final String detail;

    //Alt+ins สร้าง constructor
    public Animal(String name, int picture,String detail) {
        this.name = name;
        this.picture = picture;
        this.detail = detail;

    }


}
