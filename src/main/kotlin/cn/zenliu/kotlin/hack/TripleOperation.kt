@file:Suppress("NOTHING_TO_INLINE")

package cn.zenliu.kotlin.hack

/**
 *  (a to b)% boolean
 * @receiver Pair<Any?,Any?>
 * @param b Boolean
 * @return Any?
 */
inline operator fun Pair<Any?, Any?>.rem(b: Boolean) = if (b) this.first else this.second

/**
 *  (boolean)%(a to b) like AnyBoolean?a:b
 * @receiver Boolean
 * @param value Pair<Any?, Any?>
 * @return Any?
 */
inline operator fun Boolean.rem(value: Pair<Any?, Any?>) = if (this) value.first else value.second

/**
 * (boolean)%({} to {})
 * @receiver Boolean
 * @param value Pair<()->Unit, ()->Unit>
 */
inline operator fun Boolean.rem(value: Pair<()->Unit, ()->Unit>) = if (this) value.first.invoke() else value.second.invoke()

/**
 *
 * @receiver Pair<()->Unit, ()->Unit>
 * @param b Boolean
 * @return Function0<Unit>
 */
inline operator fun Pair<()->Unit, ()->Unit>.rem(b: Boolean) = if (b) this.first else this.second

//inline operator fun <T,R>Pair<()->T, ()->R>.rem(b: Boolean) = if (b) this.first else this.second
