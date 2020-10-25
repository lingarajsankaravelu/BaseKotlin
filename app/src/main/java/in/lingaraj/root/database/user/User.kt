package `in`.lingaraj.root.database.user

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(@PrimaryKey(autoGenerate = true) var id:Long) {
    constructor(name: String) : this(0) {
        this.name = name
    }

    var name: String = ""
}
