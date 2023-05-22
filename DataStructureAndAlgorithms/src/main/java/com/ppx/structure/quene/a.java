package com.ppx.structure.quene;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class a {
    public static void main(String[] args) throws Exception {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = LocalDateTime.now().format(dateTimeFormatter);
        System.out.println("format = " + format);
        String str = new StringBuilder().append("appId=").append("appid123").append("&")
                .append("time=").append(format).append("&")
                .append("id=").append("1").toString();
        System.out.println("str = " + str);
        String signSHA256 = Rsa.signSHA256("MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCV5mPIHotiQl+l9SQMZPGVIwDb9cOQ/0P/XRr8yeaPogghU2f8Mkz9rAllqfuiqu0JPJjzmeI+YENpWwz6uBg2MbcawEdOUoTUs/zvrRfl4xvVEZ1EWyHR4tu/etOODcJRaUJn3EFORMRy1pMS6Sy6DwcvbzwrAZZCmkiWRmaGLVKGIq76AnBlC/6RbsYA/YaeL7omT1oGtLrbDCs8LYIGAMDH+DtvSBA0FmwY0P7DEzSrzm/eaRxjygb02u5gDbfV5mCXMFyaXBltCWuex14F1FiPlNwAQ7dyNFaL1al5ZH2qGAEzERmovmoSa+U/l00RTzBfusEPAfKlX4J18wuRAgMBAAECggEAesORyq5BRvrG7NrEaCYvuA1PwdUYEmMMpFHzLT6JRe7Uq75sNh5X8ZT4qTs6a7GCqYLoXPEVWjJqYxl/msI0igXTSORaQanRQYYay4u+O7bw72Iao4XjP8qEX+BO7FMWZqhHC1pWXaxyGv7iuqUezU5LeyylYS9OiUNj2TbU9mNbiamhTnX/7y3TaaGMAhRlRNgt4dlBYSfhcQLn0JqL3yew/ZsYygyQX8mvWcL0CkTkQS4pPcY1Djs2K55I2HggfIckTVscWFG0N/FvNLutA7eiiE/xZrQPDXu+2pcI+7vuj/d9RxflRWJ7QiJQSeZOtVBkPZFmqkwEhBbZ5wZkQQKBgQDXw/WcpKX6kH+8H+lqR6O8o4rhgLaCVqJYvTFx1kAs/UT7veOk9QLW4GCdjHbZRf55WSGRr76Il9q8ZgRcYOgD0MtNIAg83ANzdC2pI8PDEtGLm2tnMqq8BezR1dOGCFpCG6JKjRz5nYTGLLXRLmLEAZ8l5hRa5u2JUiSbnXaoyQKBgQCx2jHxCUjChSsOeyHFMRSm0Pb+q5Aszy2U4o/Bj7Kdpy61Fp1UvfHlhx3tUxKAvDZIlaTAtNHCtpvEuR+cL43nxtq61+4wVcM0NDaZ6gD4CAcPBdhuZ2puh80SLmE/LFpgDdsw2RaB9UbKsfyZmynqUgrMqAMvqkD5k7zMNnD4iQKBgCs2BolhfBArQjml1nQ/dq4/vn+c7HA783V8JlvbAa1A58DW7bFKlE/+Tbsft2maF/WrgQqRPMJUTy0t7S+nBLBG74A5qwytL0++86oNDJaTvT2NWbwoLINNWHlJrnwITjMxH5Z4nlXrUvzxVVRYStVgUcQgSPFPkEDRH52+slXpAoGAEf9qnmG6IzUmrkh3mmTlGhx7YjoqVN6CVla3BXdtM9b/OwQW18SA/iE2PhXyAWUKeT3rdjTWJUYlbTrun/eP/Kx65f2D9RA4uMev3tN3VaI6VKLazBFbC+RiNDzNSn9Khf3g+Ih/ZpdTmp94WHMDQtsajKtT5zbrbFYu/Ntlg0ECgYEAvtjxAG2zlArTfoSgQ5AneGy4kv34DnVer6L1GGbvKAjdKXBW/hEsHsmzRoqzNeRp4w1ZAiWIZoj5i+S/nEC/0EeuyAOT6CUPSP2nKQJ9mJbd3RGw98V0YRd6FbkT/i2OdAkxcZA59ZKp9YsQY85XPmUw6ga/o061UbyF0rhw8TI=", str);
        System.out.println("signSHA256 = " + signSHA256);
    }
}
