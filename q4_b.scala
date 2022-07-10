val costForEachPerformance = 500.00f
val costForEachAttendee = 3.00f
val basePrice = 15.00f
val priceChange = 5

def max(a: Float, b: Float): Float = if (a >= b) a else b
def NumberOfPeople(priceChange: Int): Int = -1 * (priceChange * 20 / 5) + 120
def TicketPrice(priceChange: Int): Float = basePrice + priceChange
def Income(numberOfPeople: Int, ticketPrice: Float): Float = ticketPrice * numberOfPeople
def Cost(numberOfPeople: Int): Float = costForEachPerformance + (costForEachAttendee * numberOfPeople)
def Profit(income: Float, cost: Float): Float = income - cost
def CalculateProfit(numberOfPeople: Int, ticketPrice: Float) : Float = Profit(Income(numberOfPeople, ticketPrice), Cost(numberOfPeople))

def FindBestPrice(priceIncrese: Int, priceDecrese: Int): Unit = {
  val numberOfPeople_increased = NumberOfPeople(priceIncrese)
  val ticketPrice_increased = TicketPrice(priceIncrese)
  val profit_increased = CalculateProfit(numberOfPeople_increased, ticketPrice_increased)

  val numberOfPeople_decreased = NumberOfPeople(priceDecrese)
  val ticketPrice_decreased = TicketPrice(priceDecrese)
  val profit_decreased = CalculateProfit(numberOfPeople_decreased, ticketPrice_decreased)

  if(profit_increased >= profit_decreased)  {
    val ticket_price=ticketPrice_increased
    print(ticket_price)
  }
  else {
    val ticket_price=ticketPrice_decreased
    print(ticket_price)
  }
}

FindBestPrice(7, -10)