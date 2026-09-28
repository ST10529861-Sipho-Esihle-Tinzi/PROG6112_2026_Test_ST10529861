package com.mycompany.prog6112test2026;

public class PROG6112TEST2026 
{

    public static void main(String[] args) 
    {
        System.out.println("--------------------------------");
        System.out.print("Gaming Console Report");
        System.out.println("--------------------------------");
     
        //Arrays 
         int[] allSales ={1000,2000,3000,2000,3000,4000,1500,1100,1200};
         int [][] sales ={{1000,2000,3000},
                         {2000,3000,4000},
                        {1500,1100,1200}};
    
      //Display of arrays
    for(int i = 0; i< allSales.length;i++)
    {
        System.out.println();
        for(int j=0; j<3;i++)
        {
            System.out.print(sales[i][j] + "");
        }
  
    }
    
    System.out.println("--------------------------------------");
    System.out.println("Console Sales Totals for each city");
    System.out.println("--------------------------------------");
    
    System.out.println("Cape Town" + 6000);
    System.out.println("Port Elizabeth" + 9000);
    System.out.println("Pretoria" + 38000);
    
    System.out.println("City with the most sales :"+ "Port Elizabeth");
    System.out.println("--------------------------------------");
    }
}
