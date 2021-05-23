package com.example.esiea3a.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.esiea3a.R
import retrofit2.Retrofit


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ColorListFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    private val adapter = ColorAdapter(listOf())
    private val layoutManager = LinearLayoutManager(context)

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        //Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_list,container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.color_recyclerview)

        recyclerView.apply {
            layoutManager = this@ColorListFragment.layoutManager
            adapter = this@ColorListFragment.adapter
        }

        val retrofit = Retrofit.Builder()
            .baseUrl("https://pokeapi.co/api/v2")
            .build()

        val ColorApi: ColorApi = retrofit.create(ColorApi::class.java)



        val colorList : ArrayList<Color> = arrayListOf<Color>().apply {
            add(Color("Red"))
            add(Color("Orange"))
            add(Color("Pink"))
            add(Color("Purple"))
        }

        adapter.updateList(colorList)
    }
}