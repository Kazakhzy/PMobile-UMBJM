package com.example.umbjm

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

class BerandaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_beranda, container, false)

        val profilCardView = view.findViewById<CardView>(R.id.card1)
        profilCardView.setOnClickListener {
            val fragment = ProfilFragment()
            replaceFragment(fragment)
        }

        val akreditasiCardView = view.findViewById<CardView>(R.id.car2)
        akreditasiCardView.setOnClickListener {
            val fragment = AkreditasiFragment()
            replaceFragment(fragment)
        }

        val fakultasCardView = view.findViewById<CardView>(R.id.card2)
        fakultasCardView.setOnClickListener {
            val fragment = FakultasFragment()
            replaceFragment(fragment)
        }

        return view
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager: FragmentManager = requireActivity().supportFragmentManager
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}



