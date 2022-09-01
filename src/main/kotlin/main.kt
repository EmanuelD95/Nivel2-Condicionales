
    fun main() {
        ejercicio1()
        ejercicio2()
        ejercicio3()
        ejercicio4()
        ejercicio5()
    }


    fun ejercicio1() {
        println("1. Determinar si un alumno aprueba o reprueba un curso, sabiendo que aprobara si su promedio de tres calificaciones es mayor o igual a 10.5; reprueba en caso contrario.\n")

        var primeraCalificacion: Double = 0.0
        var segundaCalificacion: Double = 0.0
        var terceraCalificacion: Double = 0.0
        var promedio: Double = 0.0

        print("Ingrese primera calificacion: ")
        primeraCalificacion = readLine()!!.toDouble()

        print("Ingrese segunda calificacion: ")
        segundaCalificacion = readLine()!!.toDouble()

        print("Ingrese tercera calificacion: ")
        terceraCalificacion = readLine()!!.toDouble()

        promedio = (primeraCalificacion+segundaCalificacion+terceraCalificacion)/3
        println("El Promedio es: $promedio")
        if (promedio >= 10.5)
            println("Esta Aprobado")
        else println("Esta Reprobado")
    }


    fun ejercicio2() {
        println("\n2. Mostrar el resultado de la suma de 2 números enteros, si esta supera a 10. (Propuesto)\n")

        var numero1: Int = 0
        var numero2: Int = 0
        var resultado: Int = 0
        print("Ingrese primer numero: ")
        numero1 = readLine()!!.toInt()

        print("Ingrese segundo numero: ")
        numero2 = readLine()!!.toInt()

        resultado = numero1+numero2
        if (resultado > 10)
            println("La suma es: $resultado")
    }


    fun ejercicio3() {
        println("\n3. Determinar si un número es par, impar o cero\n")

        var numero: Int = 0

        print("Ingrese numero: ")
        numero = readLine()!!.toInt()

        if (numero == 0) {
            println("El numero es: $numero")
        } else {
            if (numero % 2 == 0)
                println("El $numero es Par")
            else println("El $numero es Impar")
        }
    }

    fun ejercicio4() {
        println("\n4. Dado 3 números Calcular el Mayor (Propuesto)\n")

        var numeroA: Int = 0
        var numeroB: Int = 0
        var numeroC: Int = 0

        print("Ingrese primer numero: ")
        numeroA = readLine()!!.toInt()
        print("Ingrese segundo numero: ")
        numeroB = readLine()!!.toInt()
        print("Ingrese tercer numero: ")
        numeroC = readLine()!!.toInt()
        if (numeroA > numeroB) {
            if (numeroA > numeroC)
                println("El mayor es: $numeroA")
            else println("El mayor es: $numeroC")
        }else{
            if (numeroB > numeroC)
                println("El mayor es: $numeroB")
            else println("El mayor es: $numeroC")

        }
    }

    fun ejercicio5() {
        println("\n5. Ingrese 2 números desde el teclado e imprima solo los positivos\n")

        var primerNumero: Int = 0
        var segundoNumero: Int = 0

        print("Ingrese primer numero: ")
        primerNumero = readLine()!!.toInt()
        print("Ingrese segundo numero: ")
        segundoNumero = readLine()!!.toInt()
        if (primerNumero > 0)
            println("El $primerNumero es positivo")
        if (segundoNumero > 0)
            println("El $segundoNumero es positivo")
    }





