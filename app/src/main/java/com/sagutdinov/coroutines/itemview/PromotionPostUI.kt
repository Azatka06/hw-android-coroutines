package com.sagutdinov.coroutines.itemview

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagutdinov.coroutines.R

class PromotionPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val icon: ImageView = itemView.findViewById(R.id.iconPromoPost)
    val date: TextView = itemView.findViewById(R.id.datePromoPost)
    val author: TextView = itemView.findViewById(R.id.authorPromoPost)
    val text: TextView = itemView.findViewById(R.id.textPromoPost)
    val textForLikes: TextView = itemView.findViewById(R.id.forBtnLikePromoPost)
    val textForComments: TextView = itemView.findViewById(R.id.forBtnCommentPromoPost)
    val textForShares: TextView = itemView.findViewById(R.id.forBtnSharePromoPost)
    val btnLikes: Button = itemView.findViewById(R.id.btnLikePromoPost)
    val btnComments: Button = itemView.findViewById(R.id.btnCommentPromoPost)
    val btnShares: Button = itemView.findViewById(R.id.btnSharePromoPost)
    val imageBtnLinks: ImageButton = itemView.findViewById(R.id.linkPromoPost)

}