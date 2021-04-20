package com.sagutdinov.coroutines.itemview

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagutdinov.coroutines.R

class EventPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val icon: ImageView = itemView.findViewById(R.id.iconEventPost)
    val date: TextView = itemView.findViewById(R.id.dateEventPost)
    val author: TextView = itemView.findViewById(R.id.authorEventPost)
    val text: TextView = itemView.findViewById(R.id.textEventPost)
    val textForLikes: TextView = itemView.findViewById(R.id.forBtnLikeEventPost)
    val textForComments: TextView = itemView.findViewById(R.id.forBtnCommentEventPost)
    val textForShares: TextView = itemView.findViewById(R.id.forBtnShareEventPost)
    val btnLikes: Button = itemView.findViewById(R.id.btnLikeEventPost)
    val btnComments: Button = itemView.findViewById(R.id.btnCommentEventPost)
    val btnShares: Button = itemView.findViewById(R.id.btnShareEventPost)
    val btnLocation: Button = itemView.findViewById(R.id.btnMapEventPost)
}