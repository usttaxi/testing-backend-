package com.usttaxi.passenger.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Passenger_Table")
public class Passenger {
	
	
	@Id
    private int uid;



   private int tripid;
    
    
    
    private String d_name;
    private String p_name;
    
    
    private String p_no;
    
    private String source;
    private String dest;
    
    private int kms;
    private int fee;
    
private String email;
    private int payid;



   
    
    public String getD_name() {
        return d_name;
    }
    public void setD_name(String d_name) {
        this.d_name = d_name;
    }
    
    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
    public String getP_no() {
        return p_no;
    }
    public void setP_no(String p_no) {
        this.p_no = p_no;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public String getDest() {
        return dest;
    }
    public void setDest(String dest) {
        this.dest = dest;
    }
    public int getKms() {
        return kms;
    }
    public void setKms(int kms) {
        this.kms = kms;
    }
    public int getFee() {
        return fee;
    }
    public void setFee(int fee) {
        this.fee = fee;
    }
    public int getUid() {
        return uid;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public int getTripid() {
        return tripid;
    }
    public void setTripid(int tripid) {
        this.tripid = tripid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getPayid() {
        return payid;
    }
    public void setPayid(int payid) {
        this.payid = payid;
    }
    
	

}
