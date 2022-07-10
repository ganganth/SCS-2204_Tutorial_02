val salary_normal = 250.00f
val salary_OT = 85.00f
val WorkingHours_perWeek = 40
val OTHours_perWeek = 30
val tax_rate = 0.12f

def IsValid(workingHours: Int, otHours: Int): Boolean = workingHours <= WorkingHours_perWeek && otHours <= OTHours_perWeek
def TotalSalary(workingHours: Int, otHours: Int): Float = (workingHours * salary_normal) + (otHours * salary_OT)
def Tax(totalSalary: Float): Float = totalSalary * tax_rate
def TakeHomeSalary(totalSalary: Float, tax: Float) : Float = totalSalary - tax

def CalculateSalary(workingHours: Int, otHours: Int) : Unit = if (IsValid(workingHours, otHours)) {
  val totalSalary = TotalSalary(workingHours, otHours)
  val tax = Tax(totalSalary)
  val answer =TakeHomeSalary(totalSalary, tax)
  print(answer)
  
} else {
  print("Invalid")
}

CalculateSalary(41,29)

