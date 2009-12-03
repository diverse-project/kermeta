package kermeta.kunit
import kermeta.io._
import kermeta.standard._
import  kermeta.standard.JavaConversions._
object ErrorKind extends Enumeration {
type ErrorKind = Value
val setUpError,testError,tearDownError = Value
}
