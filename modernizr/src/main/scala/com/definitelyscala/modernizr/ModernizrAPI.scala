package modernizr

import scala.scalajs.js
import org.scalajs.dom.raw._
import scala.scalajs.js.|

@js.native
trait ModernizrAPI extends js.Object {
  def on(feature: String, cb: js.Function1[Boolean, Any]): Unit = js.native
  def addTest(feature: String, test: js.Function0[Boolean] | Boolean): Unit = js.native
  def addTest(feature: Dictionary[js.Any]): Unit = js.native
  def atRule(prop: String): Boolean = js.native
  var _domPrefixes: js.Array[String] = js.native
  def hasEvent(eventName: String, element: EventTarget = js.native): Boolean = js.native
  def mq(mq: String): Boolean = js.native
  def prefixed(prop: String): String = js.native
  def prefixed(prop: String, obj: EventTarget, element: Boolean): js.Dynamic = js.native
  def prefixedCSS(prop: String): String = js.native
  def prefixedCSSValue(prop: String, value: String): String = js.native
  var _prefixes: js.Array[String] = js.native
  def testAllProps(prop: String, value: String = js.native, skipValueTest: Boolean = js.native): Boolean = js.native
  def testProp(prop: String, value: String = js.native, useValue: Boolean = js.native): Boolean = js.native
  def testStyles(rule: String, callback: js.Function2[HTMLDivElement, String, Unit], nodes: Double = js.native, testnames: js.Array[String] = js.native): Boolean = js.native
}
