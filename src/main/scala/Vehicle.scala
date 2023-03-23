package com.knoldus.vehicleworking

class Vehicle {

  private var fuel: Int = 50

  //function to move vehicle
  def move: String = {
    if (fuel >= 20) {
      fuel -= 20
      "Moved"
    } else s"Current fuel value is $currentFuel, Need more fuel"
  }

  //this will hold current fuel
  def currentFuel: Int = fuel

  //function to refuel vehicle
  def refueling: String = {
    fuel += 50 - currentFuel
    "Refueled"
  }
}
