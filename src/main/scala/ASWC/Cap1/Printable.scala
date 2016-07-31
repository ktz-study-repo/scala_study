package ASWC.Cap1

/**
  * Created by ktz on 16. 7. 31.
  */
trait Printable[A] {
  def format(valueToString : A) : String
}

object PrintDefaults {
  implicit val intPrintable = new Printable[Int] {
    override def format(valueToString: Int): String = valueToString.toString
  }
  implicit val stringPrintable = new Printable[String] {
    override def format(valueToString: String): String = valueToString
  }
  implicit val booleanPrintable = new Printable[Boolean] {
    override def format(valueToString: Boolean): String = valueToString.toString
  }
}