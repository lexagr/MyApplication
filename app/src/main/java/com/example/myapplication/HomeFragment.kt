package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.RelativeLayout
import com.prolificinteractive.materialcalendarview.MaterialCalendarView

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //val materialCalendarView = view?.findViewById<MaterialCalendarView>(R.id.calendarView)
        val materialCalendarView = inflater.inflate(R.layout.fragment_home, container, false)
        Log.d("ADebugTag", materialCalendarView.toString())
        setMonthBarVisible(materialCalendarView, false)

        return materialCalendarView
    }

    private fun setMonthBarVisible(view: View, visible: Boolean) {
        val calendarView = view.findViewById<MaterialCalendarView>(R.id.calendarView)
        val header = calendarView.findViewById<LinearLayout>(R.id.header)

        if(visible) {
            header.visibility = View.VISIBLE
        }else{
            header.visibility = View.INVISIBLE
            header.layoutParams.height = 0
        }
    }
}
