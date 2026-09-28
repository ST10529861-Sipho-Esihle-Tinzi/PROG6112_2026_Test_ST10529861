package com.mycompany.prog6112test2026;

public class Console 
{
    private String devicetype;
    private String storeName;
    private int tsales;
    
    public Console(String devicetype,String storeName,int tsales)
    {
        this.devicetype = devicetype;
        this.storeName = storeName;
        this.tsales = tsales;
    }

    public String getDevicetype() 
    {
        return devicetype;
    }

    /**
     * @param devicetype the devicetype to set
     */
    public void setDevicetype(String devicetype) 
    {
        this.devicetype = devicetype;
    }

    /**
     * @return the storeName
     */
    public String getStoreName() 
    {
        return storeName;
    }

    /**
     * @param storeName the storeName to set
     */
    public void setStoreName(String storeName) 
    {
        this.storeName = storeName;
    }

    /**
     * @return the tsales
     */
    public int getTsales() 
    {
        return tsales;
    }

    /**
     * @param tsales the tsales to set
     */
    public void setTsales(int tsales) 
    {
        this.tsales = tsales;
    }
}
