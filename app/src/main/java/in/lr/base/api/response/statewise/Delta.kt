package `in`.lr.base.api.response.statewise

import java.io.Serializable

data class Delta(val confirmed:Long,
                 val deceased:Long,
                 val recovered:Long):Serializable {
}