@file:Suppress("NOTHING_TO_INLINE")

package cn.zenliu.kotlin.hack
/**
 *  (a to b)% boolean
 * @receiver Pair<Any?,Any?>
 * @param b Boolean
 * @return Any?
 */
inline operator fun Pair<Any?, Any?>.rem(b: Boolean) = if (b) when(this.first){
    is Function0<*>->(this.first as Function0<*>).invoke()
    else->this.first
} else when(this.second){
    is Function0<*>->(this.second as Function0<*>).invoke()
    else->this.second
}



/**
 * (boolean)%(a to b)
 * @receiver Boolean
 * @param value Pair<Any?,Any?>
 * @return Any?
 */
inline operator fun Boolean.rem(value: Pair<Any?,Any?>) = if (this) when(value.first){
    is Function0<*>->(value.first as Function0<*>).invoke()
    else->value.first
} else when(value.second){
    is Function0<*>->(value.second as Function0<*>).invoke()
    else->value.second
}

