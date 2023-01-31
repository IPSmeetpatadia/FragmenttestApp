package com.example.testapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.dataclass.ChatDataClass

class ChatAdapter(var context: Context, var chatList: ArrayList<ChatDataClass>) : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {

    class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var personProfile: ImageView = itemView.findViewById(R.id.imgV_chatProfile)
        var personName: TextView = itemView.findViewById(R.id.txt_chatName)
        var personMessage: TextView = itemView.findViewById(R.id.txt_chatMsg)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item, parent, false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return chatList.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.personProfile.setImageResource(chatList[position].personProfileImage)
        holder.personName.text = chatList[position].personName
        holder.personMessage.text = chatList[position].personMessage
    }
}