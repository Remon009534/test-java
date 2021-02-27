package com.company;

public class Main {

    static float rechargeAmount(float amount, float m)
    {

        amount = amount + m;

        return amount;
    }
    static float callSomeone(float timeDuration)
    {
        float m = 0.71f;
        float z;

        z = timeDuration - m;

        return z;
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
        Mobile m2 = new Mobile("Deba", "0123454321", 100, "Ios", true);

        float m = m1.getmobileBalance();
        m = m2.getmobileBalance();

        boolean a = m1.getlock();
         a = m2.getlock();

         m1.setmobileBalance(rechargeAmount(200, m));
         m1.setmobileBalance(callSomeone(2));
         m1.setlock(callLock(a));

         m2.setmobileBalance(rechargeAmount(300, m));
         m2.setmobileBalance(callSomeone(3));

         m1.showinfo();
         System.out.println("---------------");
         m2.showinfo();

    }
}
