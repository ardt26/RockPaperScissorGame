class Player(name : String, gtb : String) {
    val name : String
    val gtb : String

    init {
        this.name = name
        this.gtb = gtb
    }

    fun getNama() : String{
        return name
    }

    fun getGTB() : String{
        return gtb
    }
}