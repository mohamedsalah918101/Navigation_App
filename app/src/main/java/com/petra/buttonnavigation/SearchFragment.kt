package com.petra.buttonnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker

class SearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_search, container, false)

//        val timeP = view.findViewById<TimePicker>(R.id.timeP)
//        timeP.setOnTimeChangedListener { view, hourOfDay, minute ->
//        val timePtxt = view.findViewById<TextView>(R.id.timePicker)
//        timePtxt.text = hourOfDay.toString() + ":" + minute}

        return view
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val timeP = requireActivity().findViewById<TimePicker>(R.id.timePicker)
        timeP.setOnTimeChangedListener { _, hourOfDay, minute ->
            val timePtxt = requireActivity().findViewById<TextView>(R.id.timePickerText)
            timePtxt.text = hourOfDay.toString() + ":" + minute

        }

    }

}

