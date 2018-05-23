import org.scalatest.{MustMatchers, WordSpec}

class SumOfSinglesSpec extends WordSpec with MustMatchers {
  "SumOfSingles" must {
    "take in an array of different numbers and return the sum" in {
      SumOfSingles.sumNonRepeatedNos(List(1,2)) mustEqual 3
    }

    "take in a list of numbers and return sum of numbers that are not repeated in the list" in {
      SumOfSingles.sumNonRepeatedNos(List (1,1,2)) mustEqual 2
    }
    "take in a longer list of numbers and return sum of numbers that are not repeated in the list" in {
      SumOfSingles.sumNonRepeatedNos(List (1,1,2,3,4,5,6,5,4,6)) mustEqual 5
    }
  }

}
