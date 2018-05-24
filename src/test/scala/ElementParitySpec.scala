import org.scalatest._

class ElementParitySpec extends WordSpec with MustMatchers {

  "ElementParity" must {

    "Return number in list that appears once" in {
    ElementParity.number(List(1)) mustEqual 1
    }
    "Return number in list that appears more than once" in {
      ElementParity.number(List(1,1)) mustEqual 1
    }
    "Return number in list that does not appears as positive and negative" in {
      ElementParity.number(List(1,2,-1)) mustEqual 2
    }
    "Return positive number that appears more than once but not as positive and negative" in {
      ElementParity.number(List(1,2,2,-1)) mustEqual 2
    }
    "Return negative number that appears once but not as positive and negative" in {
      ElementParity.number(List(1,2,-3,-2,-1)) mustEqual -3
      }
    "Return negative number that appears more than once but not as positive and negative" in {
      ElementParity.number(List(1,2,-3,-3,-2,-1)) mustEqual -3
    }
    }
  }

