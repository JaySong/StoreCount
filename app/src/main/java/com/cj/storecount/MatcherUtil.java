package com.cj.storecount;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 匹配工具类
 * Created by Q.Jay on 2015/7/8 0008.
 */
public class MatcherUtil {

    private MatcherUtil() {

    }

    /**
     * @param regex
     * @param input
     * @return
     */
    public static boolean regexMatcher(String regex, String input) {
        Pattern p = Pattern.compile(regex);
        Matcher matcher = p.matcher(input);
        return matcher.matches();
    }

    public static String getTencentBuyerCount(String content) {
        String reg = "^<div class=\"det-ins-num\">(\\d)下载</div>\n";
        String str = content;
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        if (m.find()) {
            return m.group(1);
        }
        return null;
    }

}
