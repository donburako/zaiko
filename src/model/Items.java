/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

import java.net.URL;
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 *
 * @author HikariHasegawa
 */
/*@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Items implements Serializable{
    private String itemId;
    private String itemName;
    private int price;
    private int num;
    

    public Items(String itemId,String itemName,int price,int num){
        this.itemId=itemId;
        this.itemName=itemName;
        this.price=price;
        this.num=num;
    }
    public String getItemId(){
        return itemId;
    }
    public String getItemName(){
        return itemName;
    }
    public int getPrice(){
        return price;
    }
    public int getNum(){
        return num;
    }
}

import java.net.URL;
import java.util.Date;
 
import javax.jdo.annotations.*;
 */

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Items {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private String itemId;
     
    @Persistent
    private String itemName;
     
    @Persistent
    private int price;
     
    @Persistent
    private int num;
     
    @Persistent
    private Date datetime;
 
    public  void LinkData(String itemId,String itemName,int price,int num) {
       // super();       

        this.itemId=itemId;
        this.itemName=itemName;
        this.price=price;
        this.num=num;
    }
    
    
    public String getItemId(){
        return itemId;
    }
    public String getItemName(){
        return itemName;
    }
    public int getPrice(){
        return price;
    }
    public int getNum(){
        return num;
    }
    
 
 
    public void setId(String itemid) {
        this.itemId = itemid;
    }
 
 
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
 
    public void setPrice(int price) {
        this.price=price;
    }
 
    public void setNum(int num) {
        this.num = num;
    }
 
    
    public Date getDatetime() {
        return datetime;
    }
 
    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }
}
