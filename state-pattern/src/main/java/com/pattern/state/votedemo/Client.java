package com.pattern.state.votedemo;

/**
 * Created by zhangWeiJie on 2017/8/4.
 */
public class Client {

    public static void main(String[] args) {

        VoteManager vm = new VoteManager();
        for(int i=0;i<9;i++){
            vm.vote("小明","A");
        }
    }

}
