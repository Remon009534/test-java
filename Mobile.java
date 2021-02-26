package com.company;

public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber;
    private float mobileBalance;
    private String mobileOsName;
    private boolean lock;

    public Mobile(String mobileOwnerName, String mobileNumber, float mobileBalance, String mobileOsName, boolean lock)
    {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOsName = mobileOsName;
        this.lock = lock;
    }
    public String getmobileOwnerName()
    {
        return mobileOwnerName;
    }
    public void setmobileOwnerName(String mobileOwnerName)
    {
        this.mobileOwnerName = mobileOwnerName;
    }
    public String getmobileNumber()
    {
        return mobileNumber;
    }
    public void setmobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }
    public String getmobileOsName()
    {
        return mobileOsName;
    }
    public void setmobileOsName(String mobileOsName)
    {
        this.mobileOsName = mobileOsName;
    }
    public float getmobileBalance()
    {
        return mobileBalance;
    }
    public void setmobileBalance(float mobileBalance)
    {
        this.mobileBalance = mobileBalance;
    }
    public boolean getlock()
    {
        return lock;
    }
    public void setlock(boolean lock)
    {
        this.lock = lock;
    }
    public void showinfo()
    {
        System.out.println(mobileOwnerName);
        System.out.println(mobileOsName);
        System.out.println(mobileNumber);
        System.out.println(lock);
        System.out.println(mobileBalance);
    }
}

