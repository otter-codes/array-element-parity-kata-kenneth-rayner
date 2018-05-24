object SumOfSingles {

  def sumNonRepeatedNos(input:List[Int]):Int= {

    val repeatedNumbers = input diff input.distinct
   //val nonRepeatedNumbers =input.distinct diff repeatedNumbers
   // nonRepeatedNumbers.sum
   // alternative :
     input.filterNot(x => repeatedNumbers.contains(x)).sum
  }
}
