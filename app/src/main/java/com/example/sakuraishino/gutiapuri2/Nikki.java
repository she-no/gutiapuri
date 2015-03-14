package com.example.sakuraishino.gutiapuri2;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by sakuraishino on 15/03/14.
 */


@Table(name = "test")
public class Nikki extends Model {

    @Column(name = "comment")
    public String comment;

    public Nikki(){
        super();
    }
}