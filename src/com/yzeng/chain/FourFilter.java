package com.yzeng.chain;

public class FourFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("你", " 你 ");
        msg.setMsg(s);
        return true;
    }
}
