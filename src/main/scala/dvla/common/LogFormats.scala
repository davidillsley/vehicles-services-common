package dvla.common

object LogFormats {
  val anonymousChar = "*"

  def anonymize(inputString: String): String = {
    val charIndex =
      if (inputString.length == 0) 0
      else if (inputString.length > 8) 4
      else inputString.length / 2
    anonymousChar * (inputString.length - charIndex) + inputString.takeRight(charIndex)
  }
}
