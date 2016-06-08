package com.hash._02obj

/**
  * Created by 862911 on 2016/6/6.
  */
object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double): Double = {
    return value * 3.0;
  }
}
