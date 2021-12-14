

class SquareCabin(residents: Int, val length: Double) : Dwelling(residents) {
   override val buildingMaterial = "Wood"
   override val capacity = 6

   /**
    * Calculates floor area for a square dwelling.
    *
    * @return floor area
    */
   override fun floorArea(): Double {
       return length * length
   }

}

