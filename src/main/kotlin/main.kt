
    fun main() {
        ejercicio1()
        ejercicio2()
        ejercicio3()
        ejercicio4()
        ejercicio5()
        ejercicio6()
        ejercicio7()
        ejercicio8()
        ejercicio9()
        ejercicio10()
        ejercicio11()
        ejercicio12()
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
    fun ejercicio6() {
        println("\n6. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:\n" +
                "• Si trabaja 40 horas o menos se le paga 16 por hora\n" +
                "• Si trabaja más de 40 horas se le paga 16 por cada una de las primeras 40 horas y \$20 por cada hora extra. (Propuesto)\n")

        var horasTrabajadas: Int = 0

        print("Ingrese primer numero: ")
        horasTrabajadas = readLine()!!.toInt()

        if (horasTrabajadas <= 40)
            println("el precio semanal es: ${horasTrabajadas * 16}")
        else println("El precio semanal es: ${40 * 16 + (horasTrabajadas-40) * 20}")
    }
    fun ejercicio7() {
        println("\n7. Ingresar por teclado el nombre y el signo de cualquier persona e imprima, el nombre solo si la persona es signo Aries\n")

        var nombre: String = ""
        var signo: String = ""

        print("Ingrese nombre: ")
        nombre = readLine()!!.toString()
        print("Ingrese Signo Sodiacal ")
        signo = readLine()!!.toString()
        if (signo.equals("Aries"))
        println("Mi Nombre es:$nombre y mi signo Sodiacal es:$signo")
    }
    fun ejercicio8() {
        println("\n8. Ingresar por teclado el nombre, la edad y el sexo de cualquier persona e imprima, solo si la persona es de sexo masculino y mayor de edad, el nombre de la persona (Propuesto)\n")

        var nombreDeLaPersona: String = ""
        var edad: Int = 0
        var sexo: String = ""

        print("Ingrese Nombre y Apellido: ")
        nombreDeLaPersona = readLine()!!.toString()
        print("Ingrese Edad: ")
        edad = readLine()!!.toInt()
        print("Ingrese Sexo: ")
        sexo = readLine()!!.toString()
        if (sexo.equals("Masculino") && edad >= 18)
                println("El nombre es: $nombreDeLaPersona")

    }
    fun ejercicio9() {
        println("\n9. Hacer un algoritmo que calcule el total a pagar por la compra de camisas. Si se compran tres camisas o más se aplica un descuento del 20% sobre el total de la compra y si son menos de tres camisas un descuento del 10%\n")
        var camisas: Int = 0
        var costo: Double = 0.0
        var descuento: Double = 0.0
        var precioFinal: Double = 0.0

        print("Ingrese numero de camisas: ")
        camisas = readLine()!!.toInt()
        print("Ingrese costo por camisa: ")
        costo = readLine()!!.toDouble()
        if (camisas >= 3){
            descuento = 20.0
        }
        else {
            descuento = 10.0
        }

        descuento = (descuento/100)* costo
        precioFinal = (costo - descuento)*camisas
        println("El precio a pagar por $camisas camisas es: $precioFinal")

    }
    fun ejercicio10() {
        println(
            "\n10. En un supermercado se hace una promoción, mediante la cual el cliente obtiene un descuento dependiendo de un número que se escoge al azar. Si el numero escogido es menor que 74 el descuento es del 15% sobre el total\n" +
                    "de la compra, si es mayor o igual a 74 el descuento es del 20%. Obtener cuanto dinero se le descuenta. (Propuesto)\n"
        )
        var montoDeCompra: Double = 0.0
        var numeroAlAzar: Int = 0
        var descuentoDeLaCompra: Double = 0.0

        print("Ingrese monto de la compra: ")
        montoDeCompra = readLine()!!.toDouble()
        print("Ingrese numero al azar: ")
        numeroAlAzar = readLine()!!.toInt()
        if (numeroAlAzar < 74)
            descuentoDeLaCompra = 0.15 * montoDeCompra
        else descuentoDeLaCompra = 0.20* montoDeCompra
        println("El descuento es: $descuentoDeLaCompra")
    }
    fun ejercicio11() {
        println(
            "\n11. Calcular el total que una persona debe pagar en una llantera, si el precio de cada llanta es de \$800 si se compran menos de 5 llantas y de \$700 si se compran 5 o más.\n"
        )
        var cantidadDeLlantas: Int = 0
        var totalAPagar: Int = 0

        print("Ingrese cantidad de llantas compradas: ")
        cantidadDeLlantas = readLine()!!.toInt()
        if (cantidadDeLlantas < 5)
            totalAPagar = 800 * cantidadDeLlantas
        else totalAPagar = 700 * cantidadDeLlantas
        println("El Total a pagar es de: $totalAPagar")
    }
    fun ejercicio12() {
        println(
            "\n12. En un almacén se hace un 20% de descuento a los clientes cuya compra supere los S/. 1000 ¿Cuál será la cantidad que pagara una persona por su compra? (Propuesto)\n"
        )
        var compra: Double = 0.0
        var cantidadAPagar: Double = 0.0
        var descuento:  Double = 0.0

        print("Ingrese compra: ")
        compra = readLine()!!.toDouble()
        if (compra > 1000) {
            descuento = 0.20 * compra
            cantidadAPagar = compra - descuento
        } else cantidadAPagar = compra
        println("El total a pagar es: $cantidadAPagar")
    }








