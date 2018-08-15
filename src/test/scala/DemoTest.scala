import org.scalatest._


class DemoTest extends FlatSpec with Matchers {


  // for ready case
  "Counter " should "be 10 in ready case " in {
    assert ( Demo.model.counter == 10 )
  }

  //for aborted case
  //check if it is in aborted case
  //check if the mode.counter == counter.html
  "counter " should " be the same" in {
    if (Demo.state.aborted(Demo.model)){

    }
  }

  //for launch case
  "Counter " should " be 0 in laucn case " in {
      assert(Demo.model.counter ==0)
  }

  //in counting case

}