package com.sagutdinov.coroutines.itemview

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sagutdinov.coroutines.R

open class StandardPostUI(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val icon: ImageView = itemView.findViewById(R.id.icon)
    val date: TextView = itemView.findViewById(R.id.date)
    val author: TextView = itemView.findViewById(R.id.author)
    val text: TextView = itemView.findViewById(R.id.text)
    val textForLikes: TextView = itemView.findViewById(R.id.forBtnLike)
    val textForComments: TextView = itemView.findViewById(R.id.forBtnComment)
    val textForShares: TextView = itemView.findViewById(R.id.forBtnShare)
    val btnLikes: Button = itemView.findViewById(R.id.btnLike)
    val btnComments: Button = itemView.findViewById(R.id.btnComment)
    val btnShares: Button = itemView.findViewById(R.id.btnShare)

}