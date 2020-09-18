class Employee (var builder: Builder) {
    var firstName: String?
    val lastName: String?
    val id: String?
    val isManager: Boolean
    val managerId: String?
    init {
        firstName = builder.firstName
        lastName = builder.lastName
        id = builder.id
        isManager = builder.isManager
        managerId = builder.managerId
    }
    class Builder {
         var firstName: String? = null
         var lastName: String? = null
         var id: String? = null
         var isManager = false
         var managerId: String? = null

        fun build(): Employee {
            return Employee(this)
        }

        fun setFirstName(firstName: String?): Builder {
            this.firstName = firstName
            return this
        }

        fun setLastName(lastName: String?): Builder {
            this.lastName = lastName
            return this
        }

        fun setId(id: String?): Builder {
            this.id = id
            return this
        }

        fun setIsManager(manager: Boolean): Builder {
            isManager = manager
            return this
        }

        fun setManagerId(managerId: String?): Builder {
            this.managerId = managerId
            return this
        }
    }
fun showData(){
    println("The first name : $firstName last name : $lastName and the Manager id : $managerId")
}

}

fun main() {
    val employee= Employee.Builder()
                                    .setFirstName("Doug")
                                    .setLastName("Sigelbaum")
                                    .setIsManager(false)
                                    .setManagerId("xxx").build()
    employee.showData()

}