package com.stratege.pattern.demo;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class IntermediateMemberStratege implements MemberStratege{
    public double calcPrice(double bookPrice) {
        System.out.println("中级会员提供10%的促销折扣");
        return bookPrice*0.9;
    }
}
