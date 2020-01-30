package com.yzeng.factory.abstracts.factory;

import com.yzeng.factory.abstracts.XiaomiPhone;
import com.yzeng.factory.abstracts.XiaomiRouter;
import com.yzeng.factory.abstracts.interfaces.IPhoneProduct;
import com.yzeng.factory.abstracts.interfaces.IProductFactory;
import com.yzeng.factory.abstracts.interfaces.IRouterProduct;

public class XiaomiFactory implements IProductFactory {
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new XiaomiRouter();
    }
}
