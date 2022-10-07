package tictactoe

fun printGrid(input: MutableList<Char>){
    //print grid
    println("---------")
    print("| ")
    print(input.get(0))
    print(' ')
    print(input.get(1))
    print(' ')
    print(input.get(2))
    println(" |")
    print("| ")
    print(input.get(3))
    print(' ')
    print(input.get(4))
    print(' ')
    print(input.get(5))
    println(" |")
    print("| ")
    print(input.get(6))
    print(' ')
    print(input.get(7))
    print(' ')
    print(input.get(8))
    println(" |")
    println("---------")
}

fun checkGrid(input: MutableList<Char>, coordinates: String): String{
    val chars = coordinates.toList()
    //not numbers
    if(chars[0] != '1' && chars[0] != '2' && chars[0] != '3' && chars[0] != '4' && chars[0] != '5' && 
       chars[0] != '6' && chars[0] != '7' && chars[0] != '8' && chars[0] != '9' && chars[0] != '0'){
        return "You should enter numbers!"
    }
    if(chars[2] != '1' && chars[2] != '2' && chars[2] != '3' && chars[2] != '4' && chars[2] != '5' && 
       chars[2] != '6' && chars[2] != '7' && chars[2] != '8' && chars[2] != '9' && chars[2] != '0'){
        return "You should enter numbers!"
    }
    //out of limit
    if(chars[0] != '1' && chars[0] != '2' && chars[0] != '3'){
        return "Coordinates should be from 1 to 3!"
    }
    if(chars[2] != '1' && chars[2] != '2' && chars[2] != '3'){
        return "Coordinates should be from 1 to 3!"
    }
        
    //cell occupied
	if (coordinates == "1 1"){
        if (input[0] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "1 2"){
    	if (input[1] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "1 3"){
    	if (input[2] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "2 1"){
        if (input[3] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "2 2"){
    	if (input[4] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "2 3"){
    	if (input[5] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "3 1"){
        if (input[6] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "3 2"){
    	if (input[7] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    if (coordinates == "3 3"){
    	if (input[8] != ' '){
            return "This cell is occupied! Choose another one!"
        }
    }
    
    return "ok"
}

fun xMoves(input: MutableList<Char>, coordinates: String): MutableList<Char>{
	if (coordinates == "1 1"){
        input[0] = 'X'
    }
    if (coordinates == "1 2"){
    	input[1] = 'X'
    }
    if (coordinates == "1 3"){
    	input[2] = 'X'
    }
    if (coordinates == "2 1"){
        input[3] = 'X'
    }
    if (coordinates == "2 2"){
    	input[4] = 'X'
    }
    if (coordinates == "2 3"){
    	input[5] = 'X'
    }
    if (coordinates == "3 1"){
        input[6] = 'X'
    }
    if (coordinates == "3 2"){
    	input[7] = 'X'
    }
    if (coordinates == "3 3"){
    	input[8] = 'X'
    }
    
    return input
}

fun oMoves(input: MutableList<Char>, coordinates: String): MutableList<Char>{
	if (coordinates == "1 1"){
        input[0] = 'O'
    }
    if (coordinates == "1 2"){
    	input[1] = 'O'
    }
    if (coordinates == "1 3"){
    	input[2] = 'O'
    }
    if (coordinates == "2 1"){
        input[3] = 'O'
    }
    if (coordinates == "2 2"){
    	input[4] = 'O'
    }
    if (coordinates == "2 3"){
    	input[5] = 'O'
    }
    if (coordinates == "3 1"){
        input[6] = 'O'
    }
    if (coordinates == "3 2"){
    	input[7] = 'O'
    }
    if (coordinates == "3 3"){
    	input[8] = 'O'
    }
    
    return input
}

fun checkWins(input: MutableList<Char>): String{
    var xWins = false
	var oWins = false
    var empties = 0
    
    //X wins
    if(input.get(0)=='X' && input.get(1)=='X' && input.get(2)=='X'
    || input.get(3)=='X' && input.get(4)=='X' && input.get(5)=='X'
    || input.get(6)=='X' && input.get(7)=='X' && input.get(8)=='X'
    || input.get(0)=='X' && input.get(3)=='X' && input.get(6)=='X'
    || input.get(1)=='X' && input.get(4)=='X' && input.get(7)=='X'
    || input.get(2)=='X' && input.get(5)=='X' && input.get(8)=='X'
    || input.get(0)=='X' && input.get(4)=='X' && input.get(8)=='X'
    || input.get(2)=='X' && input.get(4)=='X' && input.get(6)=='X'){
        xWins = true
    }
    
    //O wins
    if(input.get(0)=='O' && input.get(1)=='O' && input.get(2)=='O'
    || input.get(3)=='O' && input.get(4)=='O' && input.get(5)=='O'
    || input.get(6)=='O' && input.get(7)=='O' && input.get(8)=='O'
    || input.get(0)=='O' && input.get(3)=='O' && input.get(6)=='O'
    || input.get(1)=='O' && input.get(4)=='O' && input.get(7)=='O'
    || input.get(2)=='O' && input.get(5)=='O' && input.get(8)=='O'
    || input.get(0)=='O' && input.get(4)=='O' && input.get(8)=='O'
    || input.get(2)=='O' && input.get(4)=='O' && input.get(6)=='O'){
        oWins = true
    }
    
    for (i in 0..8){
        if (input.get(i) == ' '){
            empties++
        }
    }
    
    if (xWins){
        return "X wins"
    }else if (oWins){
        return "O wins"
    }else if (empties == 0){
        return "Draw"
    }else{
        return "Not finished"
    }
}

fun main() {
    var inputRead = "         "
    var input: MutableList<Char> = inputRead.toMutableList()
    var finished = false
    var turnX = true
    var turnO = false
    
    printGrid(input)
    
    while(!finished){
        //ingresa coordenada
        var coordinates = readln()
        
        //checa que la coordenada sea correcta
        if(checkGrid(input, coordinates) != "ok"){
            println(checkGrid(input, coordinates))
        }else{
            //hace el movimiento
            if(turnX){
            	xMoves(input, coordinates)
            }else if (turnO){
                oMoves(input, coordinates)
            }
            //imprime el tablero
            printGrid(input)
            //checa si alguien ganó
			if (checkWins(input) != "Not finished"){
                println(checkWins(input))
                finished = true
            }
        }
        //cambia de turno
        if (turnX){
            turnX = false
			turnO = true
        }else{
            turnO = false
			turnX = true
        }
    }
}