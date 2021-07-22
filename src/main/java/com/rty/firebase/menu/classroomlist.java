package com.rty.firebase.menu;

public class classroomlist
{
     static String s1,s2;
     public static void main(String[] args){
        ClassRoomView cr = new ClassRoomView(s1,s2);
        cr.testclass();
        cr.testclass1();
        cr.setVisible(true);
     }

    classroomlist(String urno, String ucce) {
        s1 = urno;
        s2 = ucce;
    }
      
}
