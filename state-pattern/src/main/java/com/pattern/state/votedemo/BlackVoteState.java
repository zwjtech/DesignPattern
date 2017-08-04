package com.pattern.state.votedemo;

/**
 * Created by zhangWeiJie on 2017/8/4.
 */
public class BlackVoteState implements VoteState {

    public void vote(String user, String voteItem, VoteManager voteManager) {
        //记录黑名单中，禁止登录系统
        System.out.println("进入黑名单，将禁止登录和使用本系统");
    }

}