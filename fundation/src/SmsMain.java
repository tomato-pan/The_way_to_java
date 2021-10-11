public class SmsMain {
    public static void main(String[] args) {
        SmsService smsService  = new SmsServiceImpl();
        SmsService smsService1  = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java!!");
        smsService1.send("java!!!");
        smsService.send("11");

    }
}
