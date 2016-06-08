package com.hash._02obj

/**
  * Created by 862911 on 2016/6/6.
  */
class Account(private val id: Int, initialBalance: Double) {
  private val balance = initialBalance

  def getId = id

  def getBalance = balance
}

object Account {
  def apply(initialBalance:Double) = new Account(uniqueId, initialBalance)
  var id = 0

  def uniqueId: Int = {
    id += 1
    id
  }
}
