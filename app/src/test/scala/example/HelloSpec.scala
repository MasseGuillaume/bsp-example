package example

class HelloSpec extends munit.FunSuite {
  test("Lib") {
    val obtained = Lib.value
    val expected = 42
    assertEquals(obtained, expected)
  }
}