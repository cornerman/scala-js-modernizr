package com.definitelyscala.modernizr

import scala.scalajs.js

@js.native
trait Dictionary[T] extends js.Object {
  @js.annotation.JSBracketAccess
  def apply(key: String): T = js.native
  @js.annotation.JSBracketAccess
  def update(key: String, v: T): Unit = js.native
}