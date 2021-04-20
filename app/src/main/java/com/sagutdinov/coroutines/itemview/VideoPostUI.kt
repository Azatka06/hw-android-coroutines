package com.sagutdinov.coroutines.itemview

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagutdinov.coroutines.R

class VideoPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val icon: ImageView = itemView.findViewById(R.id.iconPostWithVideo)
    val date: TextView = itemView.findViewById(R.id.datePostWithVideo)
    val author: TextView = itemView.findViewById(R.id.authorPostWithVideo)
    val text: TextView = itemView.findViewById(R.id.textPostWithVideo)
    val textForLikes: TextView = itemView.findViewById(R.id.forBtnLikePostWithVideo)
    val textForComments: TextView = itemView.findViewById(R.id.forBtnCommentPostWithVideo)
    val textForShares: TextView = itemView.findViewById(R.id.forBtnSharePostWithVideo)
    val btnLikes: Button = itemView.findViewById(R.id.btnLikePostWithVideo)
    val btnComments: Button = itemView.findViewById(R.id.btnCommentPostWithVideo)
    val btnShares: Button = itemView.findViewById(R.id.btnSharePostWithVideo)
    val imageBtnLinks: ImageButton = itemView.findViewById(R.id.videoLinkPostWithVideo)
}