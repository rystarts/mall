package com.rystars.mall.admin.urils.jasypt;

import org.apache.commons.lang3.StringUtils;
import org.jasypt.util.text.BasicTextEncryptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.util.Scanner;

/**
 * @author rystars
 * @date 2023/4/11
 * 加密解密工具类
 */
public class EncryptUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(EncryptUtil.class);
    // 读取盐值
    @Value("${jasypt.encryptor.password}")
    private static String password;

    /**
     * 加密
     */
    public static void encrypt() {
        Scanner scan = new Scanner(System.in);
        while (StringUtils.equals("y", scan.nextLine())) {
            BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
            LOGGER.info("------------password------------>>>");
            String password = scan.nextLine();
            LOGGER.info("------------message------------>>>");
            String message = scan.nextLine();
            // 加密秘钥(盐)
            textEncryptor.setPassword(password);
            LOGGER.info(textEncryptor.encrypt(message));
        }
    }

    /**
     * 解密
     *
     * @param encryptedMessage 已被加密的字符串
     * @return 解密后的字符串
     */
    public static String decrypt(String encryptedMessage) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        // 加密秘钥(盐)
        textEncryptor.setPassword(password);
        // 解密
        return textEncryptor.decrypt(encryptedMessage);
    }

    public static void main(String[] args) {
        //生成密文
        encrypt();
        //解密
        LOGGER.info(decrypt("LaDjX+pgbKXd3s5ePIn8fQVMi1zaIqu0"));
    }

}
