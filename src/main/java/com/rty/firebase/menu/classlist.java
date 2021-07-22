package com.rty.firebase.menu;
public class classlist 
{ public static String rno;
    public classlist(String uro) {
         rno= uro;
    }
   public static void main(String[] args){
       
        myclasses mc = new myclasses(rno);
        mc.test_list();
        mc.setVisible(true);
     }   

    
    

   
}
