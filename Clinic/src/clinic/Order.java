package clinic;

import java.util.ArrayList;
import java.util.Scanner;

public class Order {
   int order_num;
   String Date;
   Medical_Supplay m1;
   Doctor d1;
    public Order() {
        
    }

    public Order(int order_num, String Date,Medical_Supplay m1,Doctor d1) {
        
        this.order_num = order_num;
        this.Date=Date;
        this.m1=m1;
        this.d1=d1;
    }

    


    public int getOrder_num() {
        return order_num;
    }

    public void setOrder_num(int order_num) {
        this.order_num = order_num;
    }


    
    @Override
    public String toString() {
        return "Order{" + "order_num=" + order_num + ", Date=" + Date + ", m1=" + m1 + '}';
    }
   public void display(){
   System.out.print("the order number is : ");
   System.out.println(order_num);
     }

   
   public void addsupply(String n){
       for(int i=0;i<arraylists.arr7.size();i++){
       arraylists.arr7.get(i).name= arraylists.arr7.get(i).name+" , "+n;
       if(arraylists.arr7.get(i).name.equals(n)){
          arraylists.arr7.get(i).price=arraylists.arr7.get(i).price+100;
           System.out.print("the medicines are : ");
           System.out.println(arraylists.arr7.get(i).name);
           System.out.print("the total price is : ");
       System.out.println(arraylists.arr7.get(i).price);
      
       }
       }
   }
   
   
 
  }