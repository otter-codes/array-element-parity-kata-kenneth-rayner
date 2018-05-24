object ElementParity extends App {

  def number(input: List[Int]): Int = {
    input.distinct.sum
  }
}