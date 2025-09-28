package com.dede.android_eggs.util

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Proxy

/**
 * no-op delegate
 *
 * ```kotlin
 * class ExampleImpl : Application.ActivityLifecycleCallbacks by noOpDelegate() {
 *      override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
 *          // ...
 *      }
 * }
 * ```
 */
inline fun <reified T> noOpDelegate(): T {
    val javaClass = T::class.java
    return Proxy.newProxyInstance(
        javaClass.classLoader, arrayOf(javaClass), NO_OP_HANDLER
    ) as T
}

val NO_OP_HANDLER = InvocationHandler { _, _, _ ->
    // no-op
}
