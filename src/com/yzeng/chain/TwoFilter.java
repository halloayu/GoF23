package com.yzeng.chain;

public class TwoFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("！", "！！！");
        msg.setMsg(s);
        return true;
    }
}
