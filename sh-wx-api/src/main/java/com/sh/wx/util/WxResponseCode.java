package com.sh.wx.util;

public class WxResponseCode {
	
	// 账号不存在
	public static final Integer AUTH_INVALID_ACCOUNT = 700;
	
	// 小程序后台验证码服务不支持
	public static final Integer AUTH_CAPTCHA_UNSUPPORT = 701;
	
	// 验证码未超时1分钟，不能发送
	public static final Integer AUTH_CAPTCHA_FREQUENCY = 702;
	
	// 验证码错误
	public static final Integer AUTH_CAPTCHA_UNMATCH = 703;
	
	// 用户名已注册
	public static final Integer AUTH_NAME_REGISTERED = 704;
	
	// 手机号已注册
    public static final Integer AUTH_MOBILE_REGISTERED = 705;
    
    // 手机号未注册
    public static final Integer AUTH_MOBILE_UNREGISTERED = 706;
    
    // 手机号格式不正确
    public static final Integer AUTH_INVALID_MOBILE = 707;
    
    // 获取腾讯官方 openid失败
    public static final Integer AUTH_OPENID_UNACCESS = 708;
    
    // openid已绑定账号
    public static final Integer AUTH_OPENID_BINDED = 709;
    
    // 商品已下架
    public static final Integer GOODS_UNSHELVE = 710;
    
    // 库存不足
    public static final Integer GOODS_NO_STOCK = 711;
    
    // 未找到对应的商品
    public static final Integer GOODS_UNKNOWN = 712;
    
//    public static final Integer GOODS_INVALID = 713;
    
    // 订单不存在
    public static final Integer ORDER_UNKNOWN = 720;
    
    // 不是当前用户的订单
    public static final Integer ORDER_INVALID = 721;
    
    public static final Integer ORDER_CHECKOUT_FAIL = 722;
    
    // 订单取消失败
    public static final Integer ORDER_CANCEL_FAIL = 723;
    
    // 订单不能支付
    public static final Integer ORDER_PAY_FAIL = 724;
    
    // 订单当前状态下不支持用户的操作，例如商品未发货状态用户执行确认收货是不可能的。
    public static final Integer ORDER_INVALID_OPERATION = 725;
    
    // 订单商品已评价
    public static final Integer ORDER_COMMENTED = 726;
    
    // 当前订单评价时间已过期
    public static final Integer ORDER_COMMENT_EXPIRED = 727;
    
    // 团购活动已过期
    public static final Integer GROUPON_EXPIRED = 730;
    
    // 团购已下线
    public static final Integer GROUPON_OFFLINE = 731;
    
    // 团购活动人数已满
    public static final Integer GROUPON_FULL = 732;
    
    // 团购活动已经参加
    public static final Integer GROUPON_JOIN = 733;
    
    // 优惠券已兑换
    public static final int COUPON_EXCEED_LIMIT = 740;
    
    // 新用户优惠券自动发送
    public static final int COUPON_RECEIVE_FAIL= 741;
    
    // 优惠券不正确
    public static final int COUPON_CODE_INVALID= 742;

    // 不支持售后
    public static final int AFTERSALE_UNALLOWED = 750;
    
    // 退款金额不正确
    public static final int AFTERSALE_INVALID_AMOUNT = 751;
    
    // 不能取消售后
    public static final int AFTERSALE_INVALID_STATUS = 752;
}
