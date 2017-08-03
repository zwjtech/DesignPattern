package com.stratege.pattern.demo;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Price {
    //持有一个具体的策略对象
    private MemberStratege memberStratege;

    /**
     * 构造函数，传入一个具体的策略对象
     * @param memberStratege 具体的策略对象
     */
    public Price(MemberStratege memberStratege) {
        this.memberStratege = memberStratege;
    }

    /**
     * 计算图书的价格
     * @param bookPrice  图书的原价
     * @return 计算出打折后的价格
     */
    public double quote(double bookPrice){
        return memberStratege.calcPrice(bookPrice);
    }

}
