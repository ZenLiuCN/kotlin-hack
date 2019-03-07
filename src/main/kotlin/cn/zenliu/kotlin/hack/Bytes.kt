package cn.zenliu.kotlin.hack
import java.nio.ByteBuffer

fun ByteBuffer.toByteArray()=ByteArray(this.remaining()).let{
  this.get(it)
  it
}
