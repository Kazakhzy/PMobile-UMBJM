package com.example.umbjm

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView


class ProfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_profil, container, false)

        val akreditasiCardView = view.findViewById<CardView>(R.id.cardakre)
        akreditasiCardView.setOnClickListener {
            val fragment = AkreditasiFragment()
            replaceFragment(fragment)
        }

        val fakultasCardView = view.findViewById<CardView>(R.id.cardfkt)
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
