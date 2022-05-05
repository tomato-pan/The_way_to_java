package javaFactoryDemo;

import javaFactoryDemo.impl.CardCommodityService;
import javaFactoryDemo.impl.CouponCommodityService;
import javaFactoryDemo.impl.GoodsCommodityService;

import java.util.HashMap;
import java.util.Map;

public class CommodityFactory {
    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

    public static void main(String[] args) {
        CommodityFactory storeFactory = new CommodityFactory();
        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        try {
            commodityService_1.sendCommodity("10001", "EGM1023938910232121323432", "791098764902132", null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);

        Map<String,String> extMap = new HashMap<String,String>();
        extMap.put("consigneeUserName", "谢飞机");
        extMap.put("consigneeUserPhone", "15200292123");
        extMap.put("consigneeUserAddress", "吉林省.长春市.双阳区.XX街道.檀溪苑小区.#18-2109");

        try {
            commodityService_2.sendCommodity("10001","9820198721311","1023000020112221113", extMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        try {
            commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
