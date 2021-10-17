package com.chz.controller;

import javax.servlet.http.HttpServletRequest;

/**
 * @author snicker
 * @date 2021/10/17 15:21
 * @Describe
 */

public class CodeUtil {

    //将获取到的前端参数转为string类型
    public static String getString(HttpServletRequest request, String key) {
        try {
            String result = request.getParameter(key);
            if(result != null) {
                result = result.trim();
            }
            if("".equals(result)) {
                result = null;
            }
            return result;
        }catch(Exception e) {
            return null;
        }
    }

    //验证码校验
    public static boolean checkVerifyCode(HttpServletRequest request) {
        //获取生成的验证码
        String verifyCodeExpected = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
        //获取用户输入的验证码
        String verifyCodeActual = CodeUtil.getString(request, "verifyCodeActual");
        if(verifyCodeActual == null ||!verifyCodeActual.equals(verifyCodeExpected)) {
            return false;
        }
        return true;
    }


























}
