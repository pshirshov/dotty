// error not yet recognized (independent of inlining)
package p
private class D
class C {
  inline def inl(): Unit = {
    val d = new D()     // error (when inlined): not accessible
  }
}

