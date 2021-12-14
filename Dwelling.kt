abstract class Dwelling(private var residents: Int) {
   abstract val buildingMaterial: String
   abstract val capacity: Int

   /**
    * Calculates the floor area of the dwelling.
    * Implemented by subclasses where shape is determined.
    *
    * @return floor area
    */
   abstract fun floorArea(): Double

   /**
    * Checks whether there is room for another resident.
    *
    * @return true if room available, false otherwise
    */
   fun hasRoom(): Boolean {
       return residents < capacity
   }
	fun getRoom() {
       if (capacity > residents) {
           residents++
           println("You got a room!")
       } else {
           println("Sorry, at capacity and no rooms left.")
       }
   }

   }
