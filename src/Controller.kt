class Controller (var Player1 : Player , var Player2 : Player, var callback: iCallback){
    var winner : String = ""
    fun checkWinner(){
        if(Player1.getGTB().equals("gunting")){
            if (Player2.getGTB().equals("gunting")){
                winner = "SERI"
            }else if(Player2.getGTB().equals("batu")){
                winner = Player2.getNama()
            }else if(Player2.getGTB().equals("kertas")){
                winner = Player1.getNama()
            }
        } else if(Player1.getGTB().equals("batu")){
            if (Player2.gtb.equals("gunting")){
                winner = Player1.getNama()
            }else if(Player2.getGTB().equals("batu")){
                winner = "SERI"
            }else if(Player2.getGTB().equals("kertas")){
                winner = Player2.getNama()
            }
        } else if (Player1.getGTB().equals("kertas")){
            if (Player2.gtb.equals("gunting")){
                winner = Player2.getNama()
            }else if(Player2.getGTB().equals("batu")){
                winner = Player1.getNama()
            }else if(Player2.getGTB().equals("kertas")){
                winner = "SERI"
            }
        }
        callback.showWinner(winner)
    }
}