fun main(){
	var (name, age) = readLine()!!.split(" ").map{it}
	val border = "'-._,-'"
	val times = 4
	val layers = 5
	printBorder(border, times)
	println("  Happy birthday, ${name}!")
	printBorder(border, times)
	printCake(age.toInt(), layers)
}

fun printBorder(s: String, i:Int){
	repeat(i){ print(s)}
	println()
}
fun printCake(age: Int, layers: Int){
	print(" ")
	repeat(age){print(",")}
	println()
	print(" ")
	repeat(age){print("|")}
	println()
	repeat(age+2){print("=")}
	println()
	repeat(layers){
repeat(age+2){print("@")}
println()
}
println()
	

}
