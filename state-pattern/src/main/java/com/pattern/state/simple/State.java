package com.pattern.state.simple;

/**
 * Created by zhangWeiJie on 2017/8/4.
 */
public interface State {
    /**
     * 状态对应的处理
     */
    public void handle(String sampleParameter);
}
