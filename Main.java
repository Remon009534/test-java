package com.company;

public class Main {

    static float rechargeAmount(float amount, float m)
    {

        amount = amount + m;

        return amount;
    }
    static float callSomeone(float timeDuration, float m)
    {
        timeDuration = m - timeDuration;

        return timeDuration;
    }
    static boolean callLock(boolean a)
    {
        if(a == true)
        {
            System.out.println("Your phone is lock");
        }
        else
        {
            System.out.println("Your phone is unlocked");
        }
        return a;
    }
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Remon", "01727615541", 200, "Andriod", false);

        float m = m1.getmobileBalance();

        boolean a = m1.getlock();


         m1.setmobileBalance(rechargeAmount(200, m));
         m1.setmobileBalance(callSomeone(2, m));
         m1.setlock(callLock(a));
         
         m1.showinfo();

    }
}
