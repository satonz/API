package com.Test;

import java.util.ArrayList;
import java.util.Collections;

public class pokers {

    public static void main(String[] args) {
        demo();
    }


    /**
     * 斗地主
     */
    private static void demo() {
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] huase = {"♥","♦","♠","♣"};
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        for (String s : huase) {
            for (String num : nums) {
//                System.out.println(s+num);
            poker.add(s+num);
            }
        }

        Collections.shuffle(poker);
//        System.out.println(poker);

        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();
        for (int i = 0; i <poker.size() ; i++) {
            if(i>50){
                String e = poker.get(i);
                dipai.add(e);
            }else if(i%3==0){
                play01.add(poker.get(i));
            }else if(i%3==1){
                play02.add(poker.get(i));
            }else if(i%3==2){
                play03.add(poker.get(i));
            }
        }
        System.out.println("玩家1的牌:"+play01);
        System.out.println("玩家2的牌:"+play02);
        System.out.println("玩家3的牌"+play03);
        System.out.println("底牌:"+dipai);
    }
}
