package munit

class CiOnlyFrameworkSuite extends FunSuite {
  override def isCI: Boolean = true
  test("only".only) {
    println("pass")
  }
  test("boom") {
    ???
  }
}