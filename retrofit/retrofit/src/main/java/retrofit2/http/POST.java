/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package retrofit2.http;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import okhttp3.HttpUrl;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Make a POST request.
 *
 * 用于发送一个POST请求
 * POST注解一般必须添加相对路径或绝对路径或者全路径,如果不想在POST注解后添加请求路径,
 * 则可以在方法的第一个参数中用@Url注解添加请求路径
 */
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface POST {
    /**
     * A relative or absolute path, or full URL of the endpoint. This value is optional if the first
     * parameter of the method is annotated with {@link Url @Url}.
     * <p>
     * See {@linkplain retrofit2.Retrofit.Builder#baseUrl(HttpUrl) base URL} for details of how
     * this is resolved against a base URL to create the full endpoint URL.
     */
    String value() default "";
}