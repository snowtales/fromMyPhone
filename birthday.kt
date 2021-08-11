fun main(){
	var name = readLine()!!
	val border = "'-._,-'"
	val times = 4
	printBorder(border, times)
	println("    Happy birthday, ${name}!")
	printBorder(border, times)
}

fun printBorder(s: String, i:Int){
	repeat(i){ print(s)}
	println()
}
