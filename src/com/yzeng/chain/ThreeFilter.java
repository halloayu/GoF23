package com.yzeng.chain;

public class ThreeFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        String s = msg.getMsg();
        s = s.replace("上线", "OVO上线OVO");
        msg.setMsg(s);
        return false;
    }
}
