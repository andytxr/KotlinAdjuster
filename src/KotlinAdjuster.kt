import java.util.Scanner

fun main(args: Array<String>){

    val scan = Scanner(System.`in`)
    print("How many employeers? ")
    var qtdE = scan.nextInt()
    if(qtdE<1 || qtdE > 100){
        do{
            println("The quantity of employeers need to be bigger than 1 and minor than 100")
            print("How many employeers? ")
            qtdE = scan.nextInt()
        }while(qtdE<1||qtdE>100)
    }

    for(i in 1..qtdE){
        println()
        print("Enter with the value per hour: ")
        var valueHour = scan.nextDouble()
        if(valueHour<2 || valueHour>1000){
            do {
                println("Error! The value per hour needs to be bigger than 2 and minor than 1000")
                print("Enter with the value per hour: ")
                valueHour = scan.nextDouble()
            }while(valueHour<2||valueHour>1000)
        }

        println()
        print("Enter with the days quantity: ")
        var qtdDays = scan.nextInt()
        if(qtdDays<1 || qtdDays>31){
            do{
                println("Error! The quantity of days needs to be bigger than 1 and minor than 31")
                print("Enter with the days quantity: ")
                qtdDays=scan.nextInt()
            }while(qtdDays<1||qtdDays>31)
        }

        println()
        print("Enter with the readjust percentage in the wage: ")
        var perc = scan.nextDouble()
        if(perc<10|| perc>50){
            do{
                println("Error! The percentage of readjust needs to be bigger than 10 and minor than 50")
                print("Enter with the readjust percentage in the wage: ")
                perc=scan.nextDouble()
            }while(perc<10||perc>50)
        }

        valueHour =+ valueHour*(perc/100)

        val wage=valueHour*qtdDays

        println("Your wage is $wage")
    }

}
