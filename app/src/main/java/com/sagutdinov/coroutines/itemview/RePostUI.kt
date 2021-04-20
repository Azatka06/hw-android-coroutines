package com.sagutdinov.coroutines.itemview

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagutdinov.coroutines.R

class RePostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val icon: ImageView = itemView.findViewById(R.id.iconRePostUser)
    val date: TextView = itemView.findViewById(R.id.dateRePostUser)
    val author: TextView = itemView.findViewById(R.id.authorRePostUser)
    val textForLikes: TextView = itemView.findViewById(R.id.forBtnLikeRePostUser)
    val textForComments: TextView = itemView.findViewById(R.id.forBtnCommentRePostUser)
    val textForShares: TextView = itemView.findViewById(R.id.forBtnShareRePostUser)
    val btnLikes: Button = itemView.findViewById(R.id.btnLikeRePostUser)
    val btnComments: Button = itemView.findViewById(R.id.btnCommentRePostUser)
    val btnShares: Button = itemView.findViewById(R.id.btnShareRePostUser)

    val iconRePost: ImageView = itemView.findViewById(R.id.iconRePost)
    val dateRePost: TextView = itemView.findViewById(R.id.dateRePost)
    val authorRePost: TextView = itemView.findViewById(R.id.authorRePost)
    val textRePost: TextView = itemView.findViewById(R.id.textRePost)
    val imageBtnLinksRePost: ImageButton = itemView.findViewById(R.id.linkRePost)
}