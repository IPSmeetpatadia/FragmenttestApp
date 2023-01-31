package com.example.testapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testapp.R
import com.example.testapp.adapters.ChatAdapter
import com.example.testapp.dataclass.ChatDataClass

class ChatFragment : Fragment() {

    var chatList = arrayListOf<ChatDataClass>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        chatList = ArrayList<ChatDataClass>()
        chatList.add(ChatDataClass(R.drawable.img_3,"Manan", "ghare reje me aayo"))
        chatList.add(ChatDataClass(R.drawable.img_2,"Hiral Suthar", "bhai tamari jode che?"))
        chatList.add(ChatDataClass(R.drawable.img_5,"Hardev Parmar", "Kya?"))
        chatList.add(ChatDataClass(R.drawable.img_4,"Rumit Parmar", "* image"))
        chatList.add(ChatDataClass(R.drawable.img_12,"God Father", "Nikale atle phone karje"))
        chatList.add(ChatDataClass(R.drawable.img_7,"Dhruv Mistry", "aje ketala vagse"))
        chatList.add(ChatDataClass(R.drawable.img_8,"The Motherland", "jami lidhu?"))
        chatList.add(ChatDataClass(R.drawable.img_9,"Maharshi Pandya", "Aaje match che!!"))
        chatList.add(ChatDataClass(R.drawable.img_11,"Krishi Panara", "Zebruuuuuu"))
        chatList.add(ChatDataClass(R.drawable.img_6,"Nidhi", "Joine kau"))
        chatList.add(ChatDataClass(R.drawable.img,"Jayesh Shiyaliya", "40 Gpay"))
        chatList.add(ChatDataClass(R.drawable.img_1,"Dhruv Mistry", "aje ketala vagse"))
        chatList.add(ChatDataClass(R.drawable.img_10,"Meet Chudasma", "kale surat thi aais"))

        var recyclerView = view?.findViewById<RecyclerView>(R.id.recycleView)

        recyclerView?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerView?.adapter = context?.let { ChatAdapter(it, chatList) }

    }

}