package com.stratege.pattern.demo;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class AdvancedMemberStratege implements MemberStratege{
    public double calcPrice(double bookPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return bookPrice*0.8;
    }
}
