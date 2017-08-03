package com.stratege.pattern.demo;

/**
 * Created by zhangWeiJie on 2017/8/3.
 */
public class Client {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象:初级会员，中级会员，高级会员
        //MemberStratege stratege = new PrimaryMemberStratege();
        //MemberStratege stratege = new IntermediateMemberStratege();
        MemberStratege stratege = new AdvancedMemberStratege();
        //创建环境
        Price price = new Price(stratege);
        //计算价格
        double primaryPrice = price.quote(100);
        System.out.println("初级会员价格："+primaryPrice);


    }

}
