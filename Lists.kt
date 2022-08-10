fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    println("Operations on mutable List\n")
    
    // Add (Element)
    println("1- Add element:")
    println("List before: ${numbers}")
    numbers.add("Six")
    println("List after: ${numbers}\n")
   	
    // Add (Index, Element)
    println("2- Add element by specified index:")
    println("List before: ${numbers}")
    numbers.add(6,"Seven")
    println("List after: ${numbers}\n")
   	
    // Add All (List)
    println("3- Add all:")
    println("List before: ${numbers}")
    numbers.addAll(weekDays)
    println("List after: ${numbers}\n")
    
    // Add All (Index, List)
    println("4- Add all by specified index:")
    println("List before: ${numbers}")
    numbers.addAll(0,weekDays)
    println("List after: ${numbers}\n")
    
    // Remove
    println("5- Remove:")
    println("List before: ${weekDays}")
    weekDays.remove("Sun")
    println("List after: ${weekDays}\n")
    
    // Remove At
    println("6- Remove At:")
    println("List before: ${weekDays}")
    weekDays.removeAt(5)
    println("List after: ${weekDays}\n") 
    
    // Remove All
    println("7- Remove All:")
    println("List before: ${numbers}")
    numbers.removeAll(weekDays)
    println("List after: ${numbers}\n") 
    
    // Clear
    println("8- Clear:")
    println("List before: ${numbers}")
    numbers.clear()
    println("List after: ${numbers}\n")
   	
    
    // Read-only (immutable) List - Operations
    println("--------------------Operations on immutable List--------------------\n")
     
     
    // The size of the list
    println("1- Size:")
    println("Size of names list: ${names.size}\n")
    
    // Contains
    println("2- Contains:")
    println("Check is Sumayah contained in names list: ${names.contains("Sumayah")}")
    println("Check is Sara contained in names list: ${names.contains("Sara")}\n")
   	
    // Contains All
    println("3- Contains All:")
    println("Check is all elements of namesAll list are contains in names:: ${names.containsAll(namesAll)}\n")
   	
    // get
    println("4- Get:")
    println("${names.get(4)}\n")
   	
    // indexOf
    println("5- IndexOf:")
    println("Index of Sumayah in names list: ${names.indexOf("Sumayah")}")
    println("Index of Sumayah in namesAll list: ${namesAll.indexOf("Sumayah")}\n")
    
    // isEmpty
    println("6- Is empty:")
    println("Check if namesAll list is empty: ${namesAll.isEmpty()}")
    println("Check if color list is empty: ${color.isEmpty()}\n")
    
    // Sublist
    println("7- Sub list:")
    println("Sub list from names list: ${namesAll.subList(1,4)}")
    
}
