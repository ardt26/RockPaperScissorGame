class Main {
    companion object : iCallback{
        @JvmStatic
        fun main(args: Array<String>) {
            var exit = false
            var pilih : String
            do{
                println("Game Guntung Batu Kertas Terminal\n")
                var namaPlayer : String
                var gtbPlayer : String

                println("Menu : ")
                println("1. Player vs Player ")
                println("2. Player vs Computer ")
                print("Pilihan : ")
                pilih = readLine().toString()

                print("Masukkan Nama Player 1 : ")
                namaPlayer = readLine().toString()
                print("Gunting / Batu / Kertas: ")
                gtbPlayer = readLine().toString().toLowerCase()
                val Player1 = Player(namaPlayer, gtbPlayer)
                var Player2 = Player("", "")
                when(pilih){
                    "1" -> {
                        print("Masukkan Nama Player 2 : ")
                        namaPlayer = readLine().toString()
                        print("Gunting / Batu / Kertas: ")
                        gtbPlayer = readLine().toString().toLowerCase()
                        Player(namaPlayer, gtbPlayer)
                        Player2 = Player(namaPlayer, gtbPlayer)
                    }
                    "2" -> {
                        val list = mutableListOf<String>("Gunting", "Batu", "Kertas")
                        Player2 = Player("Computer", list.random().toLowerCase())
                    }
                }

                val controller = Controller(Player1,Player2,this)
                controller.checkWinner()

                print("Coba Lagi (y/n): ")
                val lagi = readLine().toString()
                if (lagi.equals("n") || lagi.equals("N")){
                    exit = true
                    println("Terima Kasih...")
                }
            }while (!exit)
        }

        override fun showWinner(winner: String) {
            println("Pemenangnya adalah $winner")
        }
    }
}