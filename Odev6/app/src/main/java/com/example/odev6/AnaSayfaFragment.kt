package com.example.odev6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.odev6.databinding.FragmentAnaSayfaBinding


class AnaSayfaFragment : Fragment() {

private lateinit var binding: FragmentAnaSayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentAnaSayfaBinding.inflate(inflater, container, false)
        val filmlerListesi = ArrayList<Gorseller>()
               val f1 = Gorseller("resim1")
               val f2 = Gorseller("resim2")
               val f3 = Gorseller("resim3")
               val f4 = Gorseller("resim4")
               val f5 = Gorseller("resim5")
               val f6 = Gorseller("resim6")
               val f7 = Gorseller("resim7")
               filmlerListesi.add(f1)
               filmlerListesi.add(f2)
               filmlerListesi.add(f3)
               filmlerListesi.add(f4)
               filmlerListesi.add(f5)
               filmlerListesi.add(f6)
               val adapter= Adapter(requireContext(),filmlerListesi)
               binding.rwGorsel.adapter=adapter
               binding.rwGorsel.layoutManager=StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)


        return binding.root
    }

}