package `in`.lr.base.api.response.statewise

data class Details(val notes:String,
                   val active:Long,
                   val confirmed:Long,
                   val deceased:Long,
                   val recovered:Long,
                   val delta: Delta) {
}