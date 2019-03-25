package com.example.myapplication

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.prolificinteractive.materialcalendarview.MaterialCalendarView

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val materialCalendarView = view?.findViewById<MaterialCalendarView>(R.id.calendarView)
        Log.d("ADebugTag", materialCalendarView.toString())
        materialCalendarView?.topbarVisible = false

        return inflater.inflate(R.layout.fragment_home, container, false)
    }
}