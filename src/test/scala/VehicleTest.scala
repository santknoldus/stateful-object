package com.knoldus.vehicleworking

import org.scalatest.funsuite.AnyFunSuite

class VehicleTest extends AnyFunSuite {

  val bike = new Vehicle

  test("moving bike three times") {
    assert(bike.move == "Moved")
    assert(bike.move == "Moved")
    assert(bike.move == "Current fuel value is " + bike.currentFuel + ", Need more fuel")
  }
  test("refueling then move") {
    assert(bike.refueling == "Refueled")
    assert(bike.move == "Moved")
  }
}
