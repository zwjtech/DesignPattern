package com.stratege.pattern.demo;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class PrimaryMemberStratege implements MemberStratege {
    public double calcPrice(double bookPrice) {
        System.out.println("对初级会员不打折。");
        return bookPrice;
    }
}
