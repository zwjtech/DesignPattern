package com.pattern.state.votedemo;

/**
 * Created by zhangWeiJie on 2017/8/4.
 */
public class RepeatVoteState implements VoteState {
    public void vote(String user, String voteItem, VoteManager voteManager) {
        //重复投票，暂时不做处理
        System.out.println("请不要重复投票");
    }

}
