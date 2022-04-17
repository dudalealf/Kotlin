package hiker

fun answer(listInt: List<Int>):Int {
    var nearInt = Integer.MAX_VALUE
    var distance = 0
    
    for(int in listInt){
        distance = Math.abs(0 - int)
        
        if(distance == nearInt){
            if(int > 0)  {
                nearInt = int
            }
        } else if(distance < nearInt) {
                nearInt = int
        }
    }
    
    return nearInt
}
