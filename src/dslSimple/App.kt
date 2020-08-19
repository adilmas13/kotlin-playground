package dslSimple

// https://dzone.com/articles/kotlin-dsl-basics
class Employee(
    var name: String = "",
    var age: Int = 0
) {
    override fun toString(): String {
        return "Employee(name='$name', age=$age)}"
    }
}

/*
* function that accepts a lambda as a receiver
* */
fun employee(action: Employee.() -> Unit): Employee {
    val employee = Employee()
    employee.action()
    return employee
}

/*
* Class that implements operator invoke that gets called when you use the class instance as a function
* */
class Address(
    var street: String = "",
    var building: String = ""
) {
    operator fun invoke(action: Address.() -> Unit): Address {
        println("Invoke called")
        this.action()
        return this
    }

    override fun toString(): String {
        return "Address(street='$street', building='$building')"
    }
}

fun main() {
    // using the employee function to create an instance of the employee
    val emp = employee {
        age = 25
        name = "Adil Shaikh"
    }
    println(emp.toString())
    // using the class invoke function, which is a call without the method name
    val address = Address()
    address {
        street = "Super road"
        building = "Jupiter"
    }
    println(address)
}