package com.cubetiqs.ops.admin.indicator

import org.springframework.stereotype.Component

/**
 * @author sombochea
 * @since 1.0
 */
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@Component
annotation class Indicator(val value: String = "")