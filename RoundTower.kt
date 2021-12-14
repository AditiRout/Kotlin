class RoundTower(
       residents: Int,
       radius: Double,
       val floors: Int = 2) : RoundHut(residents, radius) {

   override val buildingMaterial = "Stone"

   // Capacity depends on the number of floors.
   override val capacity = floors * 4

   /**
    * Calculates the total floor area for a tower dwelling
    * with multiple stories.
    *
    * @return floor area
    */
   override fun floorArea(): Double {
       return super.floorArea() * floors
   }
}