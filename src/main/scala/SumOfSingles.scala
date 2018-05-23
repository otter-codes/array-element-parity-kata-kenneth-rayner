object SumOfSingles {

  def sumNonRepeatedNos(input:List[Int]):Int= {
    val inputDistinct =input.distinct
    val repeatedNumbers = input diff inputDistinct
    val nonRepeatedNumbers =inputDistinct diff repeatedNumbers
    nonRepeatedNumbers.sum
  }
}
