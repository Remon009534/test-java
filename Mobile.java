package com.company;

public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber;
    private String mobileOsName;
    private float mobileBalance;
    private boolean lock;

    public Mobile(String mobileOwnerName, String mobileNumber, String mobileOsName, float mobileBalance, boolean lock)
    {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileOsName = mobileOsName;
        this.mobileBalance = mobileBalance;
        this.lock = lock;
    }
    public void showinfo()
    {
        System.out.println(this.mobileOwnerName);
        System.out.println(this.mobileNumber);
        System.out.println(this.mobileOsName);
        System.out.println(this.mobileBalance);
        System.out.println(this.lock);
    }
}


