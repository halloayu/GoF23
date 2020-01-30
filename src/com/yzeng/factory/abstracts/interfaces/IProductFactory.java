package com.yzeng.factory.abstracts.interfaces;


/**
 * 抽象产品工厂
 */
public interface IProductFactory {
    // 生产手机
    IPhoneProduct iPhoneProduct();

    // 生产路由器
    IRouterProduct iRouterProduct();
}
