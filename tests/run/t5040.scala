import scala.language.dynamics // originally used the flag -language:dynamics in t5040.flags, .flags are currently ignored
abstract class Prova2 extends Dynamic {
  def applyDynamic(m: String)(): Unit
  private def privateMethod() = println("private method")
}

object Test extends dotty.runtime.LegacyApp {
  val prova= new Prova2 {
    def applyDynamic(m: String)() = println("applyDynamic")
  }
  prova.privateMethod()
}
