package com.example.baosha.utils;

import java.util.UUID;

/**
 * UUID工具类
 */
public class UUIDUtil {

   public static String uuid() {
      return UUID.randomUUID().toString().replace("-", "");
   }

}