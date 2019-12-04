package com.chao.cloud.common.web.crypto.annotaion;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 *  加密注解
 * @author 薛超
 * @since 2019年12月3日
 * @version 1.0.8
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface EncryptResponse {
	/**
	 * 是否对结果加密
	 */
	boolean value() default true;
}