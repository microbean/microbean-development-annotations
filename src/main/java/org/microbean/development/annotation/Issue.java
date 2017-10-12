/* -*- mode: Java; c-basic-offset: 2; indent-tabs-mode: nil; coding: utf-8-unix -*-
 *
 * Copyright © 2017 MicroBean.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.microbean.development.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Describes an <em>issue</em> that is related to the annotated
 * element.
 *
 * @author <a href="https://about.me/lairdnelson/"
 * target="_parent">Laird Nelson</a>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({
  ElementType.ANNOTATION_TYPE,
  ElementType.CONSTRUCTOR,
  ElementType.FIELD,
  ElementType.LOCAL_VARIABLE,
  ElementType.METHOD,
  ElementType.PACKAGE,
  ElementType.PARAMETER,
  ElementType.TYPE,
  ElementType.TYPE_PARAMETER,
  ElementType.TYPE_USE
})
public @interface Issue {

  /**
   * Describes when the issue itself was created.
   */
  String createdOn() default "";

  /**
   * A description of the issue.
   */
  String description() default "";

  /**
   * A description of the effect the issue has on the annotated
   * element.
   */
  String effect() default "";

  /**
   * Identifying information about the issue.
   */
  String id() default "";

  /**
   * The kind of issue this is.
   */
  String type() default "";

  /**
   * How the issue was resolved.
   */
  String resolution() default "";

  /**
   * When the issue was resolved.
   */
  String resolvedOn() default "";

  /**
   * A description of the current status of the issue.
   */
  String status() default "";

  /**
   * The severity of the issue.
   */
  String severity() default "";

  /**
   * Where more information about the issue may be found.
   */
  String uri() default "";
  
}
