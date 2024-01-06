package com.petra.buttonnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    private val arrayList: ArrayList<data> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Add Data To RecyclerView as ArrayList
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Mohamed"))
        arrayList.add(data(R.drawable.person, "Salah"))
        arrayList.add(data(R.drawable.person, "Salah"))
        arrayList.add(data(R.drawable.person, "Salah"))
        arrayList.add(data(R.drawable.person, "Salah"))
        arrayList.add(data(R.drawable.person, "Salah"))
        arrayList.add(data(R.drawable.person, "Salah"))

        // RecyclerView and layoutManager
        val recycler : RecyclerView = view.findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)

        // Put the ArrayList From the Adapter to the RecyclerView
        val adapter = Adapter(arrayList)
        recycler.adapter = adapter



        return view
    }

}