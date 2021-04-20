data class Post(
    val id: Int,
    val type: Types? = null,
    val icon: Int,
    val dateForPost: String,
    val author: String,
    val content: String? = null,
    val linkVideo: String? = null,
    val linkPromo: String? = null,
    val linkLocation: String? = null,
    var likedByMe: Boolean = false,
    var registeredLikes: Int = 0,
    var commentedByMe: Boolean = false,
    var registeredComments: Int = 0,
    var sharedByMe: Boolean = false,
    var registeredShares: Int = 0,

    val rePostId: Int? = null,
    val rePostIcon: Int? = null,
    val rePostDateForPost: String? = null,
    val rePostAuthor: String? = null,
    val rePostText: String? = null,
    val rePostLinkVideo: String? = null
) {
}