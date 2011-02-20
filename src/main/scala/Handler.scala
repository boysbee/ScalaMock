package com.borachio

trait Handler {
  
  private[borachio] def handle(mock: MockFunction, arguments: Product): Option[Any]
  private[borachio] def satisfied: Boolean
}