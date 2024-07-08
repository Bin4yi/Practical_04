object InventoryManagement{

    var itemNames:Array[String]=Array("Apple","Banana","Orange")
    var itemQuantities: Array[Int]=Array(10,20,15)


    def displayInventory(itemName:Array[String], itemQuantities:Array[Int]): Unit={
        println("Current Inventory: ")
        for (i<- 0 until itemNames.length){
            println(s"${itemNames(i)}: ${itemQuantities(i)}")
        }
    }

    def restockItem(itemName:String,quantity:Int):Unit={
        val index=itemNames.indexOf(itemName)
        if (index != -1){
            itemQuantities(index)+=quantity
            println(s"Restocked $quantity units of $itemName. New quantity: ${itemQuantities(index)}")
        }
        else{
            println(s"Item '$itemName' doesn't exist on inventory.")
        }
    }

    def sellItem(itemName:String, quantity:Int):Unit={
        val index=itemNames.indexOf(itemName)
        if (index != -1){
            if(itemQuantities(index)>=quantity){
                itemQuantities(index)-=quantity
                println(s"Sold $quantity units of $itemName. Remaining quantity: ${itemQuantities(index)}")
            }
            else{
                println(s"Not enough $itemName in stock to sell $quantity units. Available quantity: ${itemQuantities(index)}." )
            }
        }
        else{
            println(s"Item '$itemName' doesn't exist on inventory.")
        }
    }
    def main(args: Array[String]): Unit={
        displayInventory(itemNames, itemQuantities)

        println("\nRestocking items...")
        restockItem("Appel",5)
        restockItem("Grapes",10)

        println("\nSelling items...")
        sellItem("Banana" ,10)
        sellItem("Orange" ,20)

        println("\nFinal Inventory:")
        displayInventory(itemNames, itemQuantities)
    }
}