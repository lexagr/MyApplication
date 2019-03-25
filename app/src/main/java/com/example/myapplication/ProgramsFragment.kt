package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.TextView
import android.support.annotation.Nullable
import android.widget.ArrayAdapter
import android.widget.Button




@Suppress("UNREACHABLE_CODE")
class ProgramsFragment : Fragment() {
    internal class Item(var name: String, var price: String)

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_programs, container, false)

        val items = view?.findViewById<ListView>(R.id.items)
        val adapter = ItemsAdapter()

        if (items != null) {
            items.adapter = adapter
        }
        view?.findViewById<Button>(R.id.add)?.setOnClickListener(View.OnClickListener {
            adapter.add(
                Item(
                    "Hello",
                    "world"
                )
            )
        })
    }

    @Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS",
        "RECEIVER_NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS"
    )
    private inner class ItemsAdapter internal constructor() : ArrayAdapter<Item>(activity?.applicationContext, R.layout.item) {

        @SuppressLint("ViewHolder", "InflateParams")
        override fun getView(position: Int, @Nullable convertView: View?, parent: ViewGroup): View {
            val view = layoutInflater.inflate(R.layout.item, null)
            val item = getItem(position)
            (view.findViewById(R.id.name) as TextView).text = item.name
            (view.findViewById(R.id.price) as TextView).text = item.price
            return view
        }
    }
}