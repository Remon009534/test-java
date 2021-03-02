package com.company;

public class Mobile {
    private static int id;
    private String mobileOwnerName;
    private String mobileNumber;
    private String mobileOsName;
    private float mobileBalance;
    private boolean lock;

    public Mobile(String mobileOwnerName, String mobileNumber, String mobileOsName, float mobileBalance, boolean lock)
    {
        this.id += 1;
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileOsName = mobileOsName;
        this.mobileBalance = mobileBalance;
        this.lock = lock;
    }
    public void rechargeAmount(float amount)
    {
        amount = this.mobileBalance + amount;

        System.out.println(amount);
    }
    public void callSomeone(float timeDuration)
    {
        float m = timeDuration * 0.71f;

        this.mobileBalance = this.mobileBalance - m;

        System.out.println(this.mobileBalance);
    }
    public void showinfo()
    {
        if(!this.lock)
        {
            System.out.println("-----Mobile Information-----");
            System.out.println(this.mobileOwnerName);
            System.out.println(this.mobileNumber);
            System.out.println(this.mobileOsName);
            System.out.println(this.mobileBalance);
        }
        else
        {
            System.out.println("Unlock your phone...");
        }
    }
}


