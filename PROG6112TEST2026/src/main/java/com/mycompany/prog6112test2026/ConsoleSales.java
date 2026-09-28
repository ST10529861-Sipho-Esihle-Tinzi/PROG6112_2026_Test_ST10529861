package com.mycompany.prog6112test2026;

public class ConsoleSales extends Console
{
     public ConsoleSales(String devicetype,String storeName,int tsales)
     {
         super(devicetype,storeName,tsales);
     } 
     
      public void printReport() 
    {
        System.out.println("Device Type: " + getDevicetype());
        System.out.println("Store Name: R" +getStoreName() );
        System.out.println("Total sales: R" +getTsales());
    }
}
