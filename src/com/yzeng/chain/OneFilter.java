package com.yzeng.chain;

public class OneFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("奔走相告", "喜大普奔");
        msg.setMsg(s);
        return true;
    }
}
