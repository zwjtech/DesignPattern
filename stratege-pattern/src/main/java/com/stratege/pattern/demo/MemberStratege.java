package com.stratege.pattern.demo;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public interface MemberStratege {
    /**
     * 计算图书的价格
     * @param bookPrice 图书的原价
     * @return 计算出打折后的价格
     */
    public double calcPrice(double bookPrice);
}
