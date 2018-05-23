object SumOfSingles {

  def total (input:List[Int]):Int = {
    input.sum
  }

  def singleEntries(input:List[Int]):Int= {

    val inputDistinct =input.distinct
    val repeatedNumbers = input diff inputDistinct
    val nonRepeatedNumbers =inputDistinct diff repeatedNumbers
    nonRepeatedNumbers.sum
  }
}
