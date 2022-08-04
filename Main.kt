
import java.util.Scanner

fun main(){
    val scanner = Scanner(System.`in`)
    val user = arrayOfNulls<String>(100)
    val card = arrayOfNulls<String>(100)
    val cardNumPhone = arrayOfNulls<String>(100)
    val cardPayHistory = arrayOfNulls<Int>(100)
    val PhonemoneyHistory = arrayOfNulls<Int>(100)
    val cardNumCard = arrayOfNulls<String>(100)

    println("Bone pay Sistyem")

    var count = 0
    var countHistory= 0
    var cashback=0
    var a= 0

    while (true) {
        println()
        println("Cashback $a")
        println("[1] add card")
        println("[2] pay phone")
        println("[3] pay card")
        println("[4] card list")
        println("[5] history of payments")
        print("= ")
        val n = scanner.nextInt()

        when (n) {
            1 -> {
                println("enter username")
                val name = scanner.next()
                println("enter card number")
                val number = scanner.next()
                user[count] = name
                card[count] = number

                println("succes")
            }
            2 -> {
                println("Pay for the phone")
                print("+998")
                val number = scanner.next()
                print("money: ")
                val money = scanner.nextInt()
                PhonemoneyHistory[count] = money
                cardNumPhone[count] = number
                count++
                if (number.length == 9 && money >= 500) {
                    cashback = money * 2 / 100
                    a += cashback


                } else {
                    println("number of phone less")
                }


            }
            3 -> {
                println("Enter Card nuber")
                val cardnum = scanner.next()
                println("Ener money: ")
                val money = scanner.nextInt()
                cardNumCard[countHistory] = cardnum
                cardPayHistory[countHistory] = money
                countHistory++

                println("succes")
                cashback = money * 2 / 100
                a += cashback


            }
            4 -> {
                println("Card List")
                for (e in cardNumCard.indices) {

                    if (cardNumCard[e] !== null) {
                        println(cardNumCard[e])
                    }
                    println()
                    break

                }


            }
            5 -> {


                println("history of Payments")
                println()
                println("[1] phone pay history")
                println("[2] card pay history")
                var c = scanner.nextInt()

                if (c == 1) {
                    println("Phone payment history")
                    for (e in PhonemoneyHistory.indices) {
                        if (PhonemoneyHistory[e] !== null) {

                            println(PhonemoneyHistory[e])

                        } else {

                            break
                        }
                    }
                } else if (c == 2) {


                    println()
                    println("Card Payment history")
                    for (e in cardPayHistory.indices) {
                        if (cardPayHistory[e] !== null) {
                            println(cardPayHistory[e])
                        } else {

                            break

                        }

                    }


                }


            }


        }

        }


    }