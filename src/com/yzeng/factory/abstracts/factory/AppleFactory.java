package com.yzeng.factory.abstracts.factory;

import com.yzeng.factory.abstracts.ApplePhone;
import com.yzeng.factory.abstracts.AppleRouter;
import com.yzeng.factory.abstracts.interfaces.IPhoneProduct;
import com.yzeng.factory.abstracts.interfaces.IProductFactory;
import com.yzeng.factory.abstracts.interfaces.IRouterProduct;

public class AppleFactory implements IProductFactory {
    @Override
    public IPhoneProduct iPhoneProduct() {
        return new ApplePhone();
    }

    @Override
    public IRouterProduct iRouterProduct() {
        return new AppleRouter();
    }
}
