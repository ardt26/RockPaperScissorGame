class Main {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            var exit = false
            do{
                println("Game Guntung Batu Kertas Terminal\n")
                var namaPlayer : String
                var gtbPlayer : String

                print("Masukkan Nama Player 1 : ")
                namaPlayer = readLine().toString()
                print("Gunting / Batu / Kertas: ")
                gtbPlayer = readLine().toString()
                val Player1 = Player(namaPlayer, gtbPlayer)

                print("Masukkan Nama Player 2 : ")
                namaPlayer = readLine().toString()
                print("Gunting / Batu / Kertas: ")
                gtbPlayer = readLine().toString()
                val Player2 = Player(namaPlayer, gtbPlayer)

                if(Player1.gtb.equals("Gunting") || Player1.gtb.equals("gunting")){
                    if (Player2.gtb.equals("Gunting") || Player2.gtb.equals("gunting")){
                        println("SERI")
                    }else if(Player2.gtb.equals("Batu") || Player2.gtb.equals("batu")){
                        println("Pemenang adalah ${Player2.name}")
                    }else if(Player2.gtb.equals("Kertas") || Player2.gtb.equals("kertas")){
                        println("Pemenang adalah ${Player1.name}")
                    }else{
                        println("${Player2.name} salah input")
                    }
                } else if(Player1.gtb.equals("Batu") || Player1.gtb.equals("batu")){
                    if (Player2.gtb.equals("Gunting") || Player2.gtb.equals("gunting")){
                        println("Pemenang adalah ${Player1.name}")
                    }else if(Player2.gtb.equals("Batu") || Player2.gtb.equals("batu")){
                        println("SERI")
                    }else if(Player2.gtb.equals("Kertas") || Player2.gtb.equals("kertas")){
                        println("Pemenang adalah ${Player2.name}")
                    }else{
                        println("${Player2.name} salah input")
                    }
                } else if (Player1.gtb.equals("Kertas") || Player1.gtb.equals("kertas")){
                    if (Player2.gtb.equals("Gunting") || Player2.gtb.equals("gunting")){
                        println("Pemenang adalah ${Player2.name}")
                    }else if(Player2.gtb.equals("Batu") || Player2.gtb.equals("batu")){
                        println("Pemenang adalah ${Player1.name}")
                    }else if(Player2.gtb.equals("Kertas") || Player2.gtb.equals("kertas")){
                        println("SERI")
                    }else{
                        println("${Player2.name} salah input")
                    }
                } else{
                    println("${Player1.name} salah input")
                }
                print("Coba Lagi (y/n): ")
                var lagi = readLine().toString()
                if (lagi.equals("n") || lagi.equals("N")){
                    exit = true
                    println("Terima Kasih...")
                }
            }while (!exit)
        }
    }
}